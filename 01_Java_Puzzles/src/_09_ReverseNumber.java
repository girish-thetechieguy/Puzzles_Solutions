import java.util.Scanner;

public class _09_ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner scannerA = new Scanner(System.in);
        int a = scannerA.nextInt();
        int reversedNor = 0;
        while (a != 0 ) {
            reversedNor = reversedNor * 10;
            reversedNor = reversedNor + a % 10;
            a = a / 10;
        }
        System.out.println(reversedNor);
    }
}
