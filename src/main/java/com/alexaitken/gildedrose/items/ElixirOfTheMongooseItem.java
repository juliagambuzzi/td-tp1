package com.alexaitken.gildedrose.items;

import com.alexaitken.gildedrose.Item;


public class ElixirOfTheMongooseItem extends AbstractItem {

	
	public ElixirOfTheMongooseItem(int sellIn, int quality){
		this.item = new Item("Elixir of the Mongoose", sellIn, quality);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
