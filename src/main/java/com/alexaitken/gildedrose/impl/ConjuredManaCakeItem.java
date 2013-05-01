package com.alexaitken.gildedrose.impl;

import com.alexaitken.gildedrose.ItemDecorator;
import com.alexaitken.gildedrose.update.impl.DefaultItemUpdateStrategy;


public class ConjuredManaCakeItem extends ItemDecorator {

	public ConjuredManaCakeItem(int sellIn, int quality){
		super("Conjured Mana Cake", sellIn, quality);
		this.updateStrategy = new DefaultItemUpdateStrategy();
	}

}
