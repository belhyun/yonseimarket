package com.yonsei.domain.business.model.member;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by benny on 2017-03-25.
 */
@Repository
public interface MemberRepository extends MongoRepository<Member, Long>, MemberRepositoryCustom {

}
