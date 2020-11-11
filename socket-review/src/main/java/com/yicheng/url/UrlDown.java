package com.yicheng.url;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author 张艺成
 * @date 2020/11/11 0011 22:23
 */
public class UrlDown {
    public static void main(String[] args) throws IOException {
        // 1.下载地址
        URL url = new URL("https://m10.music.126.net/20201111225004/56ca4d5533b29f24ee7d6aa3ccac8c3d/yyaac/obj/wonDkMOGw6XDiTHCmMOi/3494140376/a72f"
                + "/0be9/181a/f72e92aacfb08514cf103b859f81249e.m4a");
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        FileOutputStream fos = new FileOutputStream("f.m4a");
        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read(buffer)) != -1)
            fos.write(buffer, 0, len);
        fos.close();
        inputStream.close();
        urlConnection.disconnect();
    }

}
