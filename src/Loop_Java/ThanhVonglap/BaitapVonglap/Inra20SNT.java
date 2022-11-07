package Loop_Java.ThanhVonglap.BaitapVonglap;

import java.util.Scanner;

public class Inra20SNT {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap N");
        int number = scanner.nextInt();
        int count = 0;
        for( int N = 2 ; count <= number ; N ++ ){
            boolean Snt = true ;
            for (int i = 2;i < number ; i ++){
                if(N % i == 0){
                    Snt = false ;
                }
            }
            if(Snt = true){
                count ++ ;
                System.out.println(N);
            }
        }

    }
}
//        int dem = 0 ;
//        for( int a = 2; a <= 19 ; a++){
//           boolean Snt = true ;
//           for( int j = 2 ; j < a ; j++){
//                if(a % j == 0){
//                    Snt = false  ;
//                }
//           }
//           if(Snt == true ){
//               dem ++ ;
//               System.out.println(a);
//           }
//       }
//    }
//}
