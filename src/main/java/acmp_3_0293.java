import java.util.ArrayList;
import java.util.Scanner;

public class acmp_3_0293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companies = scanner.nextInt();
        ArrayList<Integer> income = new ArrayList<>();
        ArrayList<Integer> tax = new ArrayList<>();
        int result = 0;
        int temp = 0;
        int position = 0;
        for (int i = 0; i < companies ; i++) {
            income.add(scanner.nextInt());
        }
        for (int i = 0; i < companies ; i++) {
            tax.add(scanner.nextInt());
        }
        for (int i = 0; i < income.size(); i ++){
           temp = income.get(i) * tax.get(i);
           if (temp > result){
               result = temp;
               position = i;
           }
        }
//        System.out.println(income);
//        System.out.println(tax);
        System.out.println(position + 1);

    }
}
