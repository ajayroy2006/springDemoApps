package io.cg.taxation.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "house", schema = "public")
public class house {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="House_Id")
private long id;

@OneToOne(mappedBy = "house")
private area oarea;

@OneToMany(mappedBy = "house")
private List<person> personList;

private String address;


public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public area getoArea() {
	return oarea;
}
public void setoArea(area oArea) {
	this.oarea = oArea;
}
public List<person> getPersonList() {
	return personList;
}
public void setPersonList(List<person> personList) {
	this.personList = personList;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}



}
