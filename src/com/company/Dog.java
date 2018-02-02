package com.company;
import java.util.Scanner;

public class Dog extends Pet {

    Scanner scanner = new Scanner(System.in);
    private boolean likesWalk;
    private boolean canFetch;
    private String coatType;

    public Dog(String ownerName, String petName, String homeAddress, int age, char gender) {
        super(ownerName, petName, homeAddress, age, gender);
        System.out.println("What is your dogs name?: ");
        setPetName(scanner.nextLine());
        System.out.println("Does " + getPetName() + " like to take walks? True of False?");
    }

    @Override
    protected String makeSound() {
        return "woof";
    }
}
