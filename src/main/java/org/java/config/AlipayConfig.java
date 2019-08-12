package org.java.config;


import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092900622242";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQDWWwu8N4mcpAgHzLC2BmyNAloQaE6I573FD96jri56v+iD/9QnOHoOhOoL7lh06PclCivx9B+RJhLa5Byb8Xpe3mNzlzvxMUJAOXehrjkKWutmwlfjSJJir3k1aGZ3OgaMHF0iFx136qaFJoVa+fusEUM/D3alXPwZYtRY8D8cKfeFbJgGEOEuWVXb6BGBxuDh3fu3IKSbcik/5WGnD1eWxrAIm+TwVhvRMoT+3g6qE3Eo2X8NWqQesBu1r0y9Z7wwynfbbKBN5IocZPnRSUhVTysncFc+axIv8m5Ra3D2EC8QAuGLptr86rc0cbS7OFE8wzRDd19lrE+Pto8PNop9AgMBAAECggEBALcRTOVzPRjFUoJuw2DB/cU0A/1NR/1OhdkeI5QA93soGQla3TKd3kg2JbkI1w0JxcEhfcSHLMqHDMVa2kAorM0G+0LGH5Bu9Fjre4tewyJf4fmB8xOOcE7N9COzxQcATIUu2C98NFOs2IiRDIVVSCZ9G8RojXjPABMiP56xmASRFlXf2m9oBpkgpV2kXAh869K1dFMU+ysH+NdScODUT1TPXLfGBOCqldQJILkPSrlfvuAkRTc9a4B5z8Lzcqu0x4ZEtbPtXPEpmoaUkfcD/fjPCx9xmAYDxk6xB2ErBthOtE6BNH6r/p3ai2qxZqwS1KhtqrCbFjLZW0dtXLQ9hIECgYEA9eBJ+tcPqoxaS+AZLUIfTdg57VGg6jP8gwo/q/3a1cTiutRZv++6NfCOjO3XfLN7cd56WrqGJ6RSich5jIFedHcgycmoSBW+VXivt0Ckysyn0bXz7rVY7ax+2xZAbJ9ej17GyCzURTjDs0KpVCp4tpewkhw782ipdd7CNUOZtl0CgYEA3y6CIubmuymV2Trusddugp++ETh7c1PITrh6vzy8lNd9fRdNiO6glEq2LaupPinmg7PUOr3yCL48EgkBBEq61FB8vhan83l3E4wWqT57znams0G5HT0iDtc4EdeSXczzkOUnd3oSL9qDUWaPzot2oowSKD30rNvZO5gnBfR0oqECgYEA1+KKMnP4bm/zrKFkmcdwAwKywfwlRN5GfaxXAaXQKlhIF3DyKMPNhSTllToUNYrF/dIxLk6OEmqGijH6/3Jrw+kBYgvs9PYae6OO7WEWEHand0vClbqnDXCipa0g/f7koQ+/i+1IqErSEiia0qrD+Naxk2i0/uDLwhHIBcqIQYUCgYEAhKpTx0V0UDtHDQsgCm0iDtnAFOJ7V7Gs90ZoCLek7eEugiZQ+53FrIDAzGMnRoGHujAybvysHBBhCuN5TEDT0BNMI366NVu1sdPrQI2Y8MDNFO9zh3LohOPgO5LmOYX0HuRo0neoyfNdbgzGXSO/0J3sySkTAZHqDqfCQqLuliECgYEAvLxLhRqjczaAsiQX28vB4k63dANAMSuyHsKPI1PgtFvacuLy9EYjpCbDj5u0iIoxIkKOlRMtCb+52B3UU7y7dKM6tLvh1qempiIEQZyZOblV3+fBM/6n7CMSVvkvQUkCb3N0PdujvT4W3g1PzM6QTr6QvJsOEb2zzBj9/3rEU9U=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlY26BdreLIgnPIm9TLL90auTzuDdotkFbHP8kBux5sJnUElNCb/z3QEiYpB2QRoeQ6VTBeTk9CS6ZIzZb7ERpnIUefT6JwiO0cbxAy6OsVvzzJ3az4KISsHLTI46Fk/DfDtXgi3vHzwsNsA8xQhQQq/RezWWBkTWT58eFrJtDLAcsk9J9QvyrzwkSPRfQ2oUNFhKw5BVGzs/EcZM2kQANDW+38CPYe1QmQRnDfqThxrlbbaOqcB9h1bbvAs+UMSKAyZSvu+WFLZ08Tv084EsZGhWPFK0jlrvXkQ+RVYTLg4vUK2pIC9MktXxrPHxpuKlUFHhqHx2jCPo63eJ6m6SMwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8888/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:9999/upDatePayTime.do";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

