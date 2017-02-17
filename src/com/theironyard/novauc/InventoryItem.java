package com.theironyard.novauc;

/**
 * Created by Merlin on 2/14/17.
 */
public class InventoryItem {

    public String name;
    public int quantity;
    public String category;


    public InventoryItem(String name, int quantity){

        this.name = name;
        this.quantity = quantity;
        this.category = category;


    }
public InventoryItem() {

}
@Override
public String toString(){
//this overrides it and makes it so that only the category (actually name) is being printed on the print line.....()
    return this.category;
//    return this.name;

    }

//@Override
//public String toString(){
//    return this.name;
//}
//@Override
//public String tooString(){
//    return this.name;
//    }

}