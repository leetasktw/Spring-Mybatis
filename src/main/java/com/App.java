package com;

import com.leetasktw.pojo.Member;
import com.leetasktw.service.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MemberService memberService = context.getBean(MemberService.class);

        Member member = new Member();
        member.setUsername("Kevin");
        member.setPassword("88888");
        member.setBalance(7000D);

//        memberService.add(member);
//        memberService.remove(5);
        System.out.println(memberService.findAll());
    }
}
