package member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import member.model.MemberDTO;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@RequestMapping("/login")
	public String login(){
		return "tw:member/login";
	}
	@RequestMapping("/join")
	public String join(){
		return "tw:member/join";
	}
	@RequestMapping("/joinConfirm")
	public String joinConfirm(MemberDTO dto){
		
		return "tw:member/joinConfirm";
	}
}
