package com.sunsoft;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
@Controller
public class EmployeeSalary {
	
	@RequestMapping("/welcome/{id1}")
	public String helloWorld(
			@RequestParam ("id") int id, 
			@RequestParam ("name") String name,
			@PathVariable ("basic") int basic,
			@PathVariable ("hra") int hra,
			@PathVariable ("da") int da,
			@PathVariable ("deductions") int deductions,
			@PathVariable ("it") int it,
			@PathVariable("id1") int id1, 
			Model m) {
		
		int gross_salary = basic+hra+da+deductions+it;
		int net_salary = gross_salary-(deductions+it);
		
		m.addAttribute("net_salary", net_salary);
		return "salary";
		
	}

}
