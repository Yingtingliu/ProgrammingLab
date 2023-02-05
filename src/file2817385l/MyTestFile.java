package file2817385l;

public class MyTestFile {
	
	public static void main(String[] args) {
		
		File courseworkpdf = new File("courseworkpdf",1);
		File courseworkzip = new File("coursework zip file",2);

		Directory coursework = new Directory("coursework");
		try {
			coursework.add(courseworkpdf);
			// Remove a file that doesn't exist
			coursework.remove(courseworkzip);
			// Add a null file
			coursework.add(null);
		} catch (Exception e1){
			e1.printStackTrace();
		}
		
		try {
			System.out.println(coursework.display("\t"));
			System.out.println(coursework.search("unit test 1").getName());
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		
		// Test Case 1: Add and Remove Files/Directories
	    System.out.println("Test Case 1:");
	    File file1 = new File("file1", 10);
	    File file2 = new File("file2", 20);
	    Directory dir1 = new Directory("dir1");
	    dir1.add(file1);
	    dir1.add(file2);
	    System.out.println(dir1.display("\t"));
	    dir1.remove(file2);
	    System.out.println(dir1.display("\t"));
	    System.out.println();

	    // Test Case 2: Correct Display of File System
	    System.out.println("Test Case 2:");
	    File file3 = new File("file3", 30);
	    File file4 = new File("file4", 40);
	    Directory dir2 = new Directory("dir2");
	    dir2.add(file3);
	    dir2.add(file4);
	    Directory root = new Directory("root");
	    root.add(dir1);
	    root.add(dir2);
	    System.out.println(root.display("\t"));
	    System.out.println();

	    // Test Case 3: Search for Directory Containing Filename
	    System.out.println("Test Case 3:");
	    Component result = root.search("file4");
	    System.out.println(result.getName());
	    System.out.println();

	    // Test Case 4: Search for Non-Existent Filename
	    System.out.println("Test Case 4:");
	    result = root.search("file5");
	    System.out.println(result);
	    System.out.println();

	    // Test Case 5: Add/Remove with No Files/Directories
	    System.out.println("Test Case 5:");
	    Directory dir3 = new Directory("dir3");
	    dir3.add(file1);
	    dir3.remove(file1);
	    System.out.println(dir3.display("\t"));
	    System.out.println();

	    // Test Case 6: Search with No Files/Directories
	    System.out.println("Test Case 6:");
	    result = dir3.search("file1");
	    System.out.println(result);
	    System.out.println();

	    // Test Case 7: Case-Sensitive Search
	    System.out.println("Test Case 7:");
	    result = root.search("File4");
	    System.out.println(result);
	    System.out.println();

	    // Test Case 8: Encapsulation
	    System.out.println("Test Case 8:");
	    System.out.println(dir1.getName());
	    System.out.println(dir1.getSize());
	    System.out.println(dir1.getCount());
	    System.out.println();

	    // Test Case 9: Implementation of Interface
	    System.out.println("Test Case 9:");
	    System.out.println(root instanceof Component);
	    System.out.println(file1 instanceof Component);
	    System.out.println();
	    
	    // Test display
	    // Test display 1:
	    System.out.println("Test Display 1:");
	    File file5 = new File("testFile1", 100);
	    Directory directory1 = new Directory("testDirectory");
	    directory1.add(file5);

	    Component result1 = directory1.search("testFile1");
	    if(result1 != null && result1.getName().equals("testFile1")) {
	        System.out.println("Test case 1: PASSED");
	    } else {
	        System.out.println("Test case 1: FAILED");
	    }
	    System.out.println();
		    
	    // Test display 2:
	    System.out.println("Test Display 2:");
	    Component result2 = directory1.search("testfile1");
	    if(result2 == null) {
	        System.out.println("Test case 2: PASSED");
	    } else {
	        System.out.println("Test case 2: FAILED");
	    }
	    System.out.println();
	    
	    // Test display 3:
	    System.out.println("Test Display 3:");
	    File file6 = new File("testFile1", 100);
	    Directory directory2 = new Directory("nestedDirectory1");
	    directory2.add(file6);
	    Directory directory3 = new Directory("nestedDirectory2");
	    directory3.add(directory2);

	    Component result3 = directory3.search("testFile1");
	    if(result3 != null && result3.getName().equals("testFile1")) {
	        System.out.println("Test case 3: PASSED");
	    } else {
	        System.out.println("Test case 3: FAILED");
	    }
	    
	}

}
