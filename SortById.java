package com.collections.book;

import java.util.Comparator;

public class SortById implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		int r=o1.getMember_id()-o2.getMember_id();
		return r;
	}

}
