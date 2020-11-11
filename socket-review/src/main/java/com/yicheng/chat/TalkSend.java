package com.yicheng.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 20:35
 */
public class TalkSend implements Runnable {

    DatagramSocket socket = null;
    BufferedReader reader = null;

    private int fromPort;
    private String toIP;
    private int toPort;

    public TalkSend(int fromPort, String toIP, int toPort) throws SocketException {
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;
        socket = new DatagramSocket(fromPort);
        reader = new BufferedReader(new InputStreamReader(System.in));
    }


    @Override
    public void run() {
        while (true) {
            String data = null;
            try {
                data = reader.readLine();
                byte[] datas = data.getBytes();
                DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress(this.toIP, this.toPort));
                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (data.equals("bye")) {
                break;
            }
        }
        socket.close();
    }


}
