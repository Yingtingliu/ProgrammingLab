package DSA_Ch7_lecture;

import java.util.NoSuchElementException;

public class LinkedQueue<E> implements Queue<E> {
	private Node<E> front, rear;
	private int size;
	/////////////// Inner class ///////////////
	private  static class Node<E> {
		public E element;
		public Node<E> next;
	
		public Node (E x, Node<E> s) {
			element = x; next = s;
			}
		}
/////////////// Constructor ///////////////
public LinkedQueue () {
	front = rear = null;
	size = 0;
	}
/////////////// Accessors ///////////////
@Override
public boolean isEmpty () {
	return (front == null);
	}

@Override
public int size () {
	return size;
	}
@Override
public E getFirst () {
	if (front == null) throw new NoSuchElementException();
	return front.element;
	}

//////////////Transformers ///////////////
@Override
public void clear () {
	front = rear = null;
			size = 0;
	}
@Override
public void addLast (E it) {
	Node<E> newest = new Node<E>(it, null);
	if (rear != null) rear.next = newest;
	else front = newest;
	rear = newest;
	size++;
	}
@Override
public E removeFirst () {
	if (front == null) throw new NoSuchElementException();
	E frontElem = front.element;
	front = front.next;
	if (front == null) rear = null;
	size--;
	return frontElem;
	}
}



	
	


