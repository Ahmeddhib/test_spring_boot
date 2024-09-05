package com.test_spring_boot.test_spring_boot.restControllers;

import com.test_spring_boot.test_spring_boot.entities.Mail;
import com.test_spring_boot.test_spring_boot.services.Mailservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class MailRestController {

    @Autowired
    private Mailservice mailService;

    @PostMapping("/send/{email}")
    public String sendMail (@PathVariable String email, @RequestBody Mail mail) {
        mailService.sendMail(email, mail);
        return "Mail sent successfully";
    }


}
