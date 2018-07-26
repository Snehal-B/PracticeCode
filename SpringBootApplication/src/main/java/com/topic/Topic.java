package com.topic;

public class Topic {
private String id;
private String Name;
private String description;



public Topic(String id, String name, String description) {
	super();
	this.id = id;
	Name = name;
	this.description = description;
}
public Topic() {
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
