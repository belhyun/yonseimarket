package com.yonsei.domain.business.service.registration;

import com.yonsei.domain.business.model.member.Member;
import com.yonsei.domain.business.model.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by benny on 2017-03-25.
 */
@Service
public class YMRegistrationService {

    @Autowired
    private MemberRepository repository;

    public void save(String email, String password, String nickName) {
        Member member = Member.make(email, password, nickName);
        repository.save(member);
    }
}
