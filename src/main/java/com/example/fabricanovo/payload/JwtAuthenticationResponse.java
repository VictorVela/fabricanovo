package com.example.fabricanovo.payload;


import com.example.fabricanovo.security.UserPrincipal;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
public class JwtAuthenticationResponse {
    @NonNull
    private String accessToken;

    private String tokenType = "Bearer";

    @NonNull
    private UserPrincipal principal;
}
