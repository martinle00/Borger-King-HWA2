package com.example.borgerking;

public class Items {

    private int itemID;
    private String name;
    private String description;
    private String price;
    private int imageDrawableID;


    public Items(int itemID, String name, String description, String price, int imageDrawableID){
        this.itemID = itemID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageDrawableID = imageDrawableID;
    }

    public int getItemID(){
        return itemID;
    }
    public void setItemID(){
        this.itemID = itemID;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(){
        this.description = description;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(){
        this.price = price;
    }
    public int getImageDrawableID(){
        return imageDrawableID;
    }
    public void setImageDrawableID(){
        this.imageDrawableID = imageDrawableID;
    }
}
