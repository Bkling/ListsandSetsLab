package listandsetslab;

import java.util.Objects;

public class Employee {

    //Properties
    private String name;
    private String empID;
    private int age;

    //Constructor
    public Employee(String name, String empID) {
        this.name = name;
        this.empID = empID;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Equal and HashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.empID);
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
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.empID, other.empID)) {
            return false;
        }
        return true;
    }

    //ToString Method
    @Override
    public String toString() {
        return "Social Security Number: " + empID + "  Name:" + name;
    }
}
