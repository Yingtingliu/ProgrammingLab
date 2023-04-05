package Prog.Lab5_ExceptionAndIO.Bank2;

public class Person {
	private String name;
	private int age;
	private String eyeColour;
	public Person(String name, int age, String eyeColor) {
		this.name = name;
		this.age = age;
		this.eyeColour = eyeColour;
	}
	public Person(String name, int age) {
		// Alternative constructor
		this.name = name;
		this.age = age;
		this.eyeColour = ""; // Not *needed*, but neater
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEyeColour(String e) {
		eyeColour = e; // we don't *have* to use _this_
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEyeColour() {
		return eyeColour;
	}
	public String toString() {
		return name + " is " + age + " years old";
	}
}
