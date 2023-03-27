
/*
Write a Java program to retrieve an element (at a specified index) from a given array list.
*/
import java.util.*;

public class ArraylistProgram3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> colors = new ArrayList<String>();
        colors.add("Orange");
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors);

        System.out.println("Enter the position");
        int n = sc.nextInt();

        System.out.println(colors.get(n));

        // removing third elemnt of array list
        colors.remove(3);
        System.out.println(colors);
    }
}