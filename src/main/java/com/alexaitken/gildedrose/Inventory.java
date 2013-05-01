package com.alexaitken.gildedrose;

import java.util.ArrayList;
import java.util.Collection;

import com.alexaitken.gildedrose.impl.AgedBrieItem;
import com.alexaitken.gildedrose.impl.BackstagePassesItem;
import com.alexaitken.gildedrose.impl.ConjuredManaCakeItem;
import com.alexaitken.gildedrose.impl.ElixirOfTheMongooseItem;
import com.alexaitken.gildedrose.impl.FiveDexterityVestItem;
import com.alexaitken.gildedrose.impl.SulfurasHandOfRagnarosItem;

public class Inventory {

	private Collection<ItemDecorator> items;

	public Inventory(Collection<ItemDecorator> items) {
		super();
		this.items = items;
	}

	public Inventory() {
		super();
		items = new ArrayList<ItemDecorator>();
		items.add(new FiveDexterityVestItem(10, 20));
		items.add(new AgedBrieItem(2,0));
		items.add(new ElixirOfTheMongooseItem(5, 7));
		items.add(new SulfurasHandOfRagnarosItem(0, 80));
		items.add(new BackstagePassesItem(15, 20));
		items.add(new ConjuredManaCakeItem(3,6));

	}

	public void updateQuality() {
		for(ItemDecorator item: this.items){
			item.update();
		}
	}
}