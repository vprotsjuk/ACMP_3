import java.util.ArrayList;
import java.util.Scanner;

public class acmp_3_0271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 1;
        while (b <= n ){
            c = a + b;
            a = b;
            b = c;
            count++;

        }
        if (a == n){
            System.out.println(1);
            System.out.println(count-1);
        }else {
            System.out.println(0);
        }

    }
}
