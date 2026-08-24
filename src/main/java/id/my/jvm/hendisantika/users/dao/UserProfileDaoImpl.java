package id.my.jvm.hendisantika.users.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import id.my.jvm.hendisantika.users.model.UserProfile;



@Repository("userProfileDao")
public class UserProfileDaoImpl extends AbstractDao<Integer, UserProfile>implements UserProfileDao{

	public UserProfile findById(int id) {
		return getByKey(id);
	}

	public UserProfile findByType(String type) {
		Query<UserProfile> query = getSession().createQuery(
				"from UserProfile p where p.type = :type", UserProfile.class);
		query.setParameter("type", type);
		return query.uniqueResult();
	}

	public List<UserProfile> findAll(){
		Query<UserProfile> query = getSession().createQuery(
				"from UserProfile p order by p.type asc", UserProfile.class);
		return query.list();
	}

}
