import java.util.Scanner;
class binaryvaluetointeger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String binary=scanner.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);
    }
}
