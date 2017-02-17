package com.theironyard.novauc;

/**
 * Created by Merlin on 2/14/17.
 */
public class Pistols extends InventoryItem {

    public Pistols(String name, int quantity, String category){
//        this.name = name;
//        this.quantity = quantity;
        super(name, quantity);
        this.category = "Pistols";

    }
}
