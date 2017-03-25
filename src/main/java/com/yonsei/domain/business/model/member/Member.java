package com.yonsei.domain.business.model.member;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by benny on 2017-03-25.
 */
@Document(collection = "ym")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {

    @Id
    private String email;

    private String password;

    private String nickName;

    public static Member make(String email, String password, String nickName) {
        Member member = Member.builder()
                .email(email)
                .password(password)
                .nickName(nickName).build();
        return member;
    }


}
