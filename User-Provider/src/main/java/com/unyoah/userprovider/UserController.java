package com.unyoah.userprovider;

import com.unyoah.userapi.RegisterApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;


@RestController
public class UserController implements RegisterApi {

    @Value("${server.port}")
    String port;

    private AtomicInteger I = new AtomicInteger();

    @Override
    public String isAlive() {
        try {
            System.out.println("准备睡眠");
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "端口【" + port + "】----已被调用【 " + I.getAndIncrement() +"】次";
    }
}
