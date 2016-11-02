package org.jason.angularjs.bean;

public class Employee {

	int id;
	String name;
	String jobTitle;

	public Employee() {
		super();
	}

	public Employee(int i, String name, String jobTitle) {
		super();
		this.id = i;
		this.name = name;
		this.jobTitle = jobTitle;
	}

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

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
