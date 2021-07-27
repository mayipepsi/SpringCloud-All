package com.unyoah.userconsumer;

import feign.FeignException;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class WebError implements FallbackFactory<UserService> {

    @Override
    public UserService create(Throwable cause) {
        return new UserService() {
            @Override
            public String isAlive() {
                // TODO Auto-generated method stub
                System.out.println(cause);
                if(cause instanceof FeignException.InternalServerError) {
                    System.out.println("InternalServerError");
                    return "远程服务报错";
                }else if(cause instanceof RuntimeException) {

                    return "请求时异常：" + cause;
                }else {
                    return "都算不上";
                }
            }
        };
    }
}
