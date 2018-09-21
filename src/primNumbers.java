
import java.awt.*;
import java.util.Scanner;
public class primNumbers {

    public static void main(String[] args) {

        Scanner prim = new Scanner(System.in);

           int primNum = prim.nextInt();

              int x = primNum;

        int count = 0;

        do {

            if (count % 2 != 0)

            if(count % 3==0)

                System.out.print("Not prime");

            if(count %5==0 )

                System.out.print("Not prime");

                System.out.println(count + "This is the prime number");
            count++;
        }

        while (count < x);

   }
}

