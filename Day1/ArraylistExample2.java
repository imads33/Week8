import java.util.*;

public class ArraylistExample2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++) {
            ls.add(sc.nextInt());
        }
        System.out.println(ls);
        for (Integer num : ls) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}