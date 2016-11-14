package member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import member.model.MemberDTO;
import member.model.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberService memberService;
	
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
		boolean r = memberService.joinConfirm(dto);
		if(r){
			return "tw:member/joinConfirm";
		}else{
			return "tw:member/err";
		}
	}
}
