package org.xzqtsg.webapp_core.domain.entity;

public class Role {

	public Role() {
	}

	private int id;
	private String name;
	private String purviews;
	private String parentId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurviews() {
		return purviews;
	}

	public void setPurviews(String purviews) {
		this.purviews = purviews;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}
