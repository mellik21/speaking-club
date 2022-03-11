package com.github.mellik21.resource;

import com.github.mellik21.dto.AuthenticationRequest;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountController {

    @ApiOperation(value = "Проверка подлинности переданных учетных данных")
    @PostMapping(value = "/authenticate")
    ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception;


}
