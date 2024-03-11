package com.microservice.driver.http.response;

import com.microservice.driver.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserByDriverResponse {
    private String driverName;
    private String trips;
    private List<UserDTO> userDTOList;
}
