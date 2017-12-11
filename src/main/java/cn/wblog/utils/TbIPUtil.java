package cn.wblog.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * 阿里巴巴淘宝IP接口工具类
 */
public class TbIPUtil {

    /**
     *1. 请求接口（GET）：/service/getIpInfo.php?ip=[ip地址字串]
     *2. 响应信息：（json格式的）国家 、省（自治区或直辖市）、市（县）、运营商
     *3. 返回数据格式：
     {"code":0,
     "data":{"ip":"210.75.225.254",    //ip
            "country":"\u4e2d\u56fd",  //国家
             "area":"\u534e\u5317",    //地区
             "region":"\u5317\u4eac\u5e02", //注册商
             "city":"\u5317\u4eac\u5e02", //城市
             "county":"",//县城
             "isp":"\u7535\u4fe1",
             "country_id":"86",//国家代码
             "area_id":"100000",//地区代码
             "region_id":"110000",//注册商代码
             "city_id":"110000",//城市代码
             "county_id":"-1",//县城代码
             "isp_id":"100017"}
     }
     其中code的值的含义为，0：成功，1：失败。
     */


    //淘宝接口
    private static final String TB_INTERFACE ="http://ip.taobao.com/service/getIpInfo.php?ip=";

    /**
     * 私有构造器，不可实例化对象
     */
    private TbIPUtil(){}

    /**
     *获得接口数据
     */
    public static String getConnection(String ip) throws Exception{
        String url = TB_INTERFACE+ip;
        //声明淘宝ip完整参数
        URL url_taobao_ip = new URL(url);
        //打开链接
        URLConnection conn = url_taobao_ip.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String result = br.readLine();
        return result;
    }

    /**
     * 根据ip获取地址
     * @param ip encoding
     * @return
     * @throws Exception
     */
    public static String getAddress(String ip, String encoding) throws Exception {

        //获得的结果(string)
        String returnStr = TbIPUtil.getConnection(ip);

        //声明结果
        StringBuffer addressbuffer = new StringBuffer();

        //声明json对象
        JSONObject json = null;

        if (returnStr != null) {

            //string转换成json对象
            json = JSON.parseObject(returnStr);

            //json对象操作
            if ("0".equals(json.get("code").toString())) {

                addressbuffer.append(decodeUnicode(json.getJSONObject("data").getString("region")));// 省份
                addressbuffer.append(decodeUnicode(json.getJSONObject("data").getString("city")));// 市区
                addressbuffer.append(decodeUnicode(json.getJSONObject("data").getString("county")));// 地区
                addressbuffer.append(decodeUnicode(json.getJSONObject("data").getString("isp")));// ISP公司

                System.out.println(addressbuffer.toString());

            } else {
                return "获取地址失败...";
            }
        }
        return addressbuffer.toString();
    }
//

    /**
     * 字符转码
     *
     * @param theString
     * @return
     */
    public static String decodeUnicode(String theString) {

        char aChar;
        int len = theString.length();
        StringBuffer buffer = new StringBuffer(len);
        for (int i = 0; i < len;) {
            aChar = theString.charAt(i++);
            if (aChar == '\\') {
                aChar = theString.charAt(i++);
                if (aChar == 'u') {
                    int val = 0;
                    for (int j = 0; j < 4; j++) {
                        aChar = theString.charAt(i++);
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                val = (val << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                val = (val << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                val = (val << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed      encoding.");
                        }
                    }
                    buffer.append((char) val);
                } else {
                    if (aChar == 't') {
                        aChar = '\t';
                    }
                    if (aChar == 'r') {
                        aChar = '\r';
                    }
                    if (aChar == 'n') {
                        aChar = '\n';
                    }
                    if (aChar == 'f') {
                        aChar = '\f';
                    }
                    buffer.append(aChar);
                }
            } else {
                buffer.append(aChar);
            }
        }
        return buffer.toString();
    }

}
