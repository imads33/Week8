
/*
Write a Java program to search an element in a array list
*/
import java.util.*;

public class ArraylistProgram5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> colors = new ArrayList<String>();
        colors.add("Orange");
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors);

        System.out.println("Enter the element to be Searched");
        String n = sc.next();
        int count = 1;
        for (String str : colors) {
            if (str.equals(n)) {
                System.out.println("element found");
                count = 0;
                break;
            }
        }
        if (count != 0) {
            System.out.println("element not found");
        }
    }
}