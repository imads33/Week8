
/*
Write a Java program to create a new array list, add some colors (string) and print out the collection
*/
import java.util.*;
public class ArraylistProgram1 {
    public static void main(String args[]) {
        List<String> colors = new ArrayList<String>();
        colors.add("Orange");
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors);

        /*
         * Write a Java program to iterate through all elements in a array list
         */
        for (String str : colors) {
            System.out.println(str);
        }
    }
}