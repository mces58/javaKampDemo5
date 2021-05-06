package eCommerceHomework.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eCommerceHomework.business.abstracts.UserService;
//import eCommerceHomework.core.LoggerService;
import eCommerceHomework.dataAccess.abstracts.UserDao;
import eCommerceHomework.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	//private LoggerService loggerService; 
	private ArrayList<String> emailList = new ArrayList<String>();
	
	public static boolean isEmailValid(String emailId) {
	    final Pattern EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(emailId).find();
	}
	public static boolean isEmailValidOnClick() {
		return true;
	}
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public void add(User user) {
		
		
		if (emailList.contains(user.getEmail()) ) {
			System.out.println("Email adresi kullanilmis");
			return;
		}
		
		if (user.getPassword().length()<5) {
			System.out.println("Parola en az 6 karakter olmalidir.");
			return;
		}
		
		
		if ((user.getFirstName().length())<2 && (user.getFirstName()).length()<2) {
			System.out.println("isim ve soy isimin uzunlugu 2 den kucuk olamaz.");
			return;
		}
		
		if (isEmailValid(user.getEmail()) != true) {
			System.out.println("Lütfen e-mail adresinizi dogru girin.");;
			return;
		}
		
		if (isEmailValidOnClick() != true) {
			System.out.println("e-mail adresinizi dogrulayin."); 
			return;
		}else {
			emailList.add(user.getEmail());
		}
		
	
	
	userDao.add(user);
		
		
	}

	@Override
	public void logIn(String email, String password) {
		if (emailList.contains(email)) {
			System.out.println("Tebrikler!! Giris basarili "+ email);
		}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
