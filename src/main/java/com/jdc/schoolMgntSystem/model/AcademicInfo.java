package com.jdc.schoolMgntSystem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "ACADEMIC_INFO")
public class AcademicInfo {
	
	@Id
	@Column(name = "ID", nullable = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column(name = "STUDENT_ID", nullable = true)
	private String studentId;
	
	@Column(name = "ADMISSION_CLASS", nullable = true)
	private String admissionClass;
	
	@Column(name = "ADMISSION_DATE", nullable = true)
	private String admissionDate;
	
	@Column(name = "LAST_CLASS", nullable = true)
	private String lastClass;
	
	@Column(name = "LAST_SCHOOL", nullable = true)
	private String lastSchool;
	
	@ManyToOne
	private StudentProfile student;

}
