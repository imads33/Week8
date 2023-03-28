import java.util.*;

public class StackExample {
    public static void main(String args[]) {
        Stack<String> set = new Stack<String>();
        set.add("red");
        set.add("yellow");
        set.add("green");
        set.add("violet");
        set.add("violet");
        set.add("pink");

        System.out.println(set);
    }
}