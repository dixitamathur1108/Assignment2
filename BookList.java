package com.collections.book;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class BookList {
	Scanner sc=new Scanner(System.in);
	String ch="y";
	String sortoption;
	ArrayList<Book> books=new ArrayList<Book>();
	
	public BookList()
	{
		books.add(new Book(1,"2 States","Chetan Bhagat","abc",78));
		books.add(new Book(2,"Untruly Yours","Smita SHetty","abc",22));
		books.add(new Book(3,"Half Girfriend","Chetan Bhagat","xyz",30));
		books.add(new Book(4,"Wings of Fire","APJ Abdul Kalam","abc",45));
		books.add(new Book(5,"Train to Pakistan","Khushwant Singh","pqr",100));
	    Iterator i=books.iterator();
	    while(i.hasNext())
	    {
	    	Object obj=(Book)i.next();
	    	System.out.println(obj);
	    }
		
	}
	
	public void sortByUser()
	{
		while(ch.equals("y"))
		{
			
			System.out.println("On which basis do you want to sort the books?(ID/name/author/publisher/quantity)");
			sortoption=sc.next();
			if(sortoption.equals("ID"))
			{
				SortById s=new SortById();
				books.sort(s);
				System.out.println(books);
			}
			else if(sortoption.equals("name"))
			{
				SortByName s=new SortByName();
				books.sort(s);
				System.out.println(books);
			}
			else if(sortoption.equals("author"))
			{
				SortByAuthor s=new SortByAuthor();
				books.sort(s);
				System.out.println(books);
			}
			else if(sortoption.equals("publisher"))
			{
				SortByPublisher s=new SortByPublisher();
				books.sort(s);
				System.out.println(books);
			}
			else if(sortoption.equals("quantity"))
			{
				SortByQuantity s=new SortByQuantity();
				books.sort(s);
				System.out.println(books);
			}
			else
			{
				System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue?(y/n)");
			ch=sc.next();
			
		}
		if(ch.equals("n"))
		{
			System.out.println("Thank you!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookList b=new BookList();
		b.sortByUser();
	}

}
