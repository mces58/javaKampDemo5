import eCommerceHomework.business.abstracts.UserService;
import eCommerceHomework.business.concretes.UserManager;
import eCommerceHomework.dataAccess.concretes.HibernateUserDao;
import eCommerceHomework.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao());
		User user1 = new User("Can@gmail.com","Can","Eser","123456");
		User user2 = new User("Can@gmail.com","can","Eser","123456");
		User user3 = new User("cangmail","CAN","Eser","12wr345x6"); 
		User user4 = new User("Cann@gmail.com","can","eser", "123456eser"); 
		User user5 = new User("esecan@gmail.com","anc","Eser","123");
		
		userService.add(user1);
		userService.add(user2);
		userService.add(user3);
		userService.add(user4);
		userService.add(user5);
		
	}

}
