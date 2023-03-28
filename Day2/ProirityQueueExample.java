import java.util.*;

public class ProirityQueueExample {
    public static void main(String args[]) {
        PriorityQueue<String> set = new PriorityQueue<String>();
        set.add("red");
        set.add("yellow");
        set.add("green");
        set.add("violet");
        set.add("violet");
        set.add("pink");

        System.out.println(set);
    }
}