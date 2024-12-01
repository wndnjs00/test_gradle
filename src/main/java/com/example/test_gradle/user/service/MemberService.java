package com.example.test_gradle.user.service;

import com.example.test_gradle.user.controller.dto.JoinRequest;

public interface MemberService {

    // 실제 구현체가 아닌 껍데기
    String join(JoinRequest joinRequest);

}
