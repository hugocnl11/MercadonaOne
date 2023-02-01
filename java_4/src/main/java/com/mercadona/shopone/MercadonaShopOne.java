package com.mercadona.shopone;

public class MercadonaShopOne {
    Item[] items;
    
    public MercadonaShopOne(Item[] items) {
        this.items = items;
    }

    public void updateQuality() { 
        for (Item item : items) {
            item.sellIn -=1;
            
            //there we have the "Aged blue cheese" and the "Ham" implemented:
            if (item.name.equals("Aged blue cheese") || item.name.equals("Ham" )) {
                if (item.quality < 50) {
                    item.quality +=1; 
                }
                if (item.sellIn <= 0) {
                    item.quality = 0;
                    
                }
            }

            //here we have the salt without content because dont need it:
            else if (item.name.equals("Iodized salt")) { 
            }

            //the new implementation are the "Frozen cake" and the "Frozen fish":
            else if (item.name.equals("Frozen cake") || item.name.equals("Frozen fish")) {
                if (item.quality > 0) {
                    if (item.sellIn > 0) {
                         item.quality -=2;
                    }
                    else{
                        item.quality -=4;
                    }
                }
                if (item.quality <= 0) {
                     item.quality = 0;
                }  
            }

            //the rest of the products:
            else {
                if (item.sellIn > 0) {
                    item.quality -=1;                
                }

                if (item.sellIn < 0) {
                    item.quality -=2;
                }

                if (item.quality <= 0) {
                    item.quality = 0;
                }
            }   
        }
    }

    
}