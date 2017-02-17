package com.theironyard.novauc;

/**
 * Created by Merlin on 2/14/17.
 */
public class Rifles extends InventoryItem {

    public Rifles(String name, int quantity, String category){

//        this.name = name;
//        this.quantity = quantity;
//        this.category = category;
        super(name, quantity);
        this.category = "Rifles";
    }


}
