/* 
 * note: String repeat() method can will only work on Java 11 or later version.
 * This is a file system design using Composite Pattern.
 * This is a Composite class, using a dictionary to store multiple files.
 * */

package file2817385l;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Directory implements Component {
	// This will store the leaves
	private List<Component> children;
	private String name;
    
	// Constructor - create the list and set the name
    public Directory(String name) {        
        this.children = new ArrayList<Component>();
        this.name = name;
    }
   
    public String getName() {
        return this.name;
    }
    
    // Composites normally delegate the methods to the leaves
    // iterate through leaf to get size
    public int getSize() {
        int size = 0;
        for (Component child : children) {
            size += child.getSize();
        }
        return size;
    }

    // iterate through leaf to count
    public int getCount() {
        int count = 0;
        for (Component child : children) {
            count += child.getCount();
        }
        return count;
    }

    // this is the level of dictionary
    private static int level =0;
    @Override
    public String display(String prefix) {
        StringBuilder sb = new StringBuilder();
        if (level != 0) {
            sb.append(prefix);
        }
        sb.append(name).append(": (count=").append(getCount()).append(", size=").append(getSize()).append(")");
        for (Component child : children) {
            if (child instanceof File) {
                level++;
//                sb.append(prefix.repeat(level - 1)).append(child.display(prefix));
                sb.append("\n").append(prefix.repeat(level-1)).append(child.display(prefix));
                level--;
            } else if (child instanceof Directory) {
                level++;
                sb.append("\n").append(prefix.repeat(level-1)).append(child.display(prefix));
                level--;
            }
        }
        return sb.toString();
    }

    @Override
    public Component search(String name) {
        for (Component child : children) {
            if (child instanceof File && child.getName().equals(name)) {
            	// return this object (dictionary)
                return this;
            }
            Component result = child.search(name);
            if (result != null) {
                return result;
            } 
        }
        return null;
    }
    
    // Add and remove just call the array list methods
    public void add(Component component) {
    	// check if empty or already exist
    	if (component == null) {
    		throw new IllegalArgumentException("Error: This is an empty component.");
    	} else if (children.contains(component)) {
    		throw new IllegalArgumentException("Error: file already exist in the dictionary.");
        } else {
        	// if it's a new file, add it to 
        	children.add(component);
        }
        
    }

    public void remove(Component component) {

        for (Component child : children) {
            if (child.equals(component)) {
                children.remove(child);
                return;
            }
            if (child instanceof Directory) {
                ((Directory) child).remove(component);
            }
        }

    }
}