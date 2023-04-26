public class Squer {
    public static void main(String[] args) {
        System.out.println("sqr " + calc(1, 50));
        System.out.println("one " + 1 * (1 + 2 * (1 + 3 * (1 + 4 * (1 + 5)))));
//        System.out.println("two " + (((4+1)*3+1)*2+1));
        System.out.println("mult " + mult(1, 50));
    }

    static double mult(double one, double count) {
        if (one == count) {
            return 1;
        } else {
            if (one == 1) {
                return one * (mult((++one), count));
            } else {
                return 1 + (one * (mult((++one), count)));
            }
        }
    }

        /*
        Square In Square Calculator = calc
        Start Point = 1;
        End Point = 50
        result = 2.999999999999986 -> 3.0
        */

    static double calc(int startPoint, int endPoint) {
        if (startPoint <= endPoint)
            return (startPoint > 1 ? 1 : 0) + startPoint * Math.sqrt(calc(++startPoint, endPoint));
        return 1;
    }

    static double calc2(int v, double e) {
        if (Math.pow(1 + v, 1.0 / v) - 1 > e)
            return (v > 1 ? 1 : 0) + v * Math.sqrt(calc2(v + 1, e));
        return 1;
    }
}
