
import java.util.Scanner;

public class hailu4 {

    public static void main(String[] args) {

        
        Scanner userInput = new Scanner(System.in);

        System.out.println("please inter the first number");

                    int numberHolder1 = userInput.nextInt();

        System.out.println("Please inter the second Number");

        int numberHolder2 = userInput.nextInt();

        int number3 = numberHolder1 + numberHolder2;

        System.out.println(number3);

        if (number3 == 0) {
            System.out.println("no win");

        }


        if (number3 == 21) {

            System.out.println("winn");
        } else {

            System.out.println("zemm");

        }
    }
}
