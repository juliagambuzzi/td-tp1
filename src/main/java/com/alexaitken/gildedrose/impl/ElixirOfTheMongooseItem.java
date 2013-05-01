package com.alexaitken.gildedrose.impl;

import com.alexaitken.gildedrose.ItemDecorator;
import com.alexaitken.gildedrose.update.impl.DefaultItemUpdateStrategy;



public class ElixirOfTheMongooseItem extends ItemDecorator {

	
	public ElixirOfTheMongooseItem(int sellIn, int quality){
		super("Elixir of the Mongoose", sellIn, quality);
		this.updateStrategy = new DefaultItemUpdateStrategy();		
	}

}
