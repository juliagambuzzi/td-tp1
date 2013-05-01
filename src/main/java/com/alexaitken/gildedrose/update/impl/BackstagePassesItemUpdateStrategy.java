package com.alexaitken.gildedrose.update.impl;

import com.alexaitken.gildedrose.Item;
import com.alexaitken.gildedrose.update.ItemUpdateStrategy;

public class BackstagePassesItemUpdateStrategy implements ItemUpdateStrategy {

	public void update(Item itemDecorator) {
		
		int sellIn = itemDecorator.getSellIn();
		int quality = itemDecorator.getQuality();
		
		itemDecorator.setSellIn(sellIn--);
		
		if(sellIn > 10){
			itemDecorator.setQuality(quality++);
		}else if(sellIn < 10 && sellIn > 5){
			itemDecorator.setQuality(quality+2);
		}else if(sellIn < 5 && sellIn > 0){
			itemDecorator.setQuality(quality+3);
		}else{
			itemDecorator.setQuality(0);
		}
		
	}

}
