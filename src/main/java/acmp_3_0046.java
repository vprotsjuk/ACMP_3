import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class acmp_3_0046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String s = "2.7182818284590452353602875";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i) - '0');
        }
        while (list.size() > a + 3) {
            list.remove(a + 3);
        }
        if (a == 0) {
            System.out.println(3);
        }else if (a == 25) {
            System.out.println(s);
        }
         else {
            if (list.get(a + 2) >= 5) {
                list.set(a + 1, list.get(a + 1) + 1);
            }
            list.remove(list.size() - 1);
//            System.out.println(list);
            StringBuilder listString = new StringBuilder();
            for (Integer in : list) {
                listString.append(in);
            }
            listString.replace(1,3,".");
            System.out.println(listString);
        }
    }
}




