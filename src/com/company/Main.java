package com.company;

public class Main {

    private String myString;

    public static void main(String[] args) {
        Cat cat = new Cat("Person", "Kitty", "124 main street", 5, 'F');

        System.out.println(cat.makeSound());
        System.out.println(cat.getGender());
    }


}


