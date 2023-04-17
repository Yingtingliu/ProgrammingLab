package DSA.Test2AE1;
// Ying Ting Liu 2817385L
//add import statements

import java.util.Objects;

//a bond is a pair (Atom, weight)
public class Bond {
	
	private Atom child;
	private int weight;
	
	//add constructor, getters setters
    	//and any other methods you require (if any)
	
	// self-defined ---------
	public Bond(Atom child, int weight) {
		super();
		this.child = child;
		this.weight = weight;
	}

	public Atom getChild() {
		return child;
	}

	public void setChild(Atom child) {
		this.child = child;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}


	
}
