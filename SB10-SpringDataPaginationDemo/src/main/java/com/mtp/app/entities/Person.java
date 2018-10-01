package com.mtp.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Person {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(length = 50, nullable = false)
	private String firstName;
	@Column(length = 50, nullable = false)
	private String lastName;
	@Column(length = 80, nullable = false, unique = true)
	private String email;
	private Date doj;
	public Person() {
		super();
	}
	public Person(String firstName, String lastName, String email, Date doj) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.doj = doj;
	}
	public Integer getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public Date getDoj() {
		return doj;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", doj=");
		builder.append(doj);
		builder.append("]");
		return builder.toString();
	}
}
