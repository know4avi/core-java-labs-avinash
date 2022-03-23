package lab.jpa.dao;

import lab.jpa.entity.Author;

public interface IAuthorDao {

	public abstract Author addAuthor(Author author);

	public abstract Author updateAuthor(Author author);

	public abstract Author deleteAuthor(Author author);

	public abstract Author getAuthorById(int authorId);
}