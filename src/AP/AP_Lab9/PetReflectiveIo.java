package AP.AP_Lab9;

import java.io.PrintStream;
import java.lang.reflect.Field;

public class PetReflectiveIo {
	
	Cat tom = new Cat(null, 0);
//	tom.name = "Tom";
	
	public void print() {
		PrintStream ps = new PrintStream(System.out);
		Class<?> tomCatClass = tom.getClass();
		ps.println("print Name of the class");
		ps.println(tomCatClass.getName());
		
		ps.println("print Basic Name of the class");
		ps.println(tomCatClass.getSimpleName());
		
		Field[] catFields = tomCatClass.getFields();
		ps.println("print length of cat fields including parent fields");
		ps.println(catFields.length);
		
		ps.println("print all field:");
		for(Field field1: catFields) {
			ps.println(field1.getName());
		}
		
		Field[] catDeclFields = tomCatClass.getDeclaredFields();
		ps.println("print declared field:");
		for(Field field: catDeclFields) {
			ps.println(field.getName());			
		}
		
		try {
			System.out.println(catFields[0].get(tom));
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		PetReflectiveIo petReflectiveIo = new PetReflectiveIo();
		petReflectiveIo.print();
	}

}
