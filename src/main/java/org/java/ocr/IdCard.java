package org.java.ocr;

import com.alibaba.fastjson.JSON;
import com.baidu.aip.util.Base64Util;

import java.awt.*;
import java.net.URLEncoder;
import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019-08-05-14:16
 */
public class IdCard {

    public static void main(String[] args) {
        // 身份证识别url
        String idcardIdentificate = "https://aip.baidubce.com/rest/2.0/ocr/v1/idcard";
        // 本地图片路径
        String filePath = "D:/project_d102/ID1.jpg";//#####本地文件路径#####



        try {
            byte[] imgData = FileUtil.readFileByBytes(filePath);
            String imgStr = Base64Util.encode(imgData);
            // 识别身份证正面id_card_side=front;识别身份证背面id_card_side=back;
            String params = "id_card_side=front&" + URLEncoder.encode("image", "UTF-8") + "="
                    + URLEncoder.encode(imgStr, "UTF-8");
            /**
             * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
             */
            String accessToken = AuthService.getAuth();//#####调用鉴权接口获取的token#####
            String result = HttpUtil.post(idcardIdentificate, accessToken, params);
            Map<String, Object> map = JSON.parseObject(result);
            // System.out.println(result);
            Map<String, Object> m = (Map<String, Object>) map.get("words_result");
            String name = (String) ((Map<String, Object>) m.get("姓名")).get("words");
            System.out.println(name);
          /*  int count = 1;
            for (int i = 0; i < result.length(); i++) {
                System.out.print(result.charAt(i));
                count++;
                if (count % 120 == 0) {
                    System.out.print("\n");
                }
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getGray(Color pixel) {
        return (pixel.getRed() * 30 + pixel.getGreen() * 60 + pixel.getBlue() * 10) / 100;
    }

}
