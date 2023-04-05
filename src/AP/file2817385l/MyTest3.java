package AP.file2817385l;

public class MyTest3 {
	
	public static void main(String[] args) {
		
	  Directory dic1 = new Directory("dic1");
	  Directory dic2 = new Directory("dic2");
	  Directory dic3 = new Directory("dic3");
	  Directory dic4 = new Directory("dic4");
	  Directory dic5 = new Directory("dic5");

	  File coursework = new File("coursework",90);

	  dic4.add(dic5);
	  dic3.add(dic4);
	  dic2.add(dic3);
	  dic1.add(dic2);
	  dic5.add(coursework);
	  System.out.println("dic:"+ dic1.search("coursework").getName());
	  System.out.println(dic1.display("\t"));
	  dic5.remove(coursework);
	  dic1.remove(dic5);
	  System.out.println(dic1.display("\t"));
	  System.out.println(dic2.display("\t"));
	}
}
