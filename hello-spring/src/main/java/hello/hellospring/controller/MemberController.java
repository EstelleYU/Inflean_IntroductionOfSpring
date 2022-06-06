package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private MemberService memberService;

    @Autowired  // Setter Injection 방식 - public하게 노출된다는 단점이 있음..
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

//    @Autowired  // 생성자에 @Autowired 가 있으면 스프링이 연관된 객체를 스프링 컨테이너에서 찾아서 넣어준다. (DI)
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }

}
