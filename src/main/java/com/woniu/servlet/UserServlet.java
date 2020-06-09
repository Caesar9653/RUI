package com.woniu.servlet;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Users;
import com.woniu.service.UsersService;

@Controller
@RequestMapping("users")
public class UserServlet {
@Autowired
UsersService userService;
@RequestMapping("loginDo")
public String loginDo(Users user,HttpSession session) {
	Users loginUser = userService.login(user);
	if(loginUser!=null) {
		session.setAttribute("loginUser", loginUser);
		return "users/main";
	}else {
		return "redirect:users/login";
	}
}
@RequestMapping("login")
public String login() {
	return "login";
}
@RequestMapping("main")
public String main() {
	return "main";
}

@RequestMapping("logout")
public String logout(HttpSession session) {
	session.invalidate();
	return "login";
	
}

}
