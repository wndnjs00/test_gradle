package com.example.test_gradle.user.repository;

import com.example.test_gradle.user.repository.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository 상속 <객체, id타입>
// Repository는 이정도만 있어도 crud의 기본적인 역할을 할수있음 (JpaRepository를 타고들어가보면 그안에 이미 crud기능이 다 있어서 이렇게만 작성해주면됨)
public interface MemberRepository extends JpaRepository<Member, Long> {
}
