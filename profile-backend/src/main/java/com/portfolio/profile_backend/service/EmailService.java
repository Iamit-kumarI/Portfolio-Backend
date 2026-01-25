package com.portfolio.profile_backend.service;

import com.portfolio.profile_backend.dto.ContactRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String ownerEmail;

    public void sendContactEmail(ContactRequest request) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(ownerEmail);               // MUST
        message.setTo(ownerEmail);                 // MUST
        message.setReplyTo(request.getEmail());    // MUST
        message.setSubject("New Contact Form Message");

        message.setText(
                "Name: " + request.getName() + "\n" +
                        "Email: " + request.getEmail() + "\n\n" +
                        "Message:\n" + request.getMessage()
        );

        mailSender.send(message);
    }
}