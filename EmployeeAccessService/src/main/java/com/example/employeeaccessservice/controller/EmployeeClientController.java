package com.example.employeeaccessservice.controller;

import com.example.employeeaccessservice.responsitory.EmployeeRepositoryAccess;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Api(tags={"EmployeeClient"})
public class EmployeeClientController {
	
	@Autowired
	EmployeeRepositoryAccess empRepository;
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
	
	@RequestMapping("/userProfiles")
	public String profileList(Model model) {
		model.addAttribute("profiles", empRepository.getAllProfiles());
		return "userProfiles";
	}
	
	@HystrixCommand(fallbackMethod = "profileNotFound")
	@RequestMapping("/userDetails")
	public String profileDetails(@RequestParam("id") String userId, Model model) {
		model.addAttribute("profile", empRepository.getProfile(userId));
		return "userDetails";
	}
	
	public String profileNotFound(String userId, Model mode) {
		return "serviceError";
	}

}
