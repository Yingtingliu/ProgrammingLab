package AP_Lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PetTest {
	
	public static void main(String args[]){
	
		ArrayList<Pet> petArray = new ArrayList<Pet>();
		petArray.add(new Pet("PetMary"));
		petArray.add(new Dog("DogBob",0,"alaska","white","freeisbee"));
		petArray.add(new Cat("CatJoe",0,"english short hair","grey","book shelf"));
		
		// because the array type is pet, so toString method will call the to pet method's toString.
		System.out.println(petArray.get(0).toString());
		
		
		// because it consider the type of pet, so it can't use method in Dog.
//		System.out.println(	(petArray.get(1)).provideBone());
		// by casting, it can run the method
		System.out.println(	((Dog) petArray.get(1)).provideBone());
	}	
	
//	@Test
//	void test() {
//		Dog d1 = new Dog("apple", 0, null, null, "cool");
//		String aString = d1.provideBone();
////		assertEquals(aString, "123");
//		assertEquals(aString, "apple says thanks for the bone!");
//		
//	}
}
