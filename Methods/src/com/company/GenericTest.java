package com.company;

import java.util.ArrayList;

public class GenericTest<T extends Integer, U> {
    private T mainElement;
    public ArrayList<T> allElements = new ArrayList<>();
    private U secondaryElement;

    public U getSecondaryElement() {
        System.out.println(secondaryElement);
        return secondaryElement;
    }

    public void setSecondaryElement(U secondaryElement) {
        this.secondaryElement = secondaryElement;
    }

    public ArrayList<T> getAllElements() {
        System.out.println(allElements.toString());
        return allElements;
    }

    public T getMainElement() {
        System.out.println(mainElement.toString());;
        return mainElement;
    }

    public ArrayList<T> changeMainEl(T newElement) {
        this.mainElement = newElement;
        ArrayList<T> changes = new ArrayList<>();
        changes.add(this.mainElement);
        changes.add(newElement);

        return changes;
    }

    public void printArray() {
        getAllElements();
    }
}
