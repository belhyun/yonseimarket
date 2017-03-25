package com.yonsei.domain.business.service.registration;

import com.yonsei.domain.business.model.member.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by benny on 2017-03-25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class YMRegistrationServiceTest {

    @Autowired
    private YMRegistrationService SUT;

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void save_test() throws Exception {
        SUT.save("belhyun@gmail.com", "test", "belhyun");
        assertNotNull(memberRepository.findAll());
    }
}