package com.theironyard.novauc;

/**
 * Created by Merlin on 2/14/17.
 */
public class Missiles extends InventoryItem {

    public Missiles(String name, int quantity, String category){
//        this.name= name;
//        this.quantity = quantity;
//        this.category = category;
        super(name, quantity);
        this.category = "Missiles";
    }
}
