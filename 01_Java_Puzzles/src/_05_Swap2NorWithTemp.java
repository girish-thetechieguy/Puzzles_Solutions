import java.util.Scanner;

public class _05_Swap2NorWithTemp {
    public static void main(String[] args) {
        System.out.println("Enter A: ");
        Scanner scannerA = new Scanner(System.in);
        int a = scannerA.nextInt();
        System.out.println("Enter B: ");
        Scanner scannerB = new Scanner(System.in);
        int b = scannerB.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: ");
        System.out.println("A:"+a);
        System.out.println("B:"+b);
    }
}
