package DSA.DSA_Ch8_lecture.lists;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E> {
	// Each List<E> object is a homogeneous list
	// whose elements are of type E.
	// ////////// Accessors ////////////

	private Node<E> first, last;
	private int size;

	// ////////// Inner class ////////////
	private static class Node<E> {
		public E element;
		public Node<E> next;

		public Node(E x, Node<E> s) {
			element = x;
			next = s;
		}
		
		
	}

	// ////////// Constructor ////////////
	public LinkedList() {
		first = last = null;
		size = 0;
	}

	// Return true if and only if this list is empty.
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	// Return this list�s length.
	@Override
	public int size() {
		return size;
	}

	// ///////// Auxiliary method ///////////
	private Node<E> locate(int p) {
		// Return a link to the node at position p in this list.
		Node<E> curr = first;
		for (int j = 0; j < p; j++)
			curr = curr.next;
		return curr;
	}

	// Return the element at position p in this list.
	@Override
	public E get(int p) {
		if (p < 0 || p >= size)
			throw new NoSuchElementException();
		return locate(p).element;
	}

	// Return true if and only if this list and that have the
	// same length, and each element of this list equals
	// the corresponding element of that.
	@Override
	public boolean equals(List<E> that) {
		if (this.size != that.size())
			return false;
		boolean same = true;

		Node<E> position1 = this.first; // position in the first list
		int index = 0; // position in the second list
		while (position1 != null && same) {
			if (position1.element != that.get(index))
				same = false;
			else {
				position1 = position1.next;
				index++;
			}
		}
		return same;
	}

	public Node<E> getFirst() {
		return first;
	}

	public void setFirst(Node<E> first) {
		this.first = first;
	}

	public Node<E> getLast() {
		return last;
	}

	public void setLast(Node<E> last) {
		this.last = last;
	}

	// //////////Transformers ////////////

	// Make this list empty.
	@Override
	public void clear() {
		first = last = null;
		size = 0;
	}

	// Replace the element at position p in
	// this list by it.
	@Override
	public void set(int p, E it) {
		if (size == 0 || size <= p)
			throw new NoSuchElementException();
		Node<E> temp = new Node<E>(it, null);
		if (p == 0) {
			temp.next = first.next;
			first = temp;
			if (size == 1)
				last = temp;
		} else {
			Node<E> temp1 = first;
			for (int i = 0; i < p - 1; i++)
				temp1 = temp1.next; // identified node before replacement point
			Node<E> temp2 = temp1.next.next; // node after replacement point
			temp1.next = temp;
			temp.next = temp2;
			if (p == size - 1)
				last = temp;// if replacing final node
		}
	}

	// Add it at position p in this list.
	@Override
	public void add(int p, E it) {
		Node<E> temp = new Node<E>(it, null);
		if (size == 0) {
			first = last = temp;
			size++;
		} else {
			if (p == size)
				addLast(it);
			else {
				Node<E> temp1 = locate(p - 1);
				Node<E> temp2 = temp1.next;
				temp1.next = temp;
				temp.next = temp2;
				size++;
			}
		}

	}

	

	// Add it after the last element of this list.
	@Override
	public void addLast(E it){
		Node<E> temp = new Node<E>(it, null);
		if(size==0){
			first=last=temp;
			size++;
		}
		else{
			last.next=temp;
			last=temp;
			size++;
		}
	}
		

	// Add all the elements of that after the
	// last element of this list.
	@Override
	public void addAll(List<E> that){
		if(!that.isEmpty()){
			for(E e:that) addLast(e);
		}
	}

	// Remove and return the element at
	// position p in this list.
	@Override
	public E remove(int p){
		if(size==0||size<=p) throw new NoSuchElementException();
		else{
			if(size==1){
				E e=first.element;
				first=last=null;
				size--;
				return e;
			}
			//are we removing the head?
			if(p==0){
				E e=first.element;
				first=first.next;
				size--;
				return e;
			}
			Node<E> precursor = locate(p-1);
			E e = precursor.next.element;
			precursor.next = precursor.next.next;
			//did we remove the tail?
			if(p==size-1) last=precursor;
			size--;
			return e;
			
				
			}
			
		
	}
	
	// ////////// Iterator ////////////

	// Return an iterator that will visit all
	// elements of this list, in left-to-right order.
	@Override
	public Iterator<E> iterator () {
		return new LRIterator();
		}
	//////////// Inner class ////////////
	private class LRIterator
	implements Iterator<E> {
		// An LRIterator object is a left-to-right iterator over 
		// a LinkedList<E> object.
		private Node<E> position;
		// position is a link to the node containing the next 
		// element to be visited.
		private LRIterator () {
			position = first;
			}
		
		@Override
		public boolean hasNext () {
			return (position != null);
			}
		@Override
		public E next () {
			if (position == null) throw new NoSuchElementException();
			E nextElem = position.element;
			position = position.next;
			return nextElem;
			}

		
		@Override
		public void remove() {
			// not implemented
			
		}

		}

}
