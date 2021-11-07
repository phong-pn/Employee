package Employee;

import java.util.ArrayList;
import java.util.Date;

import Certificate.Certificate;

public abstract class Employee {

	private ArrayList<Certificate> certificates;

	private String id;
	
	private String fullName;

	private Date birthDay;

	public ArrayList<Certificate> getCertificates() {
		return certificates;
	}
	public void setCertificates(ArrayList<Certificate> certificates) {
		this.certificates = certificates;
	}
	private String phoneNumber;

	private String email;
	 
	private int employeeType;

	private int employeeCount;
	
	public void showInfo() {
		System.out.println(toString());
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
}
