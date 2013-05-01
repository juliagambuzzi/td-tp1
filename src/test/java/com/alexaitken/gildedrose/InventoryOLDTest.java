package com.alexaitken.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class InventoryOLDTest {

	@Test
	public void testDecrementQuality() {

		Item item = new Item("Elixir of the Mongoose", -1, 10);

		Item[] items = { item };

		InventoryOLD inventoryOLD = new InventoryOLD(items);

		inventoryOLD.updateQuality();

		Assert.assertEquals(8, items[0].getQuality());

	}

	@Test
	public void testItemNegatuveQuality() {

		Item item = new Item("Elixir of the Mongoose", 0, 0);

		Item[] items = { item };

		InventoryOLD inventoryOLD = new InventoryOLD(items);

		inventoryOLD.updateQuality();

		Assert.assertTrue(items[0].getQuality() >= 0);

	}

	@Test
	public void testAgedBrieIncreaseQuality() {

		Item item = new Item("Aged Brie", 0, 2);

		Item[] items = { item };

		InventoryOLD inventoryOLD = new InventoryOLD(items);

		inventoryOLD.updateQuality();

		Assert.assertTrue(items[0].getQuality() == 4);

	}

	@Test
	public void testQualityNotOver50() {

		Item item = new Item("Aged Brie", 0, 50);

		Item[] items = { item };

		InventoryOLD inventoryOLD = new InventoryOLD(items);

		inventoryOLD.updateQuality();

		Assert.assertTrue(items[0].getQuality() == 50);

	}

	
	//@Test
	// TODO check this restriction, it's not checked
	public void testSulfurasSellInCero() {

		Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 10);

		Item[] items = { item };

		InventoryOLD inventoryOLD = new InventoryOLD(items);

		inventoryOLD.updateQuality();

		Assert.assertTrue(items[0].getSellIn() == 0);

	}

	@Test
	public void testSulfurasQualityNotChange() {

		Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 10);

		Item[] items = { item };

		InventoryOLD inventoryOLD = new InventoryOLD(items);

		inventoryOLD.updateQuality();

		Assert.assertTrue(items[0].getQuality() == 10);

	}

	@Test
	public void testBackstagePassesQuality10Days() {

		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10,
				10);

		Item[] items = { item };

		InventoryOLD inventoryOLD = new InventoryOLD(items);

		inventoryOLD.updateQuality();

		Assert.assertTrue(items[0].getQuality() == 12);

	}

	@Test
	public void testBackstagePassesQuality6Days() {

		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 4, 10);

		Item[] items = { item };

		InventoryOLD inventoryOLD = new InventoryOLD(items);

		inventoryOLD.updateQuality();

		Assert.assertTrue(items[0].getQuality() == 13);

	}

	@Test
	public void testBackstagePassesQualityCeroAFterConcert() {

		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", -1,
				10);

		Item[] items = { item };

		InventoryOLD inventoryOLD = new InventoryOLD(items);

		inventoryOLD.updateQuality();

		Assert.assertTrue(items[0].getQuality() == 0);

	}

}
