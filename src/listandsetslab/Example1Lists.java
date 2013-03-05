package listandsetslab;

import java.util.*;

public class Example1Lists {

    public static void main(String[] args) {
        //Create a list of hobbies
        List hobbies = new ArrayList();
        //Add items to arraylist
        hobbies.add("Video Games");
        hobbies.add("Street Racing");
        hobbies.add("Swimming");
        hobbies.add("Fishing");
        //Loop through the list
        for (int i = 0; i < hobbies.size(); i++) {
            String s = (String) hobbies.get(i);
            System.out.println(s);
        }
    }
}
