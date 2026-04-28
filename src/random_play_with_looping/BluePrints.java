package random_play_with_looping;

import random_play_with_looping.blueprints.Person;

public class BluePrints {
    public Person person;

    public static Person createPerson(String name, int age, String dob, String motherName){
        BluePrints blueprint = new BluePrints();
        blueprint.person = new Person(name, age, dob, motherName);
        return blueprint.person;
    }
}
