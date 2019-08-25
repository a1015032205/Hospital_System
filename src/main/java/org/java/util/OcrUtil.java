package org.java.util;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.util.Base64Util;
import org.java.ocr.AuthService;
import org.java.ocr.FileUtil;
import org.java.ocr.HttpUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.io.File;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019-08-05-15:04
 * 扫描身份证
 */
@Controller
public class OcrUtil {
    // 身份证识别url
    final static String idcardIdentificate = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard";


    /**
     * 扫描身份证正面信息
     *
     * @param model
     * @param myfile
     * @param request
     * @return
     * @throws Exception
     */
    public static Map<String, Object> getIdCard(@RequestParam(value = "myfile") MultipartFile myfile, HttpServletRequest request) throws Exception {
        //String filePath = myfile.getOriginalFilename();
        String fileName = myfile.getOriginalFilename();
        String path = request.getSession().getServletContext().getRealPath("upload");
        //文件为空则失败
        if (myfile.isEmpty()) {
            System.out.println("没有文件上传");
            return null;
        } else {
            //获得上传的文件名称
            //在指定目录中，产生一个指定名称的新文件（文件是空的，没有内容）
            File newFile = new File(path, fileName);
            //文件上级目录不存在，则新建
            if (!newFile.getParentFile().exists()) {
                newFile.getParentFile().mkdirs();
            }
            //将上传文件中的数据，写入到新文件中
            myfile.transferTo(newFile);
        }
        byte[] imgData = FileUtil.readFileByBytes(path + "/" + fileName);
        String imgStr = Base64Util.encode(imgData);
        // 识别身份证正面id_card_side=front;识别身份证背面id_card_side=back;
        String params = "id_card_side=front&" + URLEncoder.encode("image", "UTF-8") + "="
                + URLEncoder.encode(imgStr, "UTF-8");
        /**
         * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
         */
        //#####调用鉴权接口获取的token#####
        String accessToken = AuthService.getAuth();
        String result = HttpUtil.post(idcardIdentificate, accessToken, params);
        Map<String, Object> map = JSON.parseObject(result);
        Map<String, Object> m = (Map<String, Object>) map.get("words_result");
        String name = (String) ((Map<String, Object>) m.get("姓名")).get("words");
        String gender = (String) ((Map<String, Object>) m.get("性别")).get("words");
        String bir = (String) ((Map<String, Object>) m.get("出生")).get("words");
        String one = bir.substring(0, 4);
        String two = bir.substring(4, 6);
        String three = bir.substring(6, 8);
        bir = one + "-" + two + "-" + three;
        String add = (String) ((Map<String, Object>) m.get("住址")).get("words");
        String ethnic = (String) ((Map<String, Object>) m.get("民族")).get("words");
        String IdCard = (String) ((Map<String, Object>) m.get("公民身份号码")).get("words");
        Map<String, Object> info = new HashMap<>(16);
        info.put("name", name);
        info.put("gender", gender);
        info.put("bir", bir);
        info.put("add", add);
        info.put("ethnic", ethnic);
        info.put("IdCard", IdCard);
        //int count = 1;

            /*for (int i = 0; i < result.length(); i++) {
                System.out.print(result.charAt(i));
                count++;
                if (count % 120 == 0) {
                    System.out.print("\n");
                }
            }*/
        //  model.addAttribute("map", info);
        return info;
    }

    public static int getGray(Color pixel) {
        return (pixel.getRed() * 30 + pixel.getGreen() * 60 + pixel.getBlue() * 10) / 100;
    }
}
