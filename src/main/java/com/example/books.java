package com.example;

public class books {
long id;
String name;
String author;

public books(long id, String name, String author) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
}
public long getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAuthor() {
	return author;
}
@Override
public String toString() {
	return "books [id=" + id + ", name=" + name + ", author=" + author + "]";
}

}
