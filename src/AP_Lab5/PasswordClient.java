
package AP_Lab5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.rmi.Naming;

public class PasswordClient {
    private static String host = "rmi://localhost"; // "//localhost" "//stlinux02.dcs.gla.ac.uk/"
    private static String serviceName = "UnsecurePasswordServer";

    public static void writeBytesToFile(byte[] bytes, OutputStream out){
		try {
			out.write(bytes);
		} catch(Exception e) {
			System.err.println("😱 Client exception while writing to file: " + e.toString());
			e.printStackTrace();
		}
   	}

    public static void main(String[] args){
        try {
            // TODO: create stub
        	PasswordGenerator stub = (PasswordGenerator) Naming.lookup(host+serviceName);
            int myID = 2817385;
            // TODO: use stub to generate password
            String returnWord = stub.genPassword(myID);
            System.out.println(returnWord);
            OutputStream output = null;
            String outputFilename = "sauce.java";
            try {
                output = new FileOutputStream(outputFilename);
            } catch (FileNotFoundException e) {
                System.err.println("😱 Client exception while trying to create file: " + e.toString());
                e.printStackTrace();
            }
            byte[] bytes = stub.downloadSource(myID, outputFilename);// TODO: use stub to download source file
            writeBytesToFile(bytes, output);
            System.out.println("Written file @ " + outputFilename + " 😏");
        } catch (Exception e) {
            System.err.println("😱 Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
