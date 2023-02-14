package AP_Lab5;

import java.io.File;
import java.io.FileInputStream;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class PasswordServer extends UnicastRemoteObject implements PasswordGenerator {
    private static final String host = "rmi://localhost"; // "//localhost" "//stlinux02.dcs.gla.ac.uk/"
    private static final String serviceName = "UnsecurePasswordServer";
    private static final int randomWordLength = 12;
    private static Map<Integer, String> wordMap = new HashMap<>();
    private static SecureRandom random = new SecureRandom();
    // dictionaries
    private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMERIC = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

    PasswordServer() throws RemoteException {
    }

    private static String generatePasswordFromDictionaries(int ID, int len, String dic) {
        if (wordMap.containsKey(ID)) {
            System.err.println("ID "+ID+" already has a password! ðŸ§");
            return wordMap.get(ID);
        }
        String word = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(dic.length());
            word += dic.charAt(index);
        }
        wordMap.put(ID, word);
        return word;
    }

    public String genPassword(int ID) throws RemoteException {
        System.err.println(ID + " is asking for a password ðŸ˜†");
        String password = generatePasswordFromDictionaries(ID, randomWordLength, ALPHA_CAPS + ALPHA + SPECIAL_CHARS + NUMERIC);
        System.err.println(ID + ", ðŸ¤« the server whispers back " + password);
        return password;
    }

    private static byte[] readFileToBytes(String filename){
        byte[] bytes = null;
		try {
			File file = new File(filename);
			bytes = new byte[ (int)(file.length()) ];
			(new FileInputStream( file )).read( bytes );
		} catch(Exception e) {
			System.out.println("ðŸ˜± Server exception while reading the spec file: " + e.toString());
			e.printStackTrace();
		}
        return bytes;
	}

    public byte[] downloadSource(int ID, String password) throws RemoteException {
        System.err.println("Incoming! ID "+ID+" has sent " + password);
        if (wordMap.containsKey(ID)) {
            String passwordStored = wordMap.get(ID);
            System.err.println("MY records show that ID "+ID+" has the password " + passwordStored);
            if (password.equals(passwordStored)) {
                System.err.println("ID's "+ID+" password matches! ðŸŽ‰  Sending them the source file...");
                byte[] bytes = readFileToBytes("PasswordServer.java");
                if (bytes == null)
                    System.err.println("ðŸ¤” Something went wrong with reading the source file into an array of bytes!");
                return bytes;
            } else {
                System.err.println("ID's"+ID+" password does not match! ðŸ˜¢");
            }
        }
        return null;
    }

    public static void main(String[] args){
        try {
            PasswordServer s = new PasswordServer();
            Naming.rebind(host+serviceName, s);
            System.err.println("Password server is ready ðŸ’ª");
            
             byte[] bytes = readFileToBytes("PasswordServer.java");
             System.out.println(bytes.toString());
        } catch (Exception e) {
            System.err.println("ðŸ˜± Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}