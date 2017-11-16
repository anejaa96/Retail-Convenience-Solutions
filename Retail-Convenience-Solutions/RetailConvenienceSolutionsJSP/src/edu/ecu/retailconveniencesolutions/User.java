package edu.ecu.retailconveniencesolutions;

public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	private String streetAddress;
	private String zipCode;
	private String username;
	private String password;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String email, String streetAddress, String zipCode, String username,
			String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.streetAddress = streetAddress;
		this.zipCode = zipCode;
		this.username = username;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", streetAddress="
				+ streetAddress + ", zipCode=" + zipCode + ", username=" + username + "]";
	}
	
}
