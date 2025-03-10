import java.util.Scanner;

public class _07_EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter A: ");
        Scanner scannerA = new Scanner(System.in);
        int a = scannerA.nextInt();
        if(a % 2 == 0)
            System.out.println("Its Even!");
        else
            System.out.println("Its Odd!");
    }
}
