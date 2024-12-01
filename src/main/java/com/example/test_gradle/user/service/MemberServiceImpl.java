package com.example.test_gradle.user.service;

import com.example.test_gradle.user.controller.dto.JoinRequest;
import com.example.test_gradle.user.repository.MemberRepository;
import com.example.test_gradle.user.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// MembseService 실제 구현체
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public String join(JoinRequest joinRequest) {
        Member member = Member.builder()
                .id(joinRequest.getId())
                .name(joinRequest.getName())
                .phoneNumber(joinRequest.getPhoneNumber())
                .build();
        memberRepository.save(member);

        return "success";
    }
}
