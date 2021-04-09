package com.streamliners.task3_2;

public class GroceryCartItem extends GroceryItem{
    float price;
    float quantity;
    //define parameterized constructor
    public GroceryCartItem(String name,int pricePerKg){
        super(name,pricePerKg);
    }

    @Override
    public String toString() {
        return String.format("%s (Rs%d * %.1fkg) = Rs%.1f",this.name,this.pricePerKg,this.quantity,this.price);
    }
    public static float ExtractQuantity(String quantityStr){
        String[] s = quantityStr.split(" ");
        String s1 = s[0].replace("kg","");
        String s2 = s[1].replace("g","");
        int[] b = new int[2];
        b[0] = Integer.parseInt(s1);
        b[1] = Integer.parseInt(s2);
        float f1 = (float) b[0];
        float f2 = (float) b[1]/10;
        return f1 + f2;
    }
    public static GroceryCartItem createNew(GroceryItem item,String quantityStr){
        GroceryCartItem cartItem = new GroceryCartItem(item.name, item.pricePerKg);
        cartItem.quantity = GroceryCartItem.ExtractQuantity(quantityStr);
        cartItem.price = (int)(cartItem.pricePerKg* cartItem.quantity);
        return  cartItem;
    }
}