package io.cg.taxation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="person",schema="public")
public class person {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Person_Id")
	
	 private long id;
	
	@NotNull
	 private String name;
	 private int age;
	 private String gender;
	 private String phone;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "fk_house_person")
	 private house house;
	 
	 public person() {
	  }
	  
	 
	public person(long id, String name, int age, String gender, String phone, house ohouse) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.house = ohouse;
	}


	public long getId() {
		return this.id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public house getHouse() {
		return house;
	}

	public void setHouseId(house ohouse) {
		this.house = ohouse;
	}


	

}
