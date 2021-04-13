package com.lemon.algorithm;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author lemon
 * @Date 2021/4/13
 */
@SpringBootTest
public class IpTest {

    /**
     * ip转int存储并且可以转回ip
     */
    @Test
    public void ipTest() {
        String ip = "172.0.0.1";
        int intIP = ipToInt(ip);
        System.out.println(intIP);

        System.out.println(intToIp(intIP));
    }

    /**
     * ip转int
     * ipv4的地址是用32位来表示的,分成4个8位
     * 1、判断ip是否为空
     * 2、判断ip拆分后长度是否为4
     * 3、遍历数组然后元素转int
     * @param ip
     * @return
     */
    private int ipToInt(String ip) {
        if(ip == null && ip.length() == 0) {
            return -1;
        }
        String[] ipArr = ip.split("\\.");
        if(ipArr.length != 4) {
            return -1;
        }
        int ipInt = 0;
        for (int i=0; i< ipArr.length; i++) {
            ipInt = ((ipInt << 8) | Integer.valueOf(ipArr[i]));
        }
        return ipInt;
    }

    /**
     * int转ip
     * @param ipInt
     * @return
     */
    private String intToIp(int ipInt) {
        String[] ipArr = new String[4];
        for (int i=0; i< ipArr.length; i++) {
            int tmp = (ipInt >>> (8 * i)) & (0xFF);
            ipArr[3-i] = String.valueOf(tmp);
        }
        return String.join(".", ipArr);
    }

}
