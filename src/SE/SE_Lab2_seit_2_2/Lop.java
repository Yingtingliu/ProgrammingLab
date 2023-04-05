package SE.SE_Lab2_seit_2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Lop {
	Collection<Person> personList = new ArrayList<Person>();
	
	public void add(Person person) {
		personList.add(person);
	}
	
	public void remove(Person person) {
		personList.remove(person);
	}
	
	public Person find(String name) {
	    Iterator<Person> iterator = personList.iterator();
	    while(iterator.hasNext()) {
	        Person person = iterator.next();
	        if(person.getName().equals(name)) {
	            return person;
	        }
	    }
	    return null;
	}
	
	public void print() {
		 Iterator<Person> iterator = personList.iterator();
		 while(iterator.hasNext()) {			 
			try {
				Person person = iterator.next();
				PrintStream ps = new PrintStream(new File("outputLop.txt"));
				person.print(ps);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			 
		 }
	}
}
