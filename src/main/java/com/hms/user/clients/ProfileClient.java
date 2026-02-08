package com.hms.user.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hms.user.config.FeignClientInterceptor;
import com.hms.user.dto.UserDTO;

@FeignClient(name = "profile-microservice-hms", url="${profile-microservice-hms.url}", configuration = FeignClientInterceptor.class)
public interface ProfileClient {

    @PostMapping("/profile/doctor/add")
    Long addDoctor(@RequestBody UserDTO userDTO);

    @PostMapping("/profile/patient/add")
    Long addPatient(@RequestBody UserDTO userDTO);

    @GetMapping("/profile/doctor/getProfilePictureId/{id}")
    Long getDoctor(@PathVariable Long id);

    @GetMapping("/profile/patient/getProfilePictureId/{id}")
    Long getPatient(@PathVariable Long id);
}
