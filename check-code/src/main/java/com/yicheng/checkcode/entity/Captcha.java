package com.yicheng.checkcode.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author 张艺成
 * @date 2020/11/24 0024 9:43
 */
@Data
@ApiModel(value = "Captcha对象")
public class Captcha {

    @ApiModelProperty("验证码UUID")
    private String uuid;
    @ApiModelProperty("验证码")
    private String code;
    @ApiModelProperty("验证码过期时间")
    private Date expireTime;
}
