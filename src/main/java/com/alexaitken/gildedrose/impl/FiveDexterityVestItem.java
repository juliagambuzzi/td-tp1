package com.alexaitken.gildedrose.impl;

import com.alexaitken.gildedrose.ItemDecorator;
import com.alexaitken.gildedrose.update.impl.DefaultItemUpdateStrategy;


public class FiveDexterityVestItem extends ItemDecorator {

	public FiveDexterityVestItem(int sellIn, int quality) {
		super("5 Dexterity Vest", sellIn, quality);
		this.updateStrategy = new DefaultItemUpdateStrategy();		
	}

}
