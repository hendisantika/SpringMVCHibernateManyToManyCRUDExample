package id.my.jvm.hendisantika.users.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import id.my.jvm.hendisantika.users.model.User;



@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	public User findById(int id) {
		User user = getByKey(id);
		if(user!=null){
			Hibernate.initialize(user.getUserProfiles());
		}
		return user;
	}

	public User findBySSO(String sso) {
		Query<User> query = getSession().createQuery(
				"from User u where u.ssoId = :ssoId", User.class);
		query.setParameter("ssoId", sso);
		User user = query.uniqueResult();
		if(user!=null){
			Hibernate.initialize(user.getUserProfiles());
		}
		return user;
	}

	public List<User> findAllUsers() {
		Query<User> query = getSession().createQuery(
				"select distinct u from User u order by u.firstName asc", User.class);
		return query.list();
	}

	public void save(User user) {
		persist(user);
	}

	public void deleteBySSO(String sso) {
		User user = findBySSO(sso);
		delete(user);
	}

}
