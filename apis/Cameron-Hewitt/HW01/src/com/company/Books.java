package com.company;

public class Books extends StackableItem implements Readable {
    public Books(int quantity){
        super (1.5, "Book", quantity);
    }

    public Books(){
        this(1);
    }

    @Override
    public void read(){
        System.out.println("This book has been read.");
    }

    @Override
    public String toString(){
        String text = String.format("%s/%fgp [%d/%d]" , itemName, itemWeight, quantity, maxStacks);
        return text;
    }

}
