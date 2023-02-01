package file2817385l;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {
    private String name;
    private List<Component> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Component child : children) {
            size += child.getSize();
        }
        return size;
    }

    @Override
    public int getCount() {
        int count = 0;
        for (Component child : children) {
            count += child.getCount();
        }
        return count;
    }

    @Override
    public String display(String prefix) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append(name).append(": (count=").append(getCount()).append(", size=").append(getSize()).append(")\n");
        for (Component child : children) {
            sb.append(child.display(prefix + "\t")).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Component search(String name) {
        for (Component child : children) {
            if (child.getName().equals(name)) {
                return child;
            }
            Component result = child.search(name);
            if (result != null) {
                return result;
            }
        }
        return null;
    }
    
    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }
}