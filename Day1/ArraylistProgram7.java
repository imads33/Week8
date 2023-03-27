
/*
Write a Java program of swap two elements in an array list.
Write a Java program to join two array lists.
Write a Java program to empty an array list.
*/
import java.util.*;

public class ArraylistProgram7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> colors = new ArrayList<String>();
        colors.add("Orange");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println(colors);

        String temp = colors.get(0);
        colors.set(0, colors.get(2));
        colors.set(2, temp);

        List<String> newlist = new ArrayList<String>();
        newlist.add("black");
        newlist.add("white");
        System.out.println(newlist);

        colors.addAll(1, newlist);
        System.out.println(colors);

        Collections.emptyList();
    }
}