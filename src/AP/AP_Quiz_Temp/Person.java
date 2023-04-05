package AP.AP_Quiz_Temp;

import java.io.Serializable;

public class Person implements Serializable{
	
	private String name;
    private int age;
//    private int id;
    private static final long serialVersionUID = 2L;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
//    public int getAgeAdd() {
//    	return age+1;
//    }

}
