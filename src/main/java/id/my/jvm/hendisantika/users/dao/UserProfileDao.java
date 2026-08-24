package id.my.jvm.hendisantika.users.dao;

import java.util.List;

import id.my.jvm.hendisantika.users.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
