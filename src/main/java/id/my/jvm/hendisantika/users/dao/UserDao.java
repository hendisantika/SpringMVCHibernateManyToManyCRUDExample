package id.my.jvm.hendisantika.users.dao;

import java.util.List;

import id.my.jvm.hendisantika.users.model.User;


public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
	void save(User user);
	
	void deleteBySSO(String sso);
	
	List<User> findAllUsers();

}

