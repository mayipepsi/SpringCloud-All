package com.unyoah.userconsumer;

import org.springframework.stereotype.Component;

@Component
public class AliveBack implements UserService {

    @Override
    public String isAlive() {
        return "出错啦.....";
    }
}
