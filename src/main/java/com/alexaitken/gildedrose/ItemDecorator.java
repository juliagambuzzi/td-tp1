package com.alexaitken.gildedrose;

import com.alexaitken.gildedrose.update.ItemUpdateStrategy;


public abstract class ItemDecorator extends Item {
	
	protected ItemUpdateStrategy updateStrategy;

	public ItemDecorator(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void update() {
		updateStrategy.update(this);
	}

}
