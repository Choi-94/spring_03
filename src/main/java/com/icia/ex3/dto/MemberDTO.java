package com.icia.ex3.dto;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO {
    private String month;
    private String day;
    private String email;
    private String password;
    private String name;
    private String mobile;
    private String gender;
    private String city;
    private String[] lang;

}
