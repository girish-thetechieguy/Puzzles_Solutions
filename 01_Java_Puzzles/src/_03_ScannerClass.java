import java.util.Scanner;

public class _03_ScannerClass {
    public static void main(String[] args) {
        int age;
        float score;
        String name;
        System.out.println("Enter name: ");
        Scanner nameScanner = new Scanner(System.in);
        String receivedName  = nameScanner.nextLine();
        System.out.println("Enter age: ");
        Scanner ageScanner = new Scanner(System.in);
        int receivedAge  = ageScanner.nextInt();
        System.out.println("Enter Score: ");
        Scanner scoreScanner = new Scanner(System.in);
        float receivedScpre  = scoreScanner.nextFloat();
        System.out.println("--------OutPut:-----------");
        System.out.println("Name: "+receivedName);
        System.out.println("Age: "+receivedAge);
        System.out.println("Score: "+receivedScpre);
        System.out.println("--------OutPut:-----------");
    }
}
