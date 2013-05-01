package com.alexaitken.gildedrose.impl;

import com.alexaitken.gildedrose.ItemDecorator;
import com.alexaitken.gildedrose.update.SulfuraItemUpdateStrategy;



public class SulfurasHandOfRagnarosItem extends ItemDecorator {

	public SulfurasHandOfRagnarosItem(int sellIn, int quality){
		super("Sulfuras, Hand of Ragnaros", 0, quality);
		this.updateStrategy = new SulfuraItemUpdateStrategy();		
	}
	
}
