package com.unyoah.userprovider;

import com.unyoah.userapi.RegisterApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController implements RegisterApi {

    @Override
    public String isAlive() {
        return "ok";
    }
}
