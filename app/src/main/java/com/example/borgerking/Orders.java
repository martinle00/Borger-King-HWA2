package com.example.borgerking;

public class Orders {
    private int orderID;
    private String name;
    private String quantity;
    private String totalCost;
    private int imageDrawableID;

    public int getOrderID(){
        return orderID;
    }
    public void setOrderID(){
        this.orderID = orderID;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String getQuantity(){
        return quantity;
    }
    public void setQuantity(){
        this.quantity = quantity;
    }
    public String getTotalCost(){
        return totalCost;
    }
    public void setTotalCost(){
        this.totalCost = totalCost;
    }
    public int getImageDrawableID(){
        return imageDrawableID;
    }
    public void setImageDrawableID(){
        this.imageDrawableID = imageDrawableID;
    }

}
