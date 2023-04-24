package com.icia.ex3.service;

import com.icia.ex3.dto.MemberDTO;
import org.springframework.stereotype.Service;

@Service
public class MemberSerivice {
    public String method1() {
        System.out.println("MemberSerivice.method1");
        return method1();
    }
    public String method2(MemberDTO memberDTO){
        System.out.println("memberDTO = " + memberDTO);
        return "index";
    }
}
