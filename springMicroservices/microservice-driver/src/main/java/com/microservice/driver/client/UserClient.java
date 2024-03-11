package com.microservice.driver.client;

import com.microservice.driver.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-user", url = "localhost:8080/api/user")
public interface UserClient {

    @GetMapping("/search-by-driver/{idDriver}")
    List<UserDTO> findAllUserByDriver(@PathVariable Long idDriver);

}
