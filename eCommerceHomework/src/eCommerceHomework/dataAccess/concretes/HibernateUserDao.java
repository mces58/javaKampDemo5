package eCommerceHomework.dataAccess.concretes;

import java.util.List;

import eCommerceHomework.dataAccess.abstracts.UserDao;
import eCommerceHomework.entities.concretes.User; 

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi: " + user.getName());
		
	}

	@Override
	public void update() {
		System.out.println("Hibernate ile guncellendi.");
		
	}

	@Override
	public void delete() {
		System.out.println("Hibernate ile silindi.");
		
	}

	@Override
	public User get(int emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
