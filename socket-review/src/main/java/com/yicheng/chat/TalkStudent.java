package com.yicheng.chat;

import java.net.SocketException;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 21:07
 */
public class TalkStudent {

    public static void main(String[] args) throws SocketException {
        // 开启两个线程
        new Thread(new TalkSend(7777, "localhost",9999)).start();
        new Thread(new TalkReceive(8888, "老师")).start();
    }
}
