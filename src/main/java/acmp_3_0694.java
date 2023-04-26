import java.util.Scanner;

public class acmp_3_0694 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int maxLeft = 0;
        int minRight = Integer.MAX_VALUE;
        while (number > 0){
            int left = scanner.nextInt();;
            int right = scanner.nextInt();
            if (left > maxLeft) {
                maxLeft = left;
            }
            if (right < minRight){
                minRight = right;
            }
            number--;

        }
        if (minRight < maxLeft){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
