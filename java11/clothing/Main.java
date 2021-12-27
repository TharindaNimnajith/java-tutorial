package java11.clothing;

import java11.clothing.model.ClothingItem;
import java11.clothing.model.ClothingSize;
import java11.clothing.model.Hat;
import java11.clothing.model.Shirt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("ForLoopReplaceableByForEach")
public class Main {
    public static void main(String[] args) {
        ClothingItem clothingItem1 = new ClothingItem();
        clothingItem1.setType(ClothingItem.SHOES);
        clothingItem1.setSize(ClothingSize.M);
        clothingItem1.setPrice(29.99);
        clothingItem1.setQuantity(4);
        clothingItem1.display();

        var clothingItem2 = new ClothingItem(ClothingItem.SHIRT, ClothingSize.L, 19.99, 3);
        clothingItem2.display();

        var shirt = new Shirt(ClothingSize.L, 19.99, 3);
        shirt.display();

        var hat = new Hat(ClothingSize.M, 29.99, 1);
        hat.display();

        System.out.println("--------------------------------");

        String[] colors = new String[3];
        colors[0] = "Red";
        colors[1] = "Green";
        colors[2] = "Blue";
        for (int i = 0; i < colors.length; i++)
            System.out.println(colors[i]);
        System.out.println("--------------------------------");
        for (String color : colors)
            System.out.println(color);
        System.out.println("--------------------------------");

        ClothingItem[] clothingItems = {
                new Shirt(ClothingSize.L, 10, 3),
                new Hat(ClothingSize.M, 20, 1)
        };
        for (ClothingItem clothingItem : clothingItems)
            clothingItem.display();
        System.out.println("--------------------------------");

        List<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        for (int i = 0; i < colorsList.size(); i++)
            System.out.println(colorsList.get(i));
        System.out.println("--------------------------------");
        for (String color : colorsList)
            System.out.println(color);
        System.out.println("--------------------------------");

        List<ClothingItem> listItems = new ArrayList<>();
        listItems.add(new Shirt(ClothingSize.L, 19.99, 3));
        listItems.add(new Hat(ClothingSize.M, 29.99, 1));
        for (ClothingItem item : listItems)
            item.display();
        System.out.println("--------------------------------");

        Map<String, ClothingItem> mapItems = new HashMap<>();
        mapItems.put("shirt", new Shirt(ClothingSize.L, 19.99, 3));
        mapItems.put("hat", new Hat(ClothingSize.M, 29.99, 1));
        var keys = mapItems.keySet();
        for (String key : keys) {
            var item = mapItems.get(key);
            item.display();
        }
    }
}
