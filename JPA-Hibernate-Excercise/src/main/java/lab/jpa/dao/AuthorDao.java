package lab.jpa.dao;

import javax.persistence.EntityManager;

import lab.jpa.entity.Author;

public class AuthorDao implements IAuthorDao {

	private EntityManager entityManager;

	public AuthorDao() {
		entityManager = JpaUtil.getEntityManager();
	}

	@Override
	public Author addAuthor(Author author) {
		entityManager.getTransaction().begin();
		entityManager.persist(author);
		entityManager.getTransaction().commit();
		return author;
	}

	@Override
	public Author updateAuthor(Author author) {
		entityManager.getTransaction().begin();
		entityManager.merge(author);
		entityManager.getTransaction().commit();
		return author;
	}

	@Override
	public Author deleteAuthor(Author author) {
		entityManager.getTransaction().begin();
		entityManager.remove(author);
		entityManager.getTransaction().commit();
		return author;
	}

	@Override
	public Author getAuthorById(int authorId) {
		entityManager.getTransaction().begin();
		Author aut = entityManager.find(Author.class, authorId);
		entityManager.getTransaction().commit();
		return aut;

	}

}
