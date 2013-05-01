package com.alexaitken.gildedrose.update.impl;

import com.alexaitken.gildedrose.Item;
import com.alexaitken.gildedrose.update.ItemUpdateStrategy;

public class SulfuraItemUpdateStrategy implements ItemUpdateStrategy {

	public void update(Item itemDecorator) {
	
		//Sulfuras dosen't get old, sellIn is always zero
		//it's quality dosen't change
	}

}
