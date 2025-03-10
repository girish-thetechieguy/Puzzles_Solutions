import java.util.Scanner;

public class _04_TempConverter {
    public static void main(String[] args) {
        //F---> C
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temp in(Farenheit):");
        float receivedTemp = scanner.nextFloat();
        receivedTemp = ((receivedTemp - 32)*5)/9;
        System.out.println("Temprature in Celcious is:" + receivedTemp);
    }
}
