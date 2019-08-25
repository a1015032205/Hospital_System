package org.java.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 秒度
 * @Date 2019-08-25 09:01
 * @Description：地址解析为坐标
 */

public class GetPoint {
    public static String MAP_AK = "0IO5w8OVgwGeAa3Vgc7KAWHbzivG66hO";

    public static String MAP_URL = "http://api.map.baidu.com/geocoder/v2/?output=json&ak=" + MAP_AK;

    public static void main(String[] args) {
       /* Map<String, Object> map = getPosition("武汉市徐东大街8号");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry);
        }*/
    }

    /**
     * 高德
     *
     * @param address
     * @return
     */
    public static String getLngLat(String address) {
        StringBuffer json = new StringBuffer();
        try {
            URL u = new URL("http://restapi.amap.com/v3/geocode/geo?address=" + address + "&output=JSON&key=7f4ffae4074e8b8e4d147190527a4b72");
            URLConnection yc = u.openConnection();
            //读取返回的数据
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream(), "UTF-8"));
            String inputline = null;
            while ((inputline = in.readLine()) != null) {
                json.append(inputline);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String jsonStr = json.toString();
        JSONObject jsonObject = JSON.parseObject(jsonStr);

//判断输入的位置点是否存在
        if (jsonObject.getJSONArray("geocodes").size() > 0)
            return jsonObject.getJSONArray("geocodes").getJSONObject(0).get("location").toString();
        else
            return null;
    }


    /**
     * 百度
     * 将地址解析成经纬度
     *
     * @param address 地址，例：浙江省杭州市西湖区
     * @return 返回经纬度数据。例：{"lng":120.08899292561351,"lat":30.207036169515438}
     */
    public static Map<String, Object> getPosition(String address) {
        BufferedReader in = null;
        URL url = null;
        URLConnection connection = null;
        Map<String, Object> map = new HashMap<>(16);
        try {
            url = new URL(MAP_URL + "&address=" + address);
            connection = url.openConnection();
            connection.setDoOutput(true);
            in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String line;
            StringBuilder text = new StringBuilder("");
            while ((line = in.readLine()) != null) {
                text.append(line.trim());
            }
            JSONObject result = JSONObject.parseObject(text.toString());
            if (result != null && result.getIntValue("status") == 0) {
                JSONObject jsonObject = result.getJSONObject("result").getJSONObject("location");
                 map = JSON.parseObject(String.valueOf(jsonObject));
                return map;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


    /**
     * 百度
     * 将经纬度获取解析成详细地址
     *
     * @param lng 经度
     * @param lat 纬度
     * @return
     */
    public static String getAddress(double lng, double lat) {
        String address = "";
        String location = lat + "," + lng;
        BufferedReader in = null;
        URL url = null;
        URLConnection connection = null;
        try {
            url = new URL(MAP_URL + "&location=" + location);
            connection = url.openConnection();
            connection.setDoOutput(true);
            in = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String line;
            StringBuilder text = new StringBuilder("");
            while ((line = in.readLine()) != null) {
                text.append(line.trim());
            }
            JSONObject result = JSONObject.parseObject(text.toString());
            if (result != null && result.getIntValue("status") == 0) {
                address = result.getJSONObject("result").getString("formatted_address");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return address;
    }


}
