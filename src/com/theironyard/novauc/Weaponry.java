package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.Scanner;


public class Weaponry {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scannerInt = new Scanner(System.in);


    public static void main(String[] args) throws Exception {


        // write your code here
        ArrayList<InventoryItem> mylist = new ArrayList<>();

        InventoryItem myweapons = new InventoryItem();

        //Tanks tanks=new Tanks("M1",1,"tanks");
        //mylist.add()
        mylist.add(new Rifles("M16", 1000, "Rifles"));
        mylist.add(new Pistols("M9",100,"Pistols"));
        mylist.add(new Missiles("AIM-9",100,"Missiles"));
        mylist.add(new Tanks("M1",100,"Tanks"));
        mylist.add(new Cannons("Howitzer",100,"Cannons"));

        System.out.println("Welcome to The Weapons Purchase Closet.");
        System.out.println("We currently only purchase these specific weapons:\n");
        System.out.println("M16");
        System.out.println("M9");
        System.out.println("AIM-9");
        System.out.println("M1");
        System.out.println("Howitzer\n");

        System.out.println("If you would like to sell at least 10 or more of these specific weapons, \nplease choose which weapon you would like to sell:\n(Be sure to spell correctly or our system will not recognize your response)");
        String name = scanner.nextLine();

        System.out.printf("We would like to purchase these %s's from you.\n", name);
        System.out.printf("How many of these %s's would you like to sell?\n", name);
        int quantity = scannerInt.nextInt();

        System.out.printf("Thank you for selling these %d %s's to The Weapons Purchase Closet.\n", quantity, name);
        System.out.println("For our records, which category are these weapons in? (Rifles, Pistols, Missiles, Tanks, Cannons).");
        String category = scanner.nextLine();

        mylist.add(createItem (name, quantity, category));

        System.out.println("For your information, for future sales.\nPlease note this is our entire list of potential weapons inventory categories.\nThis list now includes the category of weapons you just sold to The Weapons Closet.\n");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        System.out.println("");
        System.out.printf("Thank you for selling your %d %s's of the %s category to The Weapons Closet. Have a great day.", quantity, name, category);


//        for(InventoryItem listIt:mylist){
//            System.out.println(listIt);
//        }

    }


    public static InventoryItem createItem (String name, int quantity, String category) throws Exception {

        switch (name) {
            case "M16":
                return new Rifles(name, quantity,category);


            case "M9":
    //                Pistols;
                return new Pistols(name, quantity,category);


            case "AIM-9":
    //                Missiles;
                return new Missiles(name, quantity, category);


            case "M1":
    //                Tanks;
                return new Tanks(name, quantity,category);


            case "Howitzer":
    //                Cannons;
                return new Cannons(name, quantity, category);


            default:
                throw new Exception("Error\nInvalid weapon name");
        }

        //System.out.println(name);
    }

}
