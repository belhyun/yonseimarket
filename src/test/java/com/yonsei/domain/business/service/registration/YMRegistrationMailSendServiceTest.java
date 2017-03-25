package com.yonsei.domain.business.service.registration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by benny on 2017-03-22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class YMRegistrationMailSendServiceTest {

    @Autowired
    private YMRegistrationMailSendService sendService;

    @Test
    public void test() {
        sendService.sendMail();
    }
}