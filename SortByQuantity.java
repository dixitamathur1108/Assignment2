package com.collections.book;

import java.util.Comparator;

public class SortByQuantity implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		int r=o1.getQuantity()-o2.getQuantity();
		return r;
	}

}
