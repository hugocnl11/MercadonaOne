package com.mercadona.shopone;

public class MercadonaShopOne {
    Item[] items;

    public MercadonaShopOne(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged blue cheese")
                    && !items[i].name.equals("Ham")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Iodized salt") && !items[i].name.equals("Frozen cake")  && !items[i].name.equals("Frozen fish")) {
                        items[i].quality = items[i].quality - 1;
                    }
                    
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Ham")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Iodized salt")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged blue cheese")) {
                    if (!items[i].name.equals("Ham")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Iodized salt")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
            
            //My code

            if (items[i].name.equals("Frozen fish")&& items[i].quality > 0) {
                
                    items[i].quality = items[i].quality - 2;
            }

                else if (items[i].name.equals("Frozen fish")&& items[i].quality <= 0) {
                    
                    items[i].quality = items[i].quality - 4;
                }

            if (items[i].name.equals("Frozen cake")&& items[i].quality > 0) {

                items[i].quality = items[i].quality - 2;
            }

                else if (items[i].name.equals("Frozen cake")&& items[i].quality <= 0) {
                    
                    items[i].quality = items[i].quality - 4;
                }

          
        }
    }
}