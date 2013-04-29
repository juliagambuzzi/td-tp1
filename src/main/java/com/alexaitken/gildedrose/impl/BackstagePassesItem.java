package com.alexaitken.gildedrose.impl;

import com.alexaitken.gildedrose.ItemDecorator;


public class BackstagePassesItem extends ItemDecorator {

	public BackstagePassesItem(int sellIn, int quality){
		super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
		this.updateStrategy = new Example1ItemUpdateStrategy();
	}
	
}
