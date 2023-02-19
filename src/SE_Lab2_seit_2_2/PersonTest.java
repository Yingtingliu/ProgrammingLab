package SE_Lab2_seit_2_2;

import java.io.File;
import java.io.PrintStream;

import org.junit.Test;

public class PersonTest {
	
	@Test
	public void testPerson() {
		Date date = new Date(23, 01, 1998);
		Person person = new Person("John", date);
		try {
			PrintStream pStream = new PrintStream(new File("output.txt"));
			person.print(pStream);
			System.out.println(person.getName().toString());
			System.out.println(person.getAge(2023));
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Test
	public void testLop() {
		Lop lop = new Lop();
		Date date = new Date(23, 01, 1998);
		Person person1 = new Person("John", date);
		Person person2 = new Person("Doe", date);
		lop.add(person1);
		lop.add(person2);
		lop.print();
		lop.remove(person1);
		lop.print();
	}

}
