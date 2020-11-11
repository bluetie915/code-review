package com.yicheng.downloader;

/**
 * @author 张艺成
 * @date 2020/11/10 0010 15:09
 */
// 多线程下载
public class TestThreadDownload extends Thread {

    // 网络图片地址
    private String url;
    // 保存的文件名
    private String name;

    public TestThreadDownload(String url, String name) {
        this.url = url;
        this.name = name;
    }

    // 下载图片线程的执行体
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件各为：" + name);
    }

    public static void main(String[] args) {
        TestThreadDownload t1 = new TestThreadDownload("https://tse1-mm.cn.bing.net/th/id/OET" +
                ".05e05fa5be264402a10c1e913b91e455?w=135&h=272&c=7&rs=1&o=5&pid=1.9", "1.jpg");
        TestThreadDownload t2 = new TestThreadDownload("https://tse1-mm.cn.bing.net/th/id/OET" +
                ".da024c1a206b4ae6be54f3b09dfee462?w=135&h=272&c=7&rs=1&o=5&pid=1.9", "2.jpg");
        TestThreadDownload t3 = new TestThreadDownload("https://tse1-mm.cn.bing.net/th/id/OET" +
                ".86bda913df50494f81e863a52af69d59?w=135&h=272&c=7&rs=1&o=5&pid=1.9", "3.jpg");
        t1.start();
        t2.start();
        t3.start();
    }
}