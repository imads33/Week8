import java.util.*;

public class ArraylistExample {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        // List list=new ArrayList();
        // list.add(123);
        // list.add("imad");
        // list.add(12.3);
        // System.out.println(list);
        // for(Object obj:list)
        // {
        // System.out.println(obj);
        // }
        
//****************************************
        //generics
        List<Integer> list = new ArrayList();
        list.add(123);
        list.add(245);
        list.add(123);
        System.out.println(list);
        for (Integer i : list) {
            System.out.println(i);
        }

        // oUTPUt:
        // [123, 245, 123]
        // 123
        // 245
        // 123
    }
}