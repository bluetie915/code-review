package com.yicheng.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 20:50
 */
public class TalkReceive implements Runnable {

    DatagramSocket socket = null;
    private int port;
    private String msgFrom;

    public TalkReceive(int port, String msgFrom) throws SocketException {
        this.port = port;
        this.msgFrom = msgFrom;
        socket = new DatagramSocket(port);
    }

    @Override
    public void run() {
        while (true) {
            // 准备接收包裹
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container, 0, container.length);
            try {
                socket.receive(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 断开连接
            byte[] data = packet.getData();
            String receiveData = new String(data, 0, data.length);
            System.out.println(this.msgFrom + ":" + receiveData);

            if (receiveData.equals("bye"))
                break;
        }
        socket.close();
    }
}
