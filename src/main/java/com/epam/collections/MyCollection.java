package com.epam.collections;

import java.util.AbstractList;
import java.util.LinkedList;

public class MyCollection {
	private LinkedList<Items> list;

	
	public boolean add(Items x)
	{
		if(list==null) list=new LinkedList<Items>();
		list.add(x);return true;
	}
	public void delete(int index) {
		if(index>=list.size()) {
			System.out.println("Enter valid index");
			return;
		}
		Items removed=list.remove(index);
		System.out.println("Object deleted is: "+removed);
	}

	public Items get(int index) {
		if(index>=list.size()) {
			System.out.println("Enter valid index");
			return null;
		}
		return list.get(index);
	}

	public int size() {
		return  list.size();
	}
	
	public void print() {
		if(list.size()==0) {
			System.out.println("List is empty");
			return;
		}
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}
