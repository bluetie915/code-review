package com.yicheng.checkcode.controller;

import com.yicheng.checkcode.annotation.CheckToken;
import com.yicheng.checkcode.service.CaptchaService;
import com.yicheng.checkcode.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author 张艺成
 * @date 2020/11/24 0024 9:29
 */
@RestController
@Api(value = "测试controller的value", tags = "测试controller的tags")
public class TestController {

    @Autowired
    CaptchaService captchaService;

    @GetMapping("/getCaptcha")
    @ApiOperation(value = "获取验证码", response = BufferedImage.class)
    public void getCaptcha(HttpServletResponse response, String uuid) throws IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
        BufferedImage image = captchaService.getCaptcha(uuid);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        IOUtils.closeQuietly(out);
    }

    @GetMapping("/testInterceptor")
    @ApiOperation(value = "测试拦截器", response = String.class)
    @CheckToken
    public R testInterceptor() {
        return R.ok().setData("测试成功");
    }
}
