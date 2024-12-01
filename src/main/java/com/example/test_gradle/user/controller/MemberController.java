package com.example.test_gradle.user.controller;

import com.example.test_gradle.user.controller.dto.JoinRequest;
import com.example.test_gradle.user.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 이 프로젝트의 전체적인 구조 => 컨트롤러에서 요청이 들어오면, service로 전달하고, service는 Repository로 전송을해서, Repository가 데이터베이스와 통신을 하도록!
// 컨트롤러는 서비스와 닿아있는 레이어!

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    // HTTP 요청을 받는 메소드
    // 컨트롤러를 통해 요청을 받았고, hello가 들어갔을때 String값을 리턴받아서 보여줌
    @GetMapping("/hello")
    public String getHello(){
        return "안녕";
    }


    // 회원가입
    // post = 넣어줌(회원정보를 넣어주겠다)
    // RequestBody로 JoinRequest의 값을 받아옴
    @PostMapping("/join")
    public String join(@RequestBody JoinRequest joinRequest){

        String result = memberService.join(joinRequest);

        if("success".equalsIgnoreCase(result)){
            return "success";
        }else {
            return "fail";
        }
    }


}
