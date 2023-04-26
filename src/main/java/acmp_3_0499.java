import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class acmp_3_0499 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int kilogram = scanner.nextInt();
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();


        if (a1 <= kilogram && b1 >= people) {
            System.out.println("YES");
        } else if (a1 + a2 <= kilogram && b1 + b2 >= people) {
            System.out.println("YES");
        } else if (a1 + a2 + a3 <= kilogram && b1 + b2 + b3 >= people) {
            System.out.println("YES");
        } else if (a2 <= kilogram && b2 >= people) {
            System.out.println("YES");
        } else if (a2 + a3 <= kilogram && b2 + b3 >= people) {
            System.out.println("YES");
        } else if (a3 <= kilogram && b3 >= people) {
            System.out.println("YES");
        } else if (a1 + a3 <= kilogram && b1 + b3 >= people) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}











//        HashMap<Integer, Integer> set = new HashMap<>();
//        set.put(scanner.nextInt(), scanner.nextInt());
//        int sumPeople = set.values().stream().mapToInt(Integer::intValue).sum();
//        int sumkg = set.keySet().stream().mapToInt(Integer::intValue).sum();
//        if (sumkg <= kilogram && sumPeople >= people){
//            System.out.println("YES");
//        }
//        set.put(scanner.nextInt(), scanner.nextInt());
//        set.put(scanner.nextInt(), scanner.nextInt());
////        set.put(scanner.nextInt(), scanner.nextInt());
////        System.out.println(people);
////        System.out.println(kilogram);
////        System.out.println(set);
//
//        System.out.println(set);
//
//        System.out.println(sumkg);
//        System.out.println(sumPeople);

