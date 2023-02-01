package com.mercadona.shopone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MercadonaShopOneTest {

    @Test
    void item_generico_no_caducado() {
        Item[] items = new Item[] { new Item("Frozen cake", 0, 0) };
        MercadonaShopOne app = new MercadonaShopOne(items);
        app.updateQuality();
        assertEquals("Frozen cake", app.items[0].name);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(-4, app.items[0].quality);

    }

}
