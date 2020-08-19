package com.jdc.schoolMgntSystem.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.jdc.schoolMgntSystem.dao.StudentRepository;
import com.jdc.schoolMgntSystem.exception.ResourceNotFoundException;
import com.jdc.schoolMgntSystem.model.StudentProfile;
import com.jdc.schoolMgntSystem.model.StudentProfileDto;
import com.jdc.schoolMgntSystem.service.IStudentService;

@Controller
//@RequestMapping("/student")

public class StudentController {

	@Autowired
	private IStudentService studentService;
	@Autowired
	private StudentRepository studentRepo;

	@ModelAttribute("student")
	public StudentProfile studentLogin() {
		return new StudentProfile();
	}
	@ModelAttribute("studentdto")
	public StudentProfileDto student() {
		return new StudentProfileDto();
	}

	
	@GetMapping(value = "/getStudentList",produces = { "application/json;charset=UTF-8" })
	public String showStudentProfile(HttpServletRequest request,Model model) throws JsonProcessingException {
		
		System.out.println("Inside get");
		List<StudentProfile> studentlist = studentService.getAllStudent();
		model.addAttribute("studentlist", studentlist);
		/*ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(studentlist.get(0).getAcademicInfo());
		System.out.println(json);*/
		return "studentlist";
	}
	
	@GetMapping(value = "/id/{id}")
	public String showUser(@PathVariable("id") String userid, Model model) {


		StudentProfile student = studentRepo.findByUserId(userid);
		if (student != null)
		model.addAttribute("student", student);

		return "studenttable";

	}


	
	@PostMapping("/createStudent")
	public String saveStudentProfile(@ModelAttribute("student") StudentProfile student) throws ResourceNotFoundException {
		 studentService.saveStudent(student);
		 return "Student saved";
	}
	
	
	
	@GetMapping(value ="/updateStudent/{userId}"/*,produces = { "application/json;charset=UTF-8" },consumes = {
	"application/json" }*/)
	public String editStudent(@PathVariable String userId,@ModelAttribute("studentdto") StudentProfileDto  studentbody ,Model model) throws Exception{
		
		StudentProfile newStudent = studentRepo.findByUserId(userId);
		model.addAttribute("updatestudent", newStudent);
		studentService.editStudent(userId,studentbody);
		System.out.println("Student updated");
		//model.addAttribute("studenttable", newStudent);
		return "updatestudent";
	
	}
	
/*	@RequestMapping(value = "/users/{id}/update", method = RequestMethod.GET)
	public String showUpdateUserForm(@PathVariable("id") int id, Model model) {

		logger.debug("showUpdateUserForm() : {}", id);

		User user = userService.findById(id);
		model.addAttribute("userForm", user);

		populateDefaultModel(model);

		return "users/userform";

	}
*/
   // delete Student
	@GetMapping(value = "/student/{id}/delete")
	public String deleteUser(@PathVariable("id") Long id
		/*final RedirectAttributes redirectAttributes*/) {

		//logger.debug("deleteUser() : {}", id);
System.out.println("Student Delete");
		studentService.deleteStudent(id);

		//redirectAttributes.addFlashAttribute("css", "success");
	//	redirectAttributes.addFlashAttribute("msg", "User is deleted!");

		return "redirect:/getStudentList";

	}

}
