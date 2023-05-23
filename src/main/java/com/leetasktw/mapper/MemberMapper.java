package com.leetasktw.mapper;

import com.leetasktw.pojo.Member;

import java.util.List;

public interface MemberMapper {

    public List<Member> selectAll();

    public int insert(Member member);

    public int delete(Integer id);
}
