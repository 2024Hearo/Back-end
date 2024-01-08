package com.hearos.hear_o.Controller;

import com.hearos.hear_o.Service.EmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/invite")
public class InvitationController {
    private final EmailService emailService;

    public InvitationController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public String sendInvitation(@RequestParam String email) {
        // 채팅방 초대 이메일 내용 구성
        String subject = "Chat Room Invitation";
        String text = "You have been invited to join our chat room." +
                "If you want, please click the link below";

        emailService.sendSimpleMessage(email, subject, text);
        return "Invitation sent to " + email;
    }
}
