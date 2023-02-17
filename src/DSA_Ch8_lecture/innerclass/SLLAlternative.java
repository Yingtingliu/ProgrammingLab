package DSA_Ch8_lecture.innerclass;
//generic SLL
// in this version we don't have a generic Node, it just assumes the type of the outer class
// so Node inner class no longer has to be static
public class SLLAlternative<E> {

	// Each SLL object is the header of 
	// a singly-linked-list
			private Node first;
			public SLLAlternative () {
				// Construct an empty SLL.
				first = null;
				}
			
			
	////////// Inner class //////////
			private  class Node {
				// Each Node object is a node of a
				// singly-linked-list. 
				protected E element;
				protected Node next;
				public Node(E elem, Node n) {
					element = elem;
					next = n;
				}
			}
			
			public void printFirstToLast () {
				// Print all elements in this SLL, in first-to-last order.
				Node curr = first;
				while (curr != null) {
					System.out.println(curr.element);
					curr = curr.next;
					}
				}
			
			
			
			public void insert (E elem, Node pred) {
				// Insert elem at a given point in this SLL, either after the 
				// node pred, or before the first node if pred is null.
				Node ins = new Node(elem, null);
				if (pred == null) {
					ins.next = first;
					this.first = ins;
					} else {
						ins.next = pred.next;
						pred.next = ins;
						}
				}
			
			public void insert(E elem){
				//Insert elem at head of list
				insert(elem,null);
			}
			
			public void deleteFirst () {
				// Delete this SLLs first node (assuming length > 0).
				first = first.next;
				}
			
			public void delete(Node del){
				//delete node del from this SLL
				Node next = del.next;
				if(del==first) first=next;
				else{
					Node pred = first;
					while(pred.next!=del)
						pred = pred.next;
					pred.next=next;
				}
			}
			
			public Node search (E target) {
				// Find which (if any) node of this SLL contains an 
				// element equal to target. Return a link to the 
				// matching node (or null if there is none).
				Node curr = first;
				while (curr != null) {
					if (target.equals(curr.element))
						return curr;
					curr = curr.next;
					}
				return null;
					
			}
			
			public void reverse(){
				Node curr = this.first;
				Node pred = null;
				Node next = null;
				while (curr!=null){
					next = curr.next;
					curr.next = pred;
					pred = curr;
					curr = next;
				}
				first=pred;
				
				
			}
				
	
	
}
