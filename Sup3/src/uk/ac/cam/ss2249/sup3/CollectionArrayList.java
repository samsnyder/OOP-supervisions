package uk.ac.cam.ss2249.sup3;

import java.util.AbstractList;

public class CollectionArrayList<T> extends AbstractList<T> {

	Object[] data;
	int size;
	
	CollectionArrayList(int s){
		data = new Object[s];
	}
	
	CollectionArrayList(){
		this(10);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int i) {
		if(i >= size) throw new IndexOutOfBoundsException();
		return (T) data[i];
	}
	
	@Override
	public boolean add(T obj){
		add(size, obj);
		return true;
	}
	
	@Override
	public void add(int index, T obj){
		if(data.length <= size)
			grow();
		for(int i=index; i<size; i++)
			data[i+1] = data[i];
		data[index] = obj;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T set(int index, T obj){
		Object before = data[index];
		data[index] = obj;
		return (T) before;
	}
	
	@Override
	public int indexOf(Object obj){
		for(int i = 0; i<size; i++)
			if(data[i].equals(obj))
				return i;
		return -1;
	}
	
	@Override
	public int lastIndexOf(Object obj){
		for(int i = size-1; i>=0; i--)
			if(data[i].equals(obj))
				return i;
		return -1;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index){
		T obj = (T) data[index];
		for(int i = index; i<size-1; i++)
			data[i] = data[i+1];
		size--;
		return obj;
	}

	@Override
	public int size() {
		return size;
	}
	
	private void grow(){
		Object[] newData = new Object[data.length * 2];
		for(int i=0; i<size; i++)
			newData[i] = data[i];
		data = newData;
	}

}
