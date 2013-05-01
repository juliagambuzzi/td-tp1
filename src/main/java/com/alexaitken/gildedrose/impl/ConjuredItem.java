package com.alexaitken.gildedrose.impl;

import com.alexaitken.gildedrose.ItemDecorator;
import com.alexaitken.gildedrose.update.ConjuredItemUpdateStrategy;


public class ConjuredItem extends ItemDecorator {

	public ConjuredItem(int sellIn, int quality){
		super("Conjured", sellIn, quality);
		this.updateStrategy = new ConjuredItemUpdateStrategy();
	}
	
}
