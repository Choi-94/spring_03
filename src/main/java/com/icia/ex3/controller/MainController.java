package com.icia.ex3.controller;


import com.icia.ex3.dto.MemberDTO;

import com.icia.ex3.service.MemberSerivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

import java.util.List;


@Controller
public class MainController {
    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/monday1")
    public String monday1() {
        return "monday1";
    }

    @GetMapping("/monday2")
    public String monday2() {
        return "monday2";
    }

    @GetMapping("/monday3")
    public String monday3() {
        return "monday3";
    }

    @GetMapping("/monday1-param")
    public String param1(@RequestParam("month") String month, @RequestParam("day") String day) {
        System.out.println("month = " + month + ", day = " + day);
        return "index";
    }

    @GetMapping("monday2-param2")
    public String param2(@RequestParam("name") String name, @RequestParam("mobile") String mobile, Model model) {
        System.out.println("name = " + name + ", mobile = " + mobile);
        model.addAttribute("m1", name);
        model.addAttribute("m2", mobile);
        return "return2";
    }

    @PostMapping("monday3-param3")
    public String param3(HttpServletRequest request, Model model) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setEmail(request.getParameter("email"));
        memberDTO.setPassword(request.getParameter("password"));
        System.out.println("request = " + request);
        model.addAttribute("m1", memberDTO);
        return "result3";
    }//

    //선생님이 하신거!
//    @PostMapping("/monday3-param")
//    public String monday3Param(@ModelAttribute MemberDTO memberDTO, Model model){
//        System.out.println("memberDTO="memberDTO);
//        model.addAttribute("member",memberDTO);
//        return "result3";
//    }
    @GetMapping("/monday4")
    public String monday4(Model model) {
        List<MemberDTO> memberDTOS = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            memberDTOS.add(newMember(i));
        }
        model.addAttribute("memberList", memberDTOS);
        return "monday4";
    }

    public MemberDTO newMember(int i) {

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMonth(i + "월");
        memberDTO.setDay(i + "일");
        memberDTO.setName("이름" + i);
        memberDTO.setEmail("q" + i + "@naver.com");
        memberDTO.setPassword("1234" + i);
        memberDTO.setMobile("010" + i + "1234");
        return memberDTO;
    }

    @GetMapping("/monday5")
    public String monday5() {
        return "monday5";
    }

    @PostMapping("/monday5-param")
    public String monday5Param(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("memberDTO = " + memberDTO);
        return "index";
    }

    @GetMapping("/method1")
    public String method1() {
//        MemberSerivice memberSerivice = new MemberSerivice();
        String result = memberSerivice.method1();
        System.out.println("result = " + result);
        return "index";
    }

    @Autowired
    private MemberSerivice memberSerivice;


    @GetMapping("/monday6")
    public String monday6() {
        return "monday6";
    }
    @PostMapping("/monday6-param")
    public String method2(@ModelAttribute MemberDTO memberDTO){
        memberSerivice.method2(memberDTO);
        return "index";
    }
}