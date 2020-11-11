package com.yicheng.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 17:24
 */
public class TestInetAddress {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress);

            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);

            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);
            // System.out.println(inetAddress2.getAddress());
            // System.out.println(inetAddress2.getCanonicalHostName());
            System.out.println(inetAddress2.getHostAddress()); // ip
            System.out.println(inetAddress2.getHostName()); // 域名
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
