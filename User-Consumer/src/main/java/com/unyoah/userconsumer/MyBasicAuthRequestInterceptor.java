package com.unyoah.userconsumer;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * 拦截器
 */
public class MyBasicAuthRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header("Authorization", "Basic cm9vdDpyb290");
    }
}
