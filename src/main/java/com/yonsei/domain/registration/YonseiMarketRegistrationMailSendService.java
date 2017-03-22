package com.yonsei.domain.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by benny on 2017-03-22.
 */
@Service
public class YonseiMarketRegistrationMailSendService {

    @Autowired
    private JavaMailSender mailSender;

}
