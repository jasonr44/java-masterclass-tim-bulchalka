package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void modifyGroceryItem(int position, String itemUpdate) {
        groceryList.set(position, itemUpdate);
    }

    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(item);
    }

    public void printGroceryList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + ".) " + groceryList.get(i));
        }
    }

    public String findGroceryItem(String input) {
        int position = groceryList.indexOf(input);

        if (position < 0) {
            return null;
        }

        return groceryList.get(position);
    }
}
