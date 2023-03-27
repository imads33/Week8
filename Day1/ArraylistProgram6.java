
/*
Write a Java program to sort a given array list.
Write a Java program to copy one array list into another.
Write a Java program to shuffle elements in a array list.
*/
import java.util.*;

public class ArraylistProgram6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> colors = new ArrayList<String>();
        colors.add("Orange");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println(colors);

        Collections.sort(colors);
        System.out.println(colors);

        // copy one array list into another.
        List<String> newList = new ArrayList<String>();
        newList.addAll(colors);
        System.out.println(newList);

        // shuffle elements in a array list.
        Collections.shuffle(colors);
        System.out.println(colors);

        // Write a Java program to reverse elements in a array list.
        Collections.reverse(colors);
        System.out.println(colors);

    }
}