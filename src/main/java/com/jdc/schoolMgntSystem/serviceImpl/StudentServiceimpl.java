package com.jdc.schoolMgntSystem.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc.schoolMgntSystem.dao.StudentRepository;
import com.jdc.schoolMgntSystem.model.StudentProfile;
import com.jdc.schoolMgntSystem.service.IStudentService;

@Service
public class StudentServiceimpl implements IStudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	

	@Override
	public void saveStudent(StudentProfile student) {
		studentRepo.save(student);
		
	}

	
	
}
