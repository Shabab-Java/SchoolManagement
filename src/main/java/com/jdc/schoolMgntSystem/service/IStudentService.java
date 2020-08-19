package com.jdc.schoolMgntSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jdc.schoolMgntSystem.exception.BusinessException;
import com.jdc.schoolMgntSystem.model.StudentProfile;
import com.jdc.schoolMgntSystem.model.StudentProfileDto;

import javassist.tools.rmi.ObjectNotFoundException;
@Service
public interface IStudentService {
	
	public void saveStudent(StudentProfile student);
	public void editStudent(String userId,StudentProfileDto studentbody) throws BusinessException,ObjectNotFoundException;
	public List<StudentProfile> getAllStudent();
	public void deleteStudent(Long id);
}
