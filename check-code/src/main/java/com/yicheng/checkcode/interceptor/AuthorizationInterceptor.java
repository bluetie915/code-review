package com.yicheng.checkcode.interceptor;

import com.yicheng.checkcode.annotation.CheckToken;
import com.yicheng.checkcode.exception.MyException;
import com.yicheng.checkcode.util.TokenUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 张艺成
 * @date 2020/11/24 0024 20:00
 */
@Configuration
public class AuthorizationInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (!(handler instanceof HandlerMethod))
            return true;
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        CheckToken annotation = handlerMethod.getMethodAnnotation(CheckToken.class);
        if (annotation == null)
            return true;
        String token = TokenUtil.getRequestToken(request);
        if (StringUtils.isBlank(token))
            throw new MyException(401, "token" + "不能为空");
        System.out.println("拦截token ==> " + token);
        return true;
    }
}
