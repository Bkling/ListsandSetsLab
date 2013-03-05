package listandsetslab;

import java.util.Objects;

public class Dog {

    //Properties
    private String name;
    private String dogID;
    private int age;

    //Constructor
    public Dog(String name, String dogID) {
        this.name = name;
        this.dogID = dogID;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDogID() {
        return dogID;
    }

    public void setDogID(String dogID) {
        this.dogID = dogID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Equals and HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.dogID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.dogID, other.dogID)) {
            return false;
        }
        return true;
    }

    //ToString Method
    @Override
    public String toString() {
        return "Dog ID: " + dogID + "  Name:" + name;
    }
}
