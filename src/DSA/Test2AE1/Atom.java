package DSA.Test2AE1;
// Ying Ting Liu 2817385L
// and import statements
import java.util.*;

public class Atom {

	private String element;
	private List<Bond> bonds = new ArrayList<Bond>();// the bonds to child atoms
	private int valency;

	// this map has been included to help you look up valencies
	// but you can ignore it (and delete it) if you want to use something else

	private static final Map<String, Integer> VALENCY_MAP = createMap();

	private static Map<String, Integer> createMap() {
		Map<String, Integer> result = new HashMap<>();
		result.put("H", 1);// hydrogen
		result.put("C", 4);// carbon
		result.put("B", 3);// boron
		result.put("N", 3);// nitrogen
		result.put("O", 2);// oxygen
		result.put("F", 1);// fluorine
		result.put("P", 3);// phosphorous
		result.put("S", 2);// sulphur
		result.put("Cl", 1);// chlorine
		result.put("Br", 1);// bromine

		return Collections.unmodifiableMap(result);
	}
	
	// self-defined ------------------
	// now add all of the Atom constructors and methods you require
	public Atom(String element) {
		this.element = element;
		this.valency = VALENCY_MAP.get(element);
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public List<Bond> getBonds() {
		return bonds;
	}

	public void setBonds(List<Bond> bonds) {
		this.bonds = bonds;
	}

	public int getValency() {
		return valency;
	}

	public void setValency(int valency) {
		this.valency = valency;
	}


}
