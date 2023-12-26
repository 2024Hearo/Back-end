package com.example.Hearo.user;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @PostMapping("/login/googleLogin")
    public String googleLogin(@RequestBody String idToken) {
        try {
            // Firebase Admin SDK를 사용하여 ID 토큰을 검증
            FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdToken(idToken);
            String uid = decodedToken.getUid();

            // 추가적인 사용자 정보 처리
            // 예: 사용자 세션 생성, 데이터베이스 조회 등

            return "User authenticated with UID: " + uid;
        } catch (FirebaseAuthException e) {
            logger.error("Firebase Authentication failed", e);
            return "Authentication failed";
        }
    }
}
