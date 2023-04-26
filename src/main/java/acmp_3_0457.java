import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class acmp_3_0457 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            ls.add(str.charAt(i) - '0');
        }
        //neg(ls);
        //pos(ls);
        dif(ls, pos(ls), neg(ls) );
        ls.clear();

    }

    public static int neg(ArrayList<Integer> ls) {
        Collections.sort(ls);
        int negative = 0;
        int thousand = 1000;
        for (int i = 0; i < 4; i++) {
            negative += ls.get(i) * thousand;
            thousand /= 10;
        }
        System.out.println(negative);;
        return negative;
    }

    public static int pos(ArrayList<Integer> ls) {
        Collections.reverse(ls);
        int positive = 0;
        int thousand2 = 1000;
        for (int i = 0; i < 4; i++) {
            positive += ls.get(i) * thousand2;
            thousand2 /= 10;
        }
        System.out.println(positive);;
        return positive;
    }

    public static ArrayList<Integer> dif(ArrayList<Integer> ls, int pos, int neg) {
        int different = pos - neg;
        ls.clear();
        for (int i = 0; i < 4; i++) {
            ls.add(different % 10);
            different /= 10;
        }
        System.out.println(ls);
        return ls;
    }

}


