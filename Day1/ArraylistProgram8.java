
/*
Write a program that takes a list of integers as input and returns the largest integer in the list.
Write a program that takes a list of integers as input and returns a new list that contains only the odd integers.

Write a program that takes a list of integers as input and returns a new list that contains the squares of all the integers in the original list.

Write a program that takes a list of integers as input and returns a new list that contains the first 5 integers in the original list.
*/
import java.util.*;

class ArraylistProgram8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter numbers ");
        for (int i = 0; i < 5; i++) {
            numbers.add(sc.nextInt());
        }
        System.out.println(numbers);

        System.out.println("\nmax element is " + Collections.max(numbers));

        List<Integer> number = new ArrayList<Integer>();
        for (Integer num : numbers) {
            if (num % 2 != 0) {
                number.add(num);
            }
        }
        System.out.println(number);

        for (Integer num : numbers) {
            int temp = num * num;
            Collections.replaceAll(numbers, num, temp);
        }
        System.out.println(numbers);

        number.clear();
        System.out.println(number);
        int i = 0;
        for (Integer num : numbers) {
            if (i < 3) {
                number.add(num);
                i++;
            }
        }
        System.out.println(number);
    }
}
