package random_play_with_looping.blueprints;

public class Person {
    private String name;
    private int age;
    private String dob;
    private String motherName;

    public Person(String name, int age, String dob, String motherName){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.motherName = motherName;
    }

    public String getName(){
        return  this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getDob(){
        return this.dob;
    }
    public String getMotherName(){
        return this.motherName;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public void setMotherName(String motherName){
        this.motherName = motherName;
    }


}

