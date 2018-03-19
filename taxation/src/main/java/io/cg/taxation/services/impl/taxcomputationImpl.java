package io.cg.taxation.services.impl;

import io.cg.taxation.services.taxcomputation;

public class taxcomputationImpl implements taxcomputation {

	private double commodityTax;
	private double areaTax;
	
	public double getCommodityTax() {
		return commodityTax;
	}

	public void setCommodityTax(double commodityTax) {
		this.commodityTax = commodityTax;
	}

	public double getAreaTax() {
		return areaTax;
	}

	public void setAreaTax(double areaTax) {
		this.areaTax = areaTax;
	}

	public taxcomputationImpl() {
	}
	
	public double getTotalTax()
	{
		return (this.areaTax + this.commodityTax);
		
	}

}
