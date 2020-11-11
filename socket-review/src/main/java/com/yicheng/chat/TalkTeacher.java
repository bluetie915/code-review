package com.yicheng.chat;

import java.applet.Applet;
import java.awt.*;
import java.net.SocketException;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 21:09
 */
public class TalkTeacher extends Applet {

    public static void main(String[] args) throws SocketException {
        new Thread(new TalkSend(5555, "localhost", 8888)).start();
        new Thread(new TalkReceive(9999, "学生")).start();
    }

}
