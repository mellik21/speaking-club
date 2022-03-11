package com.github.mellik21.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class AuthenticationRequest {
    private String username;
    private String password;
}
