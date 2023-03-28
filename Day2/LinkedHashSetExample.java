import java.util.*;

public class LinkedHashSetExample {
    public static void main(String args[]) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("red");
        set.add("yellow");
        set.add("green");
        set.add("violet");
        set.add("violet");
        set.add("pink");

        System.out.println(set);
    }
}