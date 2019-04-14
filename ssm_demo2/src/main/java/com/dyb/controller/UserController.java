package com.dyb.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dyb.pojo.User;
import com.dyb.service.UserService;
import com.dyb.thread.ThreadPoolExcute;

/**
 * 控制器处理器
 * @author 周谦
 * @date 2017年9月27日
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService service;
//	@Autowired
//	private ThreadPoolExcute sitaTicketOut;
//
	/**
	 * 登录
	 * @param user
	 * @param session
	 * @return
	 */
	@RequestMapping("/login")
	public String  doLogin(User user,HttpSession session) {
		System.out.println("user="+user);
		//调用service的方法
		User loginUser = service.login(user.getName(), user.getPwd());
		//sitaTicketOut.mostThreadTicketOut(Integer.parseInt(user.getName()));
		if(loginUser!=null) {
			session.setAttribute("User", loginUser);
			return "success";
		}
		return "fail";
	}
	
	/**
	 * 到搜索页面
	 * @return
	 */
	@RequestMapping("/toSearch")
	public String  toSearch() {
		return "search";
	}
	
	/**
	 * 搜索
	 * @param name
	 * @param model
	 * @return
	 */
	@RequestMapping("/search")
	public String  Search(String  name,Model model) {
		
		model.addAttribute("userlist", service.search(name));
		
		return "search";
	}
	

}
