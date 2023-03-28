import java.util.*;

public class LinkedListExample {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("red");
        list.add("yellow");
        list.add("green");
        list.add("violet");
        list.add("violet");
        list.add("pink");

        System.out.println(list);
    }
}