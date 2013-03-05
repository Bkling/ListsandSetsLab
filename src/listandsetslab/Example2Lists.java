package listandsetslab;

import java.util.*;

public class Example2Lists {

    public static void main(String[] args) {
        //Create a list of employees
        List<Employee> emp = new ArrayList<Employee>();
        //Create of employee objects
        Employee emp1 = new Employee("Benjamin", "001");
        Employee emp2 = new Employee("Betsy", "002");
        Employee emp3 = new Employee("Brian", "003");
        Employee emp4 = new Employee("Barbara", "004");
        //Add items to the list
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);
        //Loop through the list
        for(int i=0; i < emp.size();i++){
            System.out.println(emp.get(i));
        }
    }
}
