package com.jdc.schoolMgntSystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdc.schoolMgntSystem.dao.StudentRepository;
import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.StudentProfile;
import com.jdc.schoolMgntSystem.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private IStudentService studentService;
	@Autowired
	private StudentRepository studentRepo;

	@ModelAttribute("student")
	public StudentProfile studentLogin() {
		return new StudentProfile();
	}

	
	@GetMapping("")
	public String showStudentProfile(HttpServletRequest request) {
		request.setAttribute("student",studentRepo.findById(4l) );
		return "student";
	}
	
	@PostMapping("")
	public String saveStudentProfile(@ModelAttribute("student") StudentProfile student) throws ResourceNotFoundException {
		 studentService.saveStudent(student);
		 return "Student saved";
	}


}
