package com.example.borgerking;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.HashMap;
        import java.util.List;

public class ItemDatabase {
    public static Items getItemsByID(int itemID){
        return items.get(itemID);
    }
    public static ArrayList<Items>getAllItems(){
        return new ArrayList<Items>((List)Arrays.asList(items.values().toArray()));
    }
    private static final HashMap<Integer,Items>items = new HashMap<>();

    static{
        items.put(1,new Items(
                1,
                "Hamburger",
                "It's simple. 100% Aussie beef, topped with onion, pickles, zesty ketchup and mustard, all on a soft, fluffy bun.",
                "$2.00",
                R.drawable.hamburger_image
        ));
        items.put(2,new Items(
                2,
                "Cheeseburger",
                "Classic combo of a flame-grilled Aussie beef patty topped with cheese, crunchy pickle, mustard and tomato sauce, served on a freshly toasted sesame seed bun. Basic - but brilliant.",
                "$2.50",
                R.drawable.cheesburger_image
        ));
        items.put(3, new Items(
                3,
                "Bopper",
                "Some things just can’t be improved. \n" +
                        "\n"+
                        "The Bopper is 100% hormone-free Aussie beef, flame-grilled that gives you the irresistible smoky, BBQ flavour. Loaded with crisp fresh lettuce, ripe hand-cut tomatoes, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun. An Aussie legend for over 40 years.",
                "$5.00",
                R.drawable.bopper_image
        ));
        items.put(4, new Items(
                4,
                "Grilled Chicken",
                "Flame-grilled chicken breast fillet, topped with fresh salad and our creamy Ranch dressing on a toasted sesame seed bun. If you love chicken, you will love our succulent flame-grilled breast fillet chicken burger.",
                "$5.00",
                R.drawable.grilledchicken_image
        ));
        items.put(5, new Items(
                5,
                "Sundaes",
                "Finish a meal or treat yourself with our rich and velvety vanilla soft serve topped with your favourite sauce.",
                "$2.00",
                R.drawable.sundae_image
        ));
        items.put(6,new Items(
                6,
                "Fries",
                "Get them while they're hot. Our legendary, super-tasty French fries are the perfect side to any meal. \n" +
                        "\n"+
                        "We only use the highest quality potatoes to create those delicious strands of crispy fluffiness that you love, now fried in a superior and healthier blend including canola and sunflower oils.",
                "$2.00",
                R.drawable.fries_image
        ));
        items.put(7,new Items(
                7,
                "Onion Rings",
                "A Borger King's favourite, you'll be crying over if you miss them! Freshly battered, crispy onion",
                "$2.00",
                R.drawable.rings_image
        ));
        items.put(8, new Items(
                8,
                "Chicken Nuggets",
                "Everything's better when it's bite-sized. Like our nuggets made with tender juicy 100% Aussie Chicken McNuggets in a crisp tempura coating, with no artificial colours, flavours or preservatives!",
                "$3.00",
                R.drawable.nuggets_image
        ));
        items.put(9, new Items(
                9,
                "Angus Burgers",
                "100% Aussie Angus beef, classic cheese, tomato, onions and pickles with mustard and mayo",
                "$8.00",
                R.drawable.angus_image
        ));
        items.put(10, new Items(
                10,
                "Chicken & Cheese",
                "A delicious combination of crispy coated chicken, cheese and mayonnaise.",
                "$3.50",
                R.drawable.chickencheese_image
        ));
        items.put(11, new Items(
                11,
                "Caesar Salad",
                "Chicken, lettuce, bacon, shaved parmesan and your choice of creamy Caesar dressing.",
                "$5.00",
                R.drawable.salad_image
        ));
        items.put(12, new Items(
                12,
                "Vegan Burger",
                "Yes, 100% Vegan! Double vegan patty (made from corn, capsicum and carrot), vegan cheese and vegan mayonnaise with tomato sauce, onions, fresh tomato and crisp lettuce on a delicious seeded bun.",
                "$5.50",
                R.drawable.veggie_image
        ));
        items.put(13, new Items(
                13,
                "Drinks",
                "There's nothing like it with our range of drinks to quench your thirst.",
                "$2.00",
                R.drawable.drink_image
        ));
        items.put(14, new Items(
                14,
                "Big Borg",
                "It starts with two 100% Aussie beef patties. Then comes the delicious combination of crisp iceberg lettuce, melting signature cheese, onions and pickles, between a toasted sesame seed bun. And don't forget the Borger King's special sauce!",
                "$6.00",
                R.drawable.borg_image
        ));
        items.put(15, new Items(
                15,
                "Filet o' Fish",
                "Dive in and enjoy our Filet-o-Fish. Sourced for its succulent and fresh flavour, we cook tender portions of fish and enhance their great taste with zesty tartar sauce and cheese.",
                "$5.50",
                R.drawable.fish_image
        ));
    }
}
