package com.leetasktw.service.impl;

import com.leetasktw.mapper.MemberMapper;
import com.leetasktw.pojo.Member;
import com.leetasktw.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> findAll() {
        return memberMapper.selectAll();
    }

    @Override
    public int add(Member member) {
        return memberMapper.insert(member);
    }

    @Override
    public int remove(Integer id) {
        return memberMapper.delete(id);
    }
}
