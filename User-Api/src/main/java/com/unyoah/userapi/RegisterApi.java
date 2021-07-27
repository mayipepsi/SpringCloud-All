package com.unyoah.userapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface RegisterApi {

    @GetMapping("User/isAlive")
    public String isAlive();

}
