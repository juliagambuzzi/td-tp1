package com.alexaitken.gildedrose.update;

import com.alexaitken.gildedrose.Item;
import com.alexaitken.gildedrose.ItemUpdateStrategy;

public class AgedBrieItemUpdateStrategy implements ItemUpdateStrategy {

	public void update(Item itemDecorator) {
		
		int sellIn = itemDecorator.getSellIn();
		int quality = itemDecorator.getQuality();
		
		//sellIn decrement every day
		itemDecorator.setSellIn(sellIn--);
		
		//Aged Brie increment it's quality each day
		if(quality < 50 && sellIn < 0){
			itemDecorator.setQuality(quality+2);
		}else{
			itemDecorator.setQuality(quality++);
		}
			
	}

}
