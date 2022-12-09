import java.util.Scanner;
public class MainOne {
    public static void main(String[] args) {
        int number,i;
        Scanner scanner=new Scanner (System.in);

        System.out.print("Enter a number: ");
        number=scanner.nextInt();
        System.out.println("Even Numbers: ");

        for (i=0;i<=number;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
