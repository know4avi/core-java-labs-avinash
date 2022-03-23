package lab.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author2_table")
public class Author2 {
	
	@Id //primary key
	@Column(name  = "author_id")
	private int authorId;
	
	@Column(name  = "name")
	private String name;

	public Author2() {
		super();
	}

	public Author2(int authorId, String name) {
		super();
		this.authorId = authorId;
		this.name = name;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author2 [authorId=" + authorId + ", name=" + name + "]";
	}

}
