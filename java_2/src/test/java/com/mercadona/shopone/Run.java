package com.mercadona.shopone;

public class Run {
    public static void main(String[] args) {
        System.out.println("Welcome to Mercadona Shop One!");

        Item[] items = new Item[] {
                new Item("Bread", 10, 20), //
                new Item("Aged blue cheese", 2, 0), //
                new Item("Yogurt", 5, 7), //
                new Item("Iodized salt", 0, 80), //
                new Item("Iodized salt", -1, 80),
                new Item("Ham", 15, 20),
                new Item("Ham", 10, 49),
                new Item("Ham", 5, 49),

                // this Frozen item does not work properly yet
                new Item("Frozen cake", 3, 6),
                new Item("Frozen fish", 5, 9),
            };
                

        MercadonaShopOne app = new MercadonaShopOne(items);

        int days = 10;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
