package com.company;

public class Main {

    public static void main(String[] args) {
       GenericTest<Integer,String> genericTest = new GenericTest();

       genericTest.getAllElements();
       genericTest.changeMainEl(1);
       genericTest.allElements.add(2);
       genericTest.allElements.add(3);

       genericTest.getAllElements();
       int mainEl = genericTest.getMainElement();
       genericTest.setSecondaryElement("3Three");
       genericTest.getSecondaryElement();

       try {
           System.out.println(mainEl);
       } catch (Exception err) {
           System.out.println("errored out");
       }
       genericTest.printArray();
    }
}
