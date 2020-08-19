package com.jdc.schoolMgntSystem.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.jdc.schoolMgntSystem.dao.UserRepository;
import com.jdc.schoolMgntSystem.model.Registration;
import com.jdc.schoolMgntSystem.model.User;

public class UserMapper {
	
	@Autowired
	private UserRepository userRepo;
	
	public void map(Registration registration) {
		
		User user = new User();
		user.setId(5);
		user.setDate(registration.getDate());
		//user.setFirstName(registration.getFirstName());
		//user.setLastName(registration.getLastName());
		//user.setPlace(registration.getPlace());
		user.setUserId(registration.getUserId());
		user.setPassword(registration.getPassword());
		user.setRole(registration.getRole());
		if(user!=null){
		userRepo.save(user);
		System.out.println("Inside user");
		}else
			System.out.println("User ot saved");
		
	}
}
	
/*public User mapdto(UserRegistrationDto registrationdto) {
		
		User user = new User();
		user.setAge(registrationdto.getAge());
		user.setDate(registrationdto.getDate());
		user.setFirstName(registrationdto.getFirstName());
		user.setLastName(registrationdto.getLastName());
		user.setPlace(registrationdto.getPlace());
		user.setUserId(registrationdto.getUserId());
		user.setPassword(registrationdto.getPassword());
		return user;

}*/
