package Array_Java;

import java.util.Scanner;

public class Timgiatricuamang {
    public static void main(String[] args) {
        String[] arr = {"mot", "hai", "ba", "bon"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        String input_name = sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(input_name)) {
                System.out.println("nhap ten " + input_name + " vi tri: " + i);
                break;
            }
        }
        System.out.println("ko tim thay ten :" + input_name);
    }
}
