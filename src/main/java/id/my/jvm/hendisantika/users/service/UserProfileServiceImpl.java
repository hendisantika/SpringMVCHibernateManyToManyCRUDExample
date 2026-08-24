package id.my.jvm.hendisantika.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import id.my.jvm.hendisantika.users.dao.UserProfileDao;
import id.my.jvm.hendisantika.users.model.UserProfile;

/**
 * Created by IntelliJ IDEA.
 * Project : SpringMVCHibernateManyToManyCRUDExample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/08/26
 * Time: 06.57
 */
@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
	
	@Autowired
	UserProfileDao dao;
	
	public UserProfile findById(int id) {
		return dao.findById(id);
	}

	public UserProfile findByType(String type){
		return dao.findByType(type);
	}

	public List<UserProfile> findAll() {
		return dao.findAll();
	}
}
