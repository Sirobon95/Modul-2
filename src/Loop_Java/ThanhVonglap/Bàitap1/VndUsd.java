package Loop_Java.ThanhVonglap.Bàitap1;

import java.util.Scanner;

public class VndUsd {
    public static void main(String[] args) {
        System.out.printf(" Enter Usd : ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        System.out.println("Vnd :" + money*27000 );
    }
}
