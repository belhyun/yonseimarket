package com.yonsei.domain.business.service.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by benny on 2017-03-22.
 */
@Service
public class YMRegistrationMailSendService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail() {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("belhyun@gmail.com");
        mail.setFrom("belhyun@gmail.com");
        mail.setSubject("Test");
        mail.setText("Test");
        mailSender.send(mail);
    }
}
