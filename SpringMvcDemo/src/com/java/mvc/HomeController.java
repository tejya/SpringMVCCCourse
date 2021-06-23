package com.java.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String getHome() {
		System.out.println("home page");
		return "home";
	}

	@RequestMapping("/showForm")
	public String getData() {
		System.out.println("Hello");
		return "menu";
	}

	@RequestMapping("/submitForm")
	public String submit(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		System.out.println("name:"+name);
		model.addAttribute("message",name);
		return "show";
	}
	
	@RequestMapping("/submitFormData")
	public String submitData(@RequestParam("studentName") String name,HttpServletRequest request, Model model) {
	//	String name = request.getParameter("studentName");
		System.out.println("name:"+name);
		model.addAttribute("studentName",name);
		List<String> list=new ArrayList<>();
		list.add("teju");
		list.removeAll(Arrays.asList(""));
		System.out.println("List size:"+list.size());
		model.addAttribute("testList",list);
		return "show";
	}
}
