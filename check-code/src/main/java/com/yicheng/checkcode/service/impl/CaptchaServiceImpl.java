package com.yicheng.checkcode.service.impl;

import com.google.code.kaptcha.Producer;
import com.yicheng.checkcode.entity.Captcha;
import com.yicheng.checkcode.exception.MyException;
import com.yicheng.checkcode.service.CaptchaService;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.util.Date;

/**
 * @author 张艺成
 * @date 2020/11/24 0024 9:32
 */
@Service
public class CaptchaServiceImpl implements CaptchaService {

    @Autowired
    Producer producer;

    @Override
    public BufferedImage getCaptcha(String uuid) {
        if (StringUtils.isBlank(uuid))
            throw new MyException(500, "UUID不能为空");

        String code = producer.createText();
        Captcha checkCode = new Captcha();
        checkCode.setCode(code);
        checkCode.setUuid(uuid);
        checkCode.setExpireTime(DateUtils.addMinutes(new Date(), 5));
        System.out.println("保存checkcode ==> " + checkCode);

        return producer.createImage(code);
    }
}
