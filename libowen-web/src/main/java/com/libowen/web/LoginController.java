package com.libowen.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.libowen.model.UserDTO;
import com.libowen.service.LoginService;
import com.libowen.utils.Utils;

@RequestMapping("/user")
@Controller
public class LoginController {
	
//	private static Logger logger = Logger.getLogger(LoginController.class);
	
	@Resource
	private LoginService loginService;
	
	@RequestMapping("/joinLogin")
	@ResponseBody
	public int userLogin(@RequestParam("join_account") String join_account,
			@RequestParam("join_password") String join_password,HttpSession session){
		
		UserDTO dto = new UserDTO();
		
		dto.setAccount(join_account);
		
		dto.setPassWord(join_password);
		
		UserDTO user = loginService.joinLogin(dto);
		
		if(user != null){
			
			session.setAttribute(Utils.Login_USER, user);
			
			return 1;
		}else{
			return 0;	
		}
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpSession session,Model model){
		UserDTO user = (UserDTO) session.getAttribute(Utils.Login_USER);
		if(user != null ){
			return "login/login";
		}else{
			return "error";
		}
		
	}
	
}
