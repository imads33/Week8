import java.util.*;

public class TreeSetExample {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("red");
        set.add("yellow");
        set.add("green");
        set.add("violet");
        set.add("violet");
        set.add("pink");

        System.out.println(set);
    }
}