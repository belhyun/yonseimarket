package com.yonsei.configuration.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by benny on 2017-03-27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class YMMailClientTest {

    @Autowired
    private YMMailClient SUT;

    @Test
    public void testSend() {
        SUT.prepareAndSend("belhyun@gmail.com", "Test");
    }
}