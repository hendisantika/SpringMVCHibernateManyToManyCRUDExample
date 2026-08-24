package id.my.jvm.hendisantika.users.dao;

import java.util.List;

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
public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
