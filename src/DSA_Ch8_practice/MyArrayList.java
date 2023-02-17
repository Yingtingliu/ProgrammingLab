package DSA_Ch8_practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements List<E>{
	
	private E[] elems;	
	private int size;	
	
	// create a new array list
	public MyArrayList(E[] elems, int size) {
		super();
		this.elems = elems;
		this.size = 0;
	}
	
	// limited array list
	@SuppressWarnings("unchecked")
	public MyArrayList(int cap) {		
		this.elems = (E[]) new Object[cap];
		this.size = 0;
	}	
	
	@Override
	public int size() {		
		return this.size;
	}
	@Override
	public boolean isEmpty() {
		boolean empty = false;
		if(size==0 && elems ==null) {
			empty = true;
		}
		return empty;
	}
	
	@SuppressWarnings("unused")
	@Override
	public boolean contains(Object o) {
		for(Object elem : this.elems) {
			if(elem == o) return true;
		}
		return false;
	}
	
	@Override
    public Iterator<E> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator<E> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E element = elems[index];
            index++;
            return element;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		this.size =0;		
	}
	@Override
	public E get(int index) {
		if(index > this.size) return null;		
		return this.elems[index];
	}
	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}


}
