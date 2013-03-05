package listandsetslab;

import java.util.*;

public class Example3Lists {

    public static void main(String[] args) {
        //Create a list of employees
        List things = new ArrayList();
        //Create of employee objects
        Employee emp1 = new Employee("Benjamin", "001");
        Employee emp2 = new Employee("Betsy", "002");
        Employee emp3 = new Employee("Brian", "003");
        Employee emp4 = new Employee("Barbara", "004");
        //Create dog objects
        Dog dog1 = new Dog("Magic", "01");
        Dog dog2 = new Dog("Slick", "02");
        Dog dog3 = new Dog("Midnight", "03");
        Dog dog4 = new Dog("Brittney", "04");
        //Add items to the list
        things.add(emp1);
        things.add(emp2);
        things.add(emp3);
        things.add(emp4);
        things.add(dog1);
        things.add(dog2);
        things.add(dog3);
        things.add(dog4);
        //Loop through the list of items
        for (int j = 0; j < things.size(); j++) {
            Object object = things.get(j);
            if (object instanceof Employee) {
                Employee e = (Employee) object;
                System.out.println(e.getName() + " " + e.getEmpID());
            } else if (object instanceof Dog) {
                Dog d = (Dog) object;
                System.out.println(d.getName() + " " + d.getDogID());
            }
        }
    }
}
