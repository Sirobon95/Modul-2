package BàitapThem;

import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter N :");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++){
            if(i % 3 == 0)
            System.out.println(i);
       }
    }
}
