package com.alexaitken.gildedrose;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import com.alexaitken.gildedrose.items.AbstractItem;
import com.alexaitken.gildedrose.items.AgedBrieItem;
import com.alexaitken.gildedrose.items.BackstagePassesItem;
import com.alexaitken.gildedrose.items.ElixirOfTheMongooseItem;
import com.alexaitken.gildedrose.items.SulfurasHandOfRagnarosItem;

public class InventoryTest {

	
	@Test
	public void testDecrementQuality() {
		AbstractItem item = new ElixirOfTheMongooseItem(-1, 10);
		Collection<AbstractItem> items = new ArrayList<AbstractItem>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertEquals(8, items.iterator().next().getQuality());
	}

	@Test
	public void testItemNegativeQuality(){
		AbstractItem item = new ElixirOfTheMongooseItem(0, 0);
		Collection<AbstractItem> items = new ArrayList<AbstractItem>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()>=0);
	}
	
	@Test
	public void testAgedBrieIncreaseQuality(){
		AbstractItem item = new AgedBrieItem(0, 2);
		Collection<AbstractItem> items = new ArrayList<AbstractItem>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==4);
	}
	
	@Test
	public void testQualityNotOver50(){
		AbstractItem item = new AgedBrieItem(0, 50);
		Collection<AbstractItem> items = new ArrayList<AbstractItem>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==50);
	}
	
//	@Test
	//TODO check this restriction is not checked
	public void testSulfurasSellInCero(){
		AbstractItem item = new SulfurasHandOfRagnarosItem(-1, 10);
		Collection<AbstractItem> items = new ArrayList<AbstractItem>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getSellIn()==0);
	}
	
	@Test
	public void testSulfurasQualityNotChange(){
		AbstractItem item = new SulfurasHandOfRagnarosItem(0, 10);
		Collection<AbstractItem> items = new ArrayList<AbstractItem>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==10);
	}
	
	@Test
	public void testBackstagePassesQuality10Days(){
		AbstractItem item = new BackstagePassesItem(10, 10);
		Collection<AbstractItem> items = new ArrayList<AbstractItem>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==12);
	}
	
	@Test
	public void testBackstagePassesQuality6Days(){
		AbstractItem item = new BackstagePassesItem(4, 10);
		Collection<AbstractItem> items = new ArrayList<AbstractItem>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==13);
	}
	
	@Test
	public void testBackstagePassesQualityCeroAFterConcert(){
		AbstractItem item = new BackstagePassesItem(-1, 10);
		Collection<AbstractItem> items = new ArrayList<AbstractItem>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==0);
	}

}
