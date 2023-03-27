
/*
Write a Java program to update specific array element by given element
*/
import java.util.*;

public class ArraylistProgram4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> colors = new ArrayList<String>();
        colors.add("Orange");
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors);

        System.out.println("Enter the element to be updated");
        String n = sc.next();

        for (String str : colors) {
            if (str.equals(n)) {
                System.out.println("Enter the element to be updated");
                str.replace(str, sc.next());
            }
        }
    }
}