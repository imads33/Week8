// Write a Java program to insert an element into the array list at the first
// position
import java.util.*;

public class ArraylistProgram2 {
    public static void main(String args[]) {
        List<String> colors = new ArrayList<String>();
        colors.add("Orange");
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors);

        colors.add(0, "black");
        System.out.println(colors);
    }
}