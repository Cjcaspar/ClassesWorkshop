package com.company;

public class Pet {

    private String OwnerName;
    private String petName;
    private String homeAddress;
    private int age;
    private char gender;

    public Pet(String ownerName, String petName, String homeAddress, int age, char gender) {
        OwnerName = ownerName;
        this.petName = petName;
        this.homeAddress = homeAddress;
        this.age = age;
        this.gender = gender;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getHomeAdress() {
        return homeAddress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAddress = homeAdress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    protected  String makeSound() {
        return "Pets make no sound";
    }
}
