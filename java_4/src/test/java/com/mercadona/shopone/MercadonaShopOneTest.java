package com.mercadona.shopone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MercadonaShopOneTest {

    @Test
    void item_bead_no_caducado() {
        Item[] items = new Item[] { new Item("Bread", 10, 20) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Bread", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);

    }

    @Test
    void item_bread_caducado() {
        Item[] items = new Item[] { new Item("Bread", 0, 0) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Bread", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

    }

    @Test
    void item_blue_cheese_no_caducado() {
        Item[] items = new Item[] { new Item("Aged blue cheese", 2, 0) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Aged blue cheese", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);

    }

    @Test
    void item_blue_cheese_caducado() {
        Item[] items = new Item[] { new Item("Aged blue cheese", -1, 2) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Aged blue cheese", app.items[0].name);
        assertEquals(-2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

    }

    @Test
    void item_iodized_salt_no_caducado() {
        Item[] items = new Item[] { new Item("Iodized salt", 1, 80) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Iodized salt", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);

    }

    

    @Test
    void item_yogurt_no_caducado() {
        Item[] items = new Item[] { new Item("Yogurt", 2, 3) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Yogurt", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(2, app.items[0].quality);

    }

    @Test
    void item_yogurt_caducado() {
        Item[] items = new Item[] { new Item("Ham", -2, 21) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Ham", app.items[0].name);
        assertEquals(-3, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

    }

    @Test
    void item_ham_no_caducado() {
        Item[] items = new Item[] { new Item("Ham", 10, 34) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Ham", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(35, app.items[0].quality);

    }

    @Test
    void item_ham_caducado() {
        Item[] items = new Item[] { new Item("Frozen cake", 1, 4) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Frozen cake", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

    }

    @Test
    void item_frozen_cake_no_caducado() {
        Item[] items = new Item[] { new Item("Frozen cake", 0, 10) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Frozen cake", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);

    }

    @Test
    void item_frozen_cake_caducado() {
        Item[] items = new Item[] { new Item("Frozen cake", 1, 2) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Frozen cake", app.items[0].name);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);

    }

}
