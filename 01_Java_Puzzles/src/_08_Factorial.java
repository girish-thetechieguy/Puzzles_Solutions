import java.util.Scanner;

public class _08_Factorial {
    public static void main(String[] args) {
        System.out.println("Enter A: ");
        Scanner scannerA = new Scanner(System.in);
        int a = scannerA.nextInt();
        if(a<0)
            System.out.println("Cannot be negetive nor!");
        else {
            int fact = 1;
            for(int i = 1 ; i <= a ; i++ ){
                fact = i * fact;
            }
            System.out.println("Final Factorial value of " + a + " is : "+ fact);
        }

    }
}
