package Quanly_so;

import java.util.Scanner;

public class MainNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quan ly mang so");
            System.out.println("1. Hien thi so");
            System.out.println("2. Thêm so");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ManagerNumber.show();
                    break;
                case 2:
                    System.out.println("Nhập số cần thêm");
                    int num = scanner.nextInt();
                    ManagerNumber.add(num);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
