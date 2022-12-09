import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        int number, i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.println("Even Numbers: ");

        while (i < number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
