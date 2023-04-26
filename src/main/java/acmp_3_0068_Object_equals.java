import java.util.Objects;
import java.util.Scanner;

public class acmp_3_0068_Object_equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int trip = scanner.nextInt();
        if (Objects.equals(s, "Home")){
            System.out.println("Yes");
        }else {
            if (Objects.equals(s, "School") && trip%2==0) {
                System.out.println("No");
            }else {
                System.out.println("Yes");
            }
        }
    }
}
