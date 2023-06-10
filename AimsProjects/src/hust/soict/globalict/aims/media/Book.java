package hust.soict.globalict.aims.media;

import  java.util.*;
public class Book extends Media{

	
	public Book(String category, String title, float cost) {
		super(category, title, cost);

	}

	private List<String> authors = new ArrayList<String>();

	public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }

}
