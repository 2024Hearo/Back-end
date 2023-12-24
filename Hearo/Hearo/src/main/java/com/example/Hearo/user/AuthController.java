package com.example.Hearo.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/login/google")
    public String googleLogin(@RequestBody String idToken) {
        // Firebase Auth SDK를 사용하여 Google ID 토큰을 유효성 검사하고 사용자 인증 수행
        // 사용자 정보를 검색하고 사용자 세션을 만듭니다.
        // 인증 토큰 또는 사용자 세부 정보를 반환합니다.
        return "로그인 성공!";
    }
}
