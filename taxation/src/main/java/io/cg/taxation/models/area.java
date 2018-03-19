package io.cg.taxation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "area", schema = "public")
public class area {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="Area_Id")
	private Long id;
	private double total;
	private String unit;
	private double rate;

	 @OneToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "fk_house_area")
	 private house house;
	
	/*public area(Long id, double total, String unit, double rate) {
		super();
		this.id = id;
		this.total = total;
		this.rate = rate;
		this.unit = unit;
	}
		
	public area() {
		super();
	}*/
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public house getHouse() {
		return house;
	}

	public void setHouseId(house ohouse) {
		this.house = ohouse;
	}


	
	

}
