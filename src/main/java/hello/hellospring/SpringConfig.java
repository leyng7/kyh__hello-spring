package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    /* 컴포넌트 스캔을 사용해도 되지만 특별하다는 것을 의미해주기 위해 빈으로 등록해서 사용하는게 좋다.
    @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }
    */

}
