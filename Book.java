package com.collections.book;

public class Book {
	private int member_id,quantity;
	private String name,author,publisher;
	
	public Book(int member_id,String name,String author,String publisher,int quantity)
	{
		this.author=author;
		this.member_id=member_id;
		this.name=name;
		this.publisher=publisher;
		this.quantity=quantity;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [member_id=" + member_id + ", quantity=" + quantity + ", name=" + name + ", author=" + author
				+ ", publisher=" + publisher + "]";
	}
	
	

}
