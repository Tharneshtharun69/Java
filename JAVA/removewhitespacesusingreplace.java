import java.util.*;
public class removewhitespacesusingreplace {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}