package com.company;

public abstract class ItemBase {
    protected double itemWeight;
    protected String itemName;

    public ItemBase(double itemWeight, String itemName, int quantity){
        this.itemWeight = itemWeight;
        this.itemName = itemName;
    }

    // getters
    public double getItemWeight(){
        return itemWeight;
    }
    public String getItemName(){
        return itemName;
    }

    //setters
    public void setItemWeight(int itemWeight){
        this.itemWeight = itemWeight;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
}
