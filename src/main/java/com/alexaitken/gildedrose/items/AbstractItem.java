package com.alexaitken.gildedrose.items;

import com.alexaitken.gildedrose.Item;

public abstract class AbstractItem {

	protected Item item;
	
	public abstract void update();

	public int getSellIn() {
		return item.getSellIn();
	}
	
	public int getQuality(){
		return item.getSellIn();
	}

}
