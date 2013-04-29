package com.alexaitken.gildedrose.impl;

import com.alexaitken.gildedrose.ItemDecorator;



public class SulfurasHandOfRagnarosItem extends ItemDecorator {

	public SulfurasHandOfRagnarosItem(int sellIn, int quality){
		super("Sulfuras, Hand of Ragnaros", sellIn, quality);
		this.updateStrategy = new Example2ItemUpdateStrategy();		
	}
	
}
