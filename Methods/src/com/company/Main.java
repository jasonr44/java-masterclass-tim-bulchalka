package com.company;

public class Main {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        groceryList.addGroceryItem("Chicken");
        groceryList.addGroceryItem("Oreos");
        groceryList.addGroceryItem("Bananas");
        groceryList.addGroceryItem("Fruit Loops");

        groceryList.printGroceryList();

        groceryList.modifyGroceryItem(0, "Turkey");
        groceryList.removeGroceryItem(3);

        String existingItem = groceryList.findGroceryItem("Turkey");
        String nonExistingItem = groceryList.findGroceryItem("Chicken");

        System.out.println("========== Changes ============");
        groceryList.printGroceryList();

        System.out.println("========== Search Results ============");
        System.out.println("Should exist: " + existingItem);
        System.out.println("Should NOT exist: " + nonExistingItem);
    }
}
