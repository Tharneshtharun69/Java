import java.util.Scanner;
class CountOfEachAndEveryVowelInTheStringUsingSwitchCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        int countofa = 0;
        int countofe = 0;
        int countofi = 0;
        int countofo = 0;
        int countofu = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            switch (ch) {
                case 'a':
                    countofa++;
                    break;
                case 'e':
                    countofe++;
                    break;
                case 'i':
                    countofi++;
                    break;
                case 'o':
                    countofo++;
                    break;
                case 'u':
                    countofu++;
                    break;
                default:
                    break;
            }
        }

        if (countofa == 0 && countofe == 0 && countofi == 0 && countofo == 0 && countofu == 0) {
            System.out.println("There are no vowels in the string");
        } else {
            System.out.println("Count of a: " + countofa);
            System.out.println("Count of e: " + countofe);
            System.out.println("Count of i: " + countofi);
            System.out.println("Count of o: " + countofo);
            System.out.println("Count of u: " + countofu);
        }
    }
}
