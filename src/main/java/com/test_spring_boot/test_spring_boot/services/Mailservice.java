package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.entities.Mail;

public interface Mailservice {

    void sendMail(String email, Mail mail);
}
