package com.sunsoft;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
@Controller
public class HelloWorldController {
	
	@RequestMapping("/login")
	public String helloWorld(HttpServletRequest request, HttpServletResponse res, Model m) {
		String name=request.getParameter("name");
		String password = request.getParameter("password");
		
		if(password.equals("admin")) {
			String message = "You are a valid User, welcome " + name;
			m.addAttribute("message",message);
			return "hellopage";
		}
		else {
			String message1 = "Wrong username or password";
			m.addAttribute("message1",message1);
			return "errorpage";
		}
	}
	
	
	@RequestMapping("/name")
	public String Username(HttpServletRequest request, HttpServletResponse res, Model m) {
		String myname=request.getParameter("name");
		String message = " Hello " + myname +" you are at the right place";
		m.addAttribute("message",message);
		return "name";
		
	}
	
	@RequestMapping("/employeedetails")
	public String EmployeeDetails(HttpServletRequest request, HttpServletResponse res, Model m) {
		String name=request.getParameter("name");
		String password = request.getParameter("password");
	
		if(password.equals("admin")) {
//			String message = "You are a valid User, welcome " + name;
			String id= "16088";
			String dept ="Technology";
			String designation ="Manager";
			
			
			m.addAttribute("name", name);
			m.addAttribute("id", id);
			m.addAttribute("dept", dept);
			m.addAttribute("designation",designation);
			
			return "employeedetails";
//			m.addAttribute("message",message);
//			return "hellopage";
		}
		else {
			String message ="Wrong username or password";
			m.addAttribute("message",message);
			return "errorpage";
		}
		
		
	}
	
	
	
	
}
