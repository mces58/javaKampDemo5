package eCommerceHomework.business.abstracts;

import java.util.List;

import eCommerceHomework.entities.concretes.User;

public interface UserService {
	void add(User user);
	void logIn(String email,String password);
	List <User> getAll();
}
