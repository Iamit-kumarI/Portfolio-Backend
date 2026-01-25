package com.portfolio.profile_backend.controller;

import com.portfolio.profile_backend.dto.ContactRequest;
import com.portfolio.profile_backend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*") // frontend ke liye
public class ContactController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody ContactRequest request) {

        emailService.sendContactEmail(request);
        return ResponseEntity.ok("Message sent successfully");
    }
}
