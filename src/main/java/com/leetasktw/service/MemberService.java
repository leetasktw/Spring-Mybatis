package com.leetasktw.service;

import com.leetasktw.pojo.Member;

import java.util.List;

public interface MemberService {

    List<Member> findAll();

    int add(Member member);

    int remove(Integer id);
}
