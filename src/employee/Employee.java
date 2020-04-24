package employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private long id;
	private String firstName;
	private String lastName;
	private int age;
    
     private String gender;
     
    private String department;
     
    private  Date dateOfJoining;
   private  Salary salary;
    private Hourly time;
     

   


// constructor for new employee
	public Employee(String firstName, String lastName,String gender,String department,Date dateOfJoining,int age,Hourly time,Salary salary) {
		this.firstName = firstName;
		this.lastName= lastName;
		id = (int) ((Math.random() * 1000000000));
		this.gender=gender;
		this.department=department;
		this.age= age;
		this.time=time;
		this.salary=salary;
		this.dateOfJoining=dateOfJoining;
		
	}

	public Hourly getTime() {
		return time;
	}

	public void setTime(Hourly time) {
		this.time = time;
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

	public long getId() {
		return id;
	}

	public void setID(int iD) {
		id = iD;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getYearOfJoining() {
		return dateOfJoining;
	}

	public void setYearOfJoining(Date yearOfJoining) {
		this.dateOfJoining = yearOfJoining;
	}

	@Override
	public String toString() {
		String pattern = "MM/dd/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String dateOfJoin =simpleDateFormat.format(dateOfJoining);
		
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", department=" + department + ", DateOfJoining=" + dateOfJoin+ ", salary="
				+ salary + ", time=" + time + "]";
	}

	
	public static void main(String[] args) {
		System.out.println("finally");
	}

	

}




