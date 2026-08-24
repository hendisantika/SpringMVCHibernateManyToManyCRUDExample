package id.my.jvm.hendisantika.users.service;

import java.util.List;

import id.my.jvm.hendisantika.users.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
