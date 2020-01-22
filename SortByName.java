package com.collections.book;

import java.util.Comparator;

public class SortByName implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		String name1=o1.getName();
		String name2=o2.getName();
		int r=name1.compareTo(name2);
		return r;
	}

}
