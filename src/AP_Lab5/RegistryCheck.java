package AP_Lab5;

import java.rmi.Naming;

public class RegistryCheck {

	public static void main(String[] args) {
        try {
            String host = "rmi://localhost";
            String serviceName = "PasswordServer";

            Object obj = Naming.lookup(host + serviceName);
            System.out.println("Successfully looked up object: " + obj);
        } catch (Exception e) {
            System.err.println("Failed to look up object: " + e);
        }
    }

}
