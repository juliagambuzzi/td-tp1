package com.alexaitken.gildedrose.impl;

import com.alexaitken.gildedrose.ItemDecorator;
import com.alexaitken.gildedrose.update.AgedBrieItemUpdateStrategy;


public class AgedBrieItem extends ItemDecorator {

	public AgedBrieItem(int sellIn, int quality){
		super("Aged Brie", sellIn, quality);
		this.updateStrategy = new AgedBrieItemUpdateStrategy();
	}
	
}
