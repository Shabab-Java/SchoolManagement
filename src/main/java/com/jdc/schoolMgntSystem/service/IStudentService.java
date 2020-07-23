package com.jdc.schoolMgntSystem.service;

import org.springframework.stereotype.Service;

import com.jdc.schoolMgntSystem.model.StudentProfile;
@Service
public interface IStudentService {
	
	public void saveStudent(StudentProfile student);

}
