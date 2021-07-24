package com.unyoah.userconsumer;

import com.unyoah.userapi.RegisterApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("User-Provider")
public interface UserService extends RegisterApi {

}
