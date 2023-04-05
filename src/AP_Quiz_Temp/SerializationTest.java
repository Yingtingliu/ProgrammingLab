package AP_Quiz_Temp;
import java.io.*;

public class SerializationTest {
	
	public static void main(String[] args) {
        // Creating an object to be serialized
        Person person = new Person("John", 30);
        
        // Serializing the object to a file
//        try {
//            FileOutputStream fileOut = new FileOutputStream("person.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(person);
//            out.close();
//            fileOut.close();
//            System.out.println("Object serialized to person.ser");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
        // Deserializing the object from a file
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person deserializedPerson = (Person) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Object deserialized from person.ser");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
