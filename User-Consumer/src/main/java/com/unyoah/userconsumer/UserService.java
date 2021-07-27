package com.unyoah.userconsumer;

import com.unyoah.userapi.RegisterApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "User-Provider", configuration = FeignAuthConfiguration.class, fallback = AliveBack.class)
public interface UserService extends RegisterApi {

}
