package eCommerceHomework.dataAccess.abstracts;

import java.util.List; 

import eCommerceHomework.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update();
	void delete();
	User get(int emailId);
	List<User> getAll();
	
}