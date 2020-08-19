package com.jdc.schoolMgntSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jdc.schoolMgntSystem.model.StudentProfile;
@Repository
public interface StudentRepository extends JpaRepository<StudentProfile, Long> {
	
	public StudentProfile findByUserId(String userId);
	
	/*@Query("SELECT e FROM StudentProfile e WHERE e.age >= :age")
    public List<StudentProfile> listItemsWithPriceOver(@Param("age") int age);*/

}
