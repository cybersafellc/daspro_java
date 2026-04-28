package random_play_with_looping;

import random_play_with_looping.blueprints.Person;

public class Main {
    public static void main(String[] args){
        Person[] persons = {
                Main.getPerson("John Doe 1", 21, "12-12-2012", "mak john doe"),
                Main.getPerson("John Doe 2", 21, "12-12-2012", "mak john doe"),
                Main.getPerson("John Doe 3", 21, "12-12-2012", "mak john doe"),
                Main.getPerson("John Doe 4", 21, "12-12-2012", "mak john doe"),
                Main.getPerson("John Doe 5", 21, "12-12-2012", "mak john doe"),

        };

        int totalLoop = 5;
        for(int i = 0; i < totalLoop; i++){
            System.out.println("==== Person " + (i + 1) + "====");
            System.out.println("name   : " + persons[i].getName());
            System.out.println("age    : " + persons[i].getAge());
            System.out.println("dob    : " + persons[i].getDob());
            System.out.println("mother : " + persons[i].getMotherName());
        }
    }

    public static Person getPerson(String name, int age, String dob, String motherName){
        return BluePrints.createPerson(name, age, dob, motherName);
    }
}
