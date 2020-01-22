package com.collections.book;

import java.util.Comparator;

public class SortByAuthor implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		String name1=o1.getAuthor();
		String name2=o2.getAuthor();
		int r=name1.compareTo(name2);
		return r;
	}

}
