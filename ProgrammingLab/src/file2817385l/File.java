package file2817385l;

public class File implements Component{
	
	private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
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
        // A file does not have any children, so its count is always 1
        return 1;
    }

    @Override
    public String display(String prefix) {
        return prefix + name + " (" + size + ")";
    }

    @Override
    public Component search(String name) {
        // A file does not have any children, so it cannot contain another file
        return null;
    }

}
