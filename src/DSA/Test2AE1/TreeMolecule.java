package DSA.Test2AE1;
// Ying Ting Liu 2817385L

//add import statement


public class TreeMolecule implements Molecule {
    // predefined
    private Atom first;

    //add constructor, implemented methods and any helper methods you require

    // self-added ------------------
    public TreeMolecule(Atom atom) {
        this.first = atom;
    }

    @Override
    public boolean addBond(Atom a1, Atom a2, int strength) {

        if (a1 == null || a2 == null || strength < 1) {
            return false;
        }

        // check if the bond can be added
        if (a1.getValency() - getTotalWeight(a1) - strength >= 0) {
            a1.getBonds().add(new Bond(a2, strength));
            return true;
        } else {
            return false;
        }
    }

    private int getTotalWeight(Atom a) {
        int totalWeight = 0;
        for (Bond bond : a.getBonds()) {
            totalWeight += bond.getWeight();
        }
        return totalWeight;
    }

    @Override
    public boolean contains(Atom a) {
        // start the search from the root atom
        return search(first, a);
    }

    private boolean search(Atom current, Atom target) {
        // check if the current atom is the target atom
        if (current.equals(target)) {
            return true;
        }

        // recursively search the child atoms of the current atom
        for (Bond bond : current.getBonds()) {
            if (search(bond.getChild(), target)) {
                return true;
            }
        }

        // target atom not found in the subtree rooted at the current atom
        return false;
    }

    @Override
    public String smilesString() {
        String smiles = "";
        return smilesRecursive(smiles, first);
    }

    private String smilesRecursive(String smiles, Atom current) {

        // Append this atom's element symbol to the SMILES string
        smiles += current.getElement();

        // If this atom has no bonds, we've finished generating the SMILES string for it
        if (current.getBonds().isEmpty()) {
            return smiles;
        }

        // If this atom has more than one bond, enclose its SMILES string in parentheses
        if (current.getBonds().size() > 1) {
            smiles += "(";
        }

        // Keep track of how many bonds have been processed so far
        int count = 0;

        for (Bond bond : current.getBonds()) {

            // If this isn't the first bond for this atom, open a new set of parentheses
            // to encapsulate the bond's SMILES string
            if (count > 0) {
                smiles += ")";
                smiles += "(";
            }

            // Append a bond symbol to the SMILES string based on its weight
            if (bond.getWeight() == 2) {
                smiles += "=";
            } else if (bond.getWeight() == 3) {
                smiles += "#";
            }

            // Recursively generate the SMILES string for the atom at the other end of the bond
            smiles = smilesRecursive(smiles, bond.getChild());

            // Increment the bond counter
            count++;
        }

        // If this atom had more than one bond, close the final set of parentheses
        if (current.getBonds().size() > 1) {
            smiles += ")";
        }

        // Return the complete SMILES string for the molecule
        return smiles;
    }

    @Override
    public String structuralFormula() {
        String formula = "";
        return formulaRecursive(formula, first, 0);
    }

    private String formulaRecursive(String formula, Atom atom, int bondWeight){
        int hydrogen = atom.getValency() - getTotalWeight(atom) - bondWeight;
        if ( hydrogen == 0) {
            formula += atom.getElement();
        } else if (hydrogen == 1){
            formula += atom.getElement() + "H";
        } else if (hydrogen > 1){
            formula += atom.getElement() + "H" + hydrogen;
        }

        if (atom.getBonds().isEmpty()) {
            return formula;
        }

        if (atom.getBonds().size() > 1) {
            formula += "(";
        }

        int count = 0;

        for (Bond bond : atom.getBonds()) {

            if (count > 0) {
                formula += ")";
                formula += "(";
            }

            if (bond.getWeight() == 2) {
                formula += "=";
            } else if (bond.getWeight() == 3) {
                formula += "#";
            }
            formula = formulaRecursive(formula, bond.getChild(), bond.getWeight());

            count++;
        }

        if (atom.getBonds().size() > 1) {
            formula += ")";
        }

        return formula;
    }
}
