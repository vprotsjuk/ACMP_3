import java.util.Scanner;

public class acmp_3_0085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = 0;
        if ( b > a){
            int temp = b;
            b = a;
            a = temp;
        }
        if (a == b || a % 2 == 0){
            for (int i = 0; i < b; i++) {
                res = res * 10;
                res += 1;
            }
            System.out.println(res);
        }
        else {
            System.out.println(1);
        }

    }
}
//        Scanner scanner = new Scanner(System.in);
//        int first = input(scanner.nextInt());
//        int second = input(scanner.nextInt());
//        nOD(first, second);
//
//    }
//
//    static int input(int a) {
//        int unityNumber = 0;
//        for (int i = 0; i < a; i++) {
//            unityNumber = unityNumber * 10;
//            unityNumber += 1;
//        }
//        return unityNumber;
//    }
//
//    static void nOD(int first, int second) {
//        if (second > first){
//            int temp = second;
//            second = first;
//            first = temp;
//        }
//
//        int c = Integer.MAX_VALUE;
//        while (c > 0) {
//            c = first % second;
//            first = second;
//            second = c;
//        }
//        System.out.println(first);
//    }
//}

