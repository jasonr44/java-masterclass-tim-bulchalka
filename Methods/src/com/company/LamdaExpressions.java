package com.company;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LamdaExpressions {

    LamdaExpressions() {
        Employee employee1 = new Employee();
        employee1.setName("Jason");

        Employee employee2 = new Employee();
        employee2.setName("Tommy");

        Employee employee3 = new Employee();
        employee3.setName("Sharon");

        ArrayList<Employee> employeeArrayList = new ArrayList<>(3);
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);

        employeeArrayList.forEach(employee -> {
            System.out.println(employee.getName());
        });

        Function<Employee, Character> getFirstChar = (Employee emp) -> {
            return emp.getName().charAt(0);
        };

        Function<Character, String> addOy = (Character a) -> {
            return a + "oy";
        };

        Function<String, String> makePlural = (String someString) -> {
            return someString + "s";
        };

        Function chainedFunction = getFirstChar.andThen(addOy).andThen(makePlural);

        BiFunction<Character, Character, String> twoArgAdd = (Character a, Character b) -> {
            return a.toString() + b.toString();
        };


        System.out.println(getFirstChar.apply(employee1));
        System.out.println(chainedFunction.apply(employee1));
        System.out.println(chainedFunction.apply(employee2));
        System.out.println(chainedFunction.apply(employee3));
        System.out.println(twoArgAdd.apply('s', 'o'));
    }

    private class Employee {
        private String name;
        private String title;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}

