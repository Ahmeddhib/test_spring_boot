package com.test_spring_boot.test_spring_boot.services;


import com.test_spring_boot.test_spring_boot.entities.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Transactional
@Service
public class MailServiceImpl implements Mailservice{

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("ahmeddhib@gmail.com")
    private String mailAddress;

    @Override
    public void sendMail(String email, Mail mail) {
SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(mailAddress);
        simpleMailMessage.setSubject(mail.getSubject());
        simpleMailMessage.setText(mail.getBody());
        simpleMailMessage.setTo(email);
        javaMailSender.send(simpleMailMessage);


    }
}
