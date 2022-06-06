package hello.hellospring;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
/* ------------------------------------------
여기서는 향후 메모리 리포지토리를 다른 리포지토리로 변경할 예정이므로,
컴포넌트 스캔 방식 대신에 자바 코드로 스프링 빈을 설정하겠다.
그러면 마지막 줄의 return new MemoryMemberRepository()을
return new DBMemberRepository() 같은 식으로 마지막줄만 변경하면 되는 장점이 있음.


 */