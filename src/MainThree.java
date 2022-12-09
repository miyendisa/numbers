import java.util.Scanner;

public class MainThree {
    public static void main(String[] args) {
        int number, i,average;
        int sum = 0, counter = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        for (i = 1; i < number; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                sum += i;
                counter++;
                System.out.println(i);
            }
        }
        average = sum / counter;
        System.out.println("Average: " + average);
    }
}
