import java.util.Scanner;

public class _11_MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter table nor: ");
        Scanner scannerA = new Scanner(System.in);
        int tableNor = scannerA.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNor + "X" + i + "=" + tableNor * i);
        }
    }
}
