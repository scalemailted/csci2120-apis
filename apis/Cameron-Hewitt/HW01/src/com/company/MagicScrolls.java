package com.company;

public class MagicScrolls extends StackableItem implements Readable, Learnable {
    public MagicScrolls(int quantity){
        super (0.5, "Magic Scroll", quantity);
    }

    public MagicScrolls(){
        this(1);
    }

    @Override
    public void read(){
        System.out.println("This scroll has been read.");
    }

    @Override
    public void taught(){
        System.out.println("You has learned a new magic spell.");
    }

    public String toString(){
        String text = String.format("%s/%fgp [%d/%d]" , itemName, itemWeight, quantity, maxStacks);
        return text;
    }
}
