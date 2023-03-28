import java.util.*;

public class VectorExample {
    public static void main(String args[]) {
        Vector<String> set = new Vector<String>();
        set.add("red");
        set.add("yellow");
        set.add("green");
        set.add("violet");
        set.add("violet");
        set.add("pink");

        System.out.println(set);
    }
}