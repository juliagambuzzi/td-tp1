package com.alexaitken.gildedrose;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import com.alexaitken.gildedrose.impl.AgedBrieItem;
import com.alexaitken.gildedrose.impl.BackstagePassesItem;
import com.alexaitken.gildedrose.impl.ConjuredItem;
import com.alexaitken.gildedrose.impl.ElixirOfTheMongooseItem;
import com.alexaitken.gildedrose.impl.SulfurasHandOfRagnarosItem;

public class InventoryTest {

	
	@Test
	public void testDecrementQuality() {
		ItemDecorator item = new ElixirOfTheMongooseItem(-1, 10);
		Collection<ItemDecorator> items = new ArrayList<ItemDecorator>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertEquals(8, items.iterator().next().getQuality());
	}

	@Test
	public void testItemNegativeQuality(){
		ItemDecorator item = new ElixirOfTheMongooseItem(0, 0);
		Collection<ItemDecorator> items = new ArrayList<ItemDecorator>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()>=0);
	}
	
	@Test
	public void testAgedBrieIncreaseQuality(){
		ItemDecorator item = new AgedBrieItem(0, 2);
		Collection<ItemDecorator> items = new ArrayList<ItemDecorator>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==4);
	}
	
	@Test
	public void testQualityNotOver50(){
		ItemDecorator item = new AgedBrieItem(0, 50);
		Collection<ItemDecorator> items = new ArrayList<ItemDecorator>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==50);
	}
	
	@Test
	public void testSulfurasSellInCero(){
		ItemDecorator item = new SulfurasHandOfRagnarosItem(-1, 10);
		Collection<ItemDecorator> items = new ArrayList<ItemDecorator>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getSellIn()==0);
	}
	
	@Test
	public void testSulfurasQualityNotChange(){
		ItemDecorator item = new SulfurasHandOfRagnarosItem(0, 10);
		Collection<ItemDecorator> items = new ArrayList<ItemDecorator>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==10);
	}
	
	@Test
	public void testBackstagePassesQuality10Days(){
		ItemDecorator item = new BackstagePassesItem(10, 10);
		Collection<ItemDecorator> items = new ArrayList<ItemDecorator>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==12);
	}
	
	@Test
	public void testBackstagePassesQuality6Days(){
		ItemDecorator item = new BackstagePassesItem(4, 10);
		Collection<ItemDecorator> items = new ArrayList<ItemDecorator>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==13);
	}
	
	@Test
	public void testBackstagePassesQualityCeroAFterConcert(){
		ItemDecorator item = new BackstagePassesItem(-1, 10);
		Collection<ItemDecorator> items = new ArrayList<ItemDecorator>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==0);
	}
	
	@Test
	public void testConjuredDecressQualityInTwo(){
		ItemDecorator item = new ConjuredItem(5, 10);
		Collection<ItemDecorator> items = new ArrayList<ItemDecorator>();
		items.add(item);
		Inventory inventory = new Inventory(items);
		inventory.updateQuality();
		Assert.assertTrue(items.iterator().next().getQuality()==8);
	}

}
