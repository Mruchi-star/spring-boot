package org.local.DAO;

public class LocalDAO {

	private final long id;
	private final String content;

	public LocalDAO(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	

}
