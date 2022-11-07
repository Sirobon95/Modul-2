package Loop_Java.ThanhVonglap;

import java.util.Scanner;

public class LendingMoney {
    public static void main(String[] args) {
        double money ;
        int month ;
        double interest ;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter deposit");
        money = input.nextDouble();
        System.out.println("Enter a month");
        month = input.nextInt();
        System.out.println("Enter is interest ");
        interest = input.nextDouble();
//        double calculateInterest = 0 ;
        for(int i = 0 ; i < month ; i++){
            money += money * (interest/100)/12 * month ;
        System.out.println("interest rate received :" + money);
        }
    }
}
