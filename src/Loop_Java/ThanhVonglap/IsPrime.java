package Loop_Java.ThanhVonglap;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter is number : ");
        int number = prime.nextInt();
        if (number < 2) {
            System.out.println("not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                for(;number % i == 0;i++ ){
                    check = false ;
                }
            }
            if (check)
                System.out.println(number + " : is prime");
            else
                System.out.println(number + " : not a prime");
        }
    }
}
