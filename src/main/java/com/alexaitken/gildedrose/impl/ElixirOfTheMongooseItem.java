package com.alexaitken.gildedrose.impl;

import com.alexaitken.gildedrose.ItemDecorator;



public class ElixirOfTheMongooseItem extends ItemDecorator {

	
	public ElixirOfTheMongooseItem(int sellIn, int quality){
		super("Elixir of the Mongoose", sellIn, quality);
		this.updateStrategy = new Example1ItemUpdateStrategy();		
	}

}
