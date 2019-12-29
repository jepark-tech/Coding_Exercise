package codingExercise;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setFirstName(String newFirst) {
		firstName = newFirst;
	}
	
	public void setLastName(String newLast) {
		lastName = newLast;
	}
	
	public void setAge(int newAge) {
		if(newAge < 0 || newAge > 100) {
			age = 0;
		}
		else {
			age = newAge;
		}
	}
	
	public boolean isTeen () {
		if (age > 12 && age < 20) {
			return true;
		}
		return false;
	}
	
	public String getFullName() {
		if(firstName.isEmpty() && lastName.isEmpty()) {
			return "";
		}
		else if(lastName.isEmpty()) {
			return firstName;
		}
		else if(firstName.isEmpty()) {
			return lastName;
		}
		else
			return firstName + " " + lastName;
	}
	
	
	
	
	
	
}
