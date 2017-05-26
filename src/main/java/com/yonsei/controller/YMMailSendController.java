package com.yonsei.controller;

import com.yonsei.domain.business.service.registration.YMRegistrationMailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import java.util.Locale;

/**
 * Created by belhyun on 2017-05-26.
 */
@Controller
public class YMMailSendController {

    @Autowired
    private YMRegistrationMailSendService sendService;

    @RequestMapping(value = "/sendmail", method = RequestMethod.GET)
    @ResponseBody
    public String sendMail() throws MessagingException {
        sendService.sendSimpleMail("belhyun", "belhyun@gmail.com", Locale.KOREA);
        return "test";
    }
}
