/* 
 * This is a file system design using Composite Pattern.
 * This is a Composite class, using a dictionary to store multiple files.
 * */

package file2817385l;

import java.util.ArrayList;
import java.util.List;

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

    
    public String display(String prefix) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append(name).append(": (count=").append(getCount()).append(", size=").append(getSize()).append(")\n");
        
        for (Component child : children) {
            sb.append(child.display(prefix + "\t"));           
        }
        return sb.toString();
    }

    
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
    	if (!children.contains(component)) {
    		throw new IllegalArgumentException("Error: file not found in directory");
        } else {
        	children.remove(component);
        }        
    }
}