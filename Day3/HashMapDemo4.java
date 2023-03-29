import java.util.*;

class Student1 {
    String name;
    int id;

    Student1(int id, String name) {
        this.name = name;
        this.id = id;
    }
}

public class HashMapDemo4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student1> map = new HashMap<Integer, Student1>();

        for (int i = 0; i < 3; i++) {
            map.put(i + 1, new Student1(sc.nextInt(), sc.next()));
        }
        System.out.println("Details are : ");
        System.out.println("key : Values");
        for (Map.Entry keyVal : map.entrySet()) {
            Student1 st = (Student1) keyVal.getValue();
            System.out.println(keyVal.getKey() + "\t:\t" + st.id + " , " + st.name);
        }
    }
}