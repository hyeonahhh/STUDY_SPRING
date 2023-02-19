package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
        //기존 코드 (스프링으로 전환전)
        //AppConfig appConfig = new AppConfig();

        //MemberService 가져오는 코드 (스프링으로 전환 전)
        //MemberService memberService = appConfig.memberService();

        //MemberService 가져오는 코드 (AppConfig 전환 전)
        //MemberService memberService = new MemberServiceImpl();

        //AppConfig appConfig = new AppConfig 이거 대신 이제 이거 사용함
        //appConfig에 있는 설정 정보를 바탕으로 시작
        //ac로 줄여서도 많이 사용함
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //MemberService 가져오는 코드 (스프링으로 전환 후후)
        //name은 메서드 이름, 뒤는 타입
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member member1 = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + member1.getName());
    }
}
