package com.alexaitken.gildedrose.impl;

import com.alexaitken.gildedrose.ItemDecorator;


public class AgedBrieItem extends ItemDecorator {

	public AgedBrieItem(int sellIn, int quality){
		super("Aged Brie", sellIn, quality);
		this.updateStrategy = new Example1ItemUpdateStrategy();
	}
	
}
