package random_play_with_looping;

import random_play_with_looping.blueprints.Car;
import random_play_with_looping.blueprints.Person;

import java.lang.classfile.instruction.ReturnInstruction;

public class BluePrints {
    public Person person;
    public Car car;

    public static Person createPerson(String name, int age, String dob, String motherName){
        BluePrints blueprint = new BluePrints();
        blueprint.person = new Person(name, age, dob, motherName);
        return blueprint.person;
    }

    public static Car createCar(String name, String platNumbers, String productionDate){
        BluePrints blueprints = new BluePrints();
        blueprints.car = new Car(name, platNumbers, productionDate);
        return blueprints.car;
    }


}