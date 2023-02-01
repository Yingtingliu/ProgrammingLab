package ttest;

public class Pupil {
	
	private String firstName;
	private String lastName;
	
	public boolean equals(Object o) {

		// your code here
		if(o.equals(firstName) && o.equals(lastName)) {
			return true;
		}else {
			return false;
		}
		
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
	
	

}
