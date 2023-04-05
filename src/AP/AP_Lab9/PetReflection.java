package AP.AP_Lab9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PetReflection {
	
	static Cat kitty = new Cat(null, 0);

	public static void main(String[] args) {
		Class<?>  kittyClass = kitty.getClass();
		Method[] methods = kittyClass.getMethods();

		System.out.println("Choose a method for kitty! eat/hunt/sleep/purr");
		String methodName = new Scanner(System.in).nextLine();
		
		try {
			Method chosenMethod = kittyClass.getMethod(methodName);
			
			if (chosenMethod.getParameterCount() == 0) {
                chosenMethod.invoke(kitty);
            } else {
                System.out.println("Enter a parameter:");
                String param = new Scanner(System.in).nextLine();
                chosenMethod.invoke(kitty, param);
            }
			
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			
			e.printStackTrace();
		}
		
	}

}
