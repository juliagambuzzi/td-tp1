package com.alexaitken.gildedrose.update.impl;

import com.alexaitken.gildedrose.Item;
import com.alexaitken.gildedrose.update.ItemUpdateStrategy;

public class ConjuredItemUpdateStrategy implements ItemUpdateStrategy {

	public void update(Item itemDecorator) {
		int sellIn = itemDecorator.getSellIn();
		int quality = itemDecorator.getQuality();
		
		itemDecorator.setSellIn(sellIn--);
		
		if(quality > 1){
			itemDecorator.setQuality(quality-2);
		}else if(itemDecorator.getQuality() == 1){
			itemDecorator.setQuality(quality--);
		}
	}

}
