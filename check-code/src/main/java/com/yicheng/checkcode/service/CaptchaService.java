package com.yicheng.checkcode.service;

import java.awt.image.BufferedImage;

/**
 * @author 张艺成
 * @date 2020/11/24 0024 9:32
 */
public interface CaptchaService {
    BufferedImage getCaptcha(String uuid);
}
