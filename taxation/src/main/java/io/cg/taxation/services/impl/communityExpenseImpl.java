package io.cg.taxation.services.impl;

import io.cg.taxation.services.communityExpense;

public class communityExpenseImpl implements communityExpense {

	public communityExpenseImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public long getCommunityTax(long budget, int PopulationIncreased) {
		return budget + (budget*(PopulationIncreased/100));
	}

}
