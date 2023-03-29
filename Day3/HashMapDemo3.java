import java.util.*;

public class HashMapDemo3 {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(101, "imad");
        map.put(102, "pqr");
        map.put(103, "abc");
        map.putIfAbsent(104, "xyz");
        map.putIfAbsent(104, "efg");

        System.out.println(map);

        map.remove(104);

        for (Map.Entry keyVal : map.entrySet()) {
            System.out.println(keyVal.getKey() + "->" + keyVal.getValue());
        }
    }
}