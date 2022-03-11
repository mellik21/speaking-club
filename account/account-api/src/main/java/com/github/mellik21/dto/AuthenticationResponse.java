package com.github.mellik21.dto;

import lombok.*;

@Getter
@RequiredArgsConstructor
public class AuthenticationResponse {
    private final String jwt;
}
