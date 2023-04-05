package AP.AP_Lab5;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
/*
 * This class is for rebind, if port has been occupied. 
 * */
public class MyServer {
    public static void main(String[] args) {
        try {
        	PasswordServer obj = new PasswordServer();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/PasswordServer", obj);
            System.out.println("MyRemoteObject bound in registry");
        } catch (RemoteException e) {
            System.out.println("MyRemoteObject not bound");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("MyRemoteObject not bound");
            e.printStackTrace();
        }
    }
}