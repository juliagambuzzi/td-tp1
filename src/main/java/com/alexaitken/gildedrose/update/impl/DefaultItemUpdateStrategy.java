package com.alexaitken.gildedrose.update.impl;

import com.alexaitken.gildedrose.Item;
import com.alexaitken.gildedrose.update.ItemUpdateStrategy;

public class DefaultItemUpdateStrategy implements ItemUpdateStrategy {

	public void update(Item itemDecorator) {
		
		int sellIn = itemDecorator.getSellIn();
		int quality = itemDecorator.getQuality();
		
		itemDecorator.setSellIn(sellIn--);

		if(sellIn > 0){
			itemDecorator.setQuality(quality--);
		}else if(sellIn <= 0 && quality > 1){
			itemDecorator.setQuality(quality-2);
		}else if(sellIn <= 0 && quality == 1){
			itemDecorator.setQuality(quality--);
		}
	}

}
