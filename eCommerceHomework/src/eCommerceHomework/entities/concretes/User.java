package eCommerceHomework.entities.concretes;

public class User {
	private String email;
	private String name;
	private String firstName;
	private String password;
	public User(String email, String name, String firstName, String password) {
		super();
		this.email = email;
		this.name = name;
		this.firstName = firstName;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}