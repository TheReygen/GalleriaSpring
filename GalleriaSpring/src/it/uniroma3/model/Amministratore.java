package it.uniroma3.model;

public class Amministratore {
	private String user;
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Amministratore(){
	}
	public boolean checkPassword(String password){
		return this.password.equals(password);
	}
}
