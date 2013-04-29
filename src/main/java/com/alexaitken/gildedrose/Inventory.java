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
//		for (int i = 0; i < items.length; i++) {
//			if (items[i].getName() != "Aged Brie"
//					&& items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
//				if (items[i].getQuality() > 0) {
//					if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
//						items[i].setQuality(items[i].getQuality() - 1);
//					}
//				}
//			} else {
//				if (items[i].getQuality() < 50) {
//					items[i].setQuality(items[i].getQuality() + 1);
//
//					if (items[i].getName() == "Backstage passes to a TAFKAL80ETC concert") {
//						if (items[i].getSellIn() < 11) {
//							if (items[i].getQuality() < 50) {
//								items[i].setQuality(items[i].getQuality() + 1);
//							}
//						}
//
//						if (items[i].getSellIn() < 6) {
//							if (items[i].getQuality() < 50) {
//								items[i].setQuality(items[i].getQuality() + 1);
//							}
//						}
//					}
//				}
//			}
//
//			if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
//				items[i].setSellIn(items[i].getSellIn() - 1);
//			}
//
//			if (items[i].getSellIn() < 0) {
//				if (items[i].getName() != "Aged Brie") {
//					if (items[i].getName() != "Backstage passes to a TAFKAL80ETC concert") {
//						if (items[i].getQuality() > 0) {
//							if (items[i].getName() != "Sulfuras, Hand of Ragnaros") {
//								items[i].setQuality(items[i].getQuality() - 1);
//							}
//						}
//					} else {
//						items[i].setQuality(items[i].getQuality()
//								- items[i].getQuality());
//					}
//				} else {
//					if (items[i].getQuality() < 50) {
//						items[i].setQuality(items[i].getQuality() + 1);
//					}
//				}
//			}
//		}
	}
}