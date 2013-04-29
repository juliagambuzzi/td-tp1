package com.alexaitken.gildedrose.items;

import com.alexaitken.gildedrose.Item;

public class BackstagePassesItem extends AbstractItem {

	public BackstagePassesItem(int sellIn, int quality){
		this.item = new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
