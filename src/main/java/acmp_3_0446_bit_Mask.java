import java.util.HashMap;
import java.util.Scanner;

public class acmp_3_0446_bit_Mask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 0;
        String zastavka = "";
        HashMap<Character, Integer>  decoder = new HashMap<>();
        decoder.put('.' , 0);
        decoder.put('B' , 1);
        decoder.put('G' , 2);
        decoder.put('R' , 4);

        scanner.nextLine();
        for (int i = 0; i < m; i ++) {
            zastavka += scanner.nextLine();
        }
//        System.out.println(zastavka);
        for (int i = 0; i < m*n; i ++){
            int lamp = scanner.nextInt();
            int zastavkaColor = decoder.get(zastavka.charAt(i));
            if((zastavkaColor & lamp) == zastavkaColor){
                count ++;
            }

        }
        if (count == m*n){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}














