package lab.main.jpa;

import lab.jpa.dao.AuthorDao;
import lab.jpa.entity.Author;

public class Main {

	public static void main(String[] args) {

		System.out.println("Start");

		AuthorDao dao = new AuthorDao();

		//Author aut = new Author(101, "Robert", "John", "Steve", 94000000);
		//Author aut = new Author(102, "Lucy", "Alice", "Edgar", 85000000);
		//Author aut = new Author(103, "Hannah", "Celia", "Edmund", 74000000);
		
		// insert
		//dao.addAuthor(aut);

		// update
//		aut.setPhoneNo(85000001);
//		dao.updateAuthor(aut);
		
		// delete
		dao.deleteAuthor(dao.getAuthorById(103));

		// search
		System.out.println(dao.getAuthorById(103));

		System.out.println("End");
	}
}
