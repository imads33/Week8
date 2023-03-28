
/*
Write a program that takes a list of strings as input and returns a new list that contains only the strings that have length greater than 5.

Write a program that takes a list of strings as input and returns the concatenated string of all the elements in the list
*/
import java.util.*;

public class ArraylistProgram9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<String>();
        System.out.println("Enter words");
        for (int i = 0; i < 5; i++) {
            words.add(sc.next());
        }
        System.out.println(words);

        List<String> newwords = new ArrayList<String>();
        for (String word : words) {
            if (word.length() >= 5) {
                newwords.add(word);
            }
        }
        System.out.println(newwords);

        String concatinated = "";

        System.out.println(words);
        for (String word : words) {
            concatinated = concatinated + word;
        }
        System.out.println(concatinated);
    }
}
