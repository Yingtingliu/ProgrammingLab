/* 
 * This is a file system design using Composite Pattern.
 * This is a leaf class.
 * */

package file2817385l;

public class File implements Component{
	
	private String name;
    private int size;

    public File(String name, int size) {
        // check legal instance for creating a new file.
        if (size > 0 && name != null) {
        	this.name = name;
            this.size = size;
        } else {
            throw new IllegalArgumentException("Error: File size must be greater than 0, and must give a name.");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getCount() {
//        Since a file does not contain any files(children), count will always be 1
        return 1;
    }

    @Override
    public String display(String prefix) {
        return "\n" + prefix + name + " (" + size + ")" ;
    }

    @Override
    public Component search(String name) {
//        Since a file does not contain any files(children), return null
        return null;
    }    

}
