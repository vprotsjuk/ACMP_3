import java.util.ArrayList;
import java.util.Scanner;

public class acmp_3_0246 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        int res = n-1;
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        String s = "rrrrrr";
        String  d = "rrrrrr";
        s.hashCode();
        list.add(0);
        if (n == 1){
            System.out.println(res);
        }else {
            for (int i = 0; i < n; i++) {
                if (list.get(i) + 1 == list.get(i+1)){
                    res--;
                }
            }
            System.out.println(res);
        }
    }
}
