package com.alexaitken.gildedrose.items;

import com.alexaitken.gildedrose.Item;

public class AgedBrieItem extends AbstractItem {

	public AgedBrieItem(int sellIn, int quality){
		this.item = new Item("Aged Brie", sellIn, quality);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
