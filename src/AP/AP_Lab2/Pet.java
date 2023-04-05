package AP.AP_Lab2;

public class Pet extends AbstractPet{

	public Pet(String name, int age) {
		super(name, age);		
	}
	
	public Pet(String name) {
		super(name, 0);		
	}
	
	public String getName() {		
		return name;
	}
	public void setName(String name) {
		if (name !=null) {
			this.name = name;
		} else {
			System.out.println("Can't be null");
		}		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0) {
			this.age = age;
		} else {
			System.out.println("Can't be less than 0.");
		}
		
	}
	
	@Override
	public String toString() {
		return name + " is my pet and is aged " + age;
	}

}
