public class Ratio {
    long up;
    long down;
    public long getUp() {
        return up;
    }
    public long getDown() {
        return down;
    }
    public Ratio(long up, long down) {
        this.up = up;
        this.down = down;
        if (down == 0){
            throw new IllegalArgumentException("Down can not be zero");
        }
        if ((up < 0 && down < 0) || (up > 0 && down < 0)) {
            this.up = up * -1;
            this.down = down * -1;
        }
    }

    public Ratio getDoubleRatio() {
        return new Ratio(up * 2, down);
    }

    @Override
    public String toString() {
        return "Ratio{" + "up=" + up + ", down=" + down + '}';
    }

    public static Ratio mathOperationMult(Ratio one, Ratio two) {
//        Ratio mult = new Ratio(one.up * two.up, one.down * two.down);
        return new Ratio(one.up * two.up, one.down * two.down);
    }

    public double getResultToDouble() {
        return up / (double) down;
    }
    public boolean isGreater(Ratio two) {
        return this.getResultToDouble() > two.getResultToDouble();
    }
    public boolean isSmaller(Ratio two){
        return this.getResultToDouble()  < two.getResultToDouble();
    }
//    static boolean isGreater(Ratio one, Ratio two){
//        return one.up/ one.down > two.up/ two.down;
//    }
//    static boolean isSmaller(Ratio one, Ratio two){
//        return one.up/ one.down < two.up/ two.down;
//    }
     public boolean equals(Ratio two){
        return this.getResultToDouble() == two.getResultToDouble();
    }
    public static Ratio mathOperationPlus(Ratio one, Ratio two){
        return new Ratio((one.up*two.down)+(two.up* one.down),
                (two.down * one.down));
    }
    public static Ratio mathOperationMinus(Ratio one, Ratio two){
        return new Ratio((one.up*two.down)-(two.up* one.down),
                (two.down* one.down));
    }
    public static Ratio mathOperationDiv(Ratio one, Ratio two){
        if (two.up == 0){
            throw new IllegalArgumentException("Down can not be zero");
        }
        return  Ratio.mathOperationMult(one, new Ratio(two.down, two.up));
    }
    public Ratio simplify() {
        Ratio one = new Ratio(up, down);
        int signUp = 1;
        if (one.up < 0){
            signUp = -1;
        }
        one.up = Math.abs(one.up);
        if (one.up == one.down){
            return new Ratio(1 * signUp,1);
        }
        if (one.up == 0){
            return new Ratio(0,1);
        }
        long big = 0;
        long small = 0;
        if (one.up > one.down){
            big = one.up;
            small = one.down;
        }
        else {
            big = one.down;
            small = one.up;
        }
        long res = big % small;
        while (res > 0){
            big = small;
            small = res;
            res = big % small;
        }
        return new Ratio(one.up/small * signUp, one.down/small);
    }








    public static void main(String[] args) {

        System.out.println("new Ratio(9,2).getDoubleRatio().toString() " + new Ratio(9,-2).getDoubleRatio().toString());
        Ratio r1 = new Ratio(1,2);
        Ratio r2 = new Ratio(1,2);
        Ratio r3 = new Ratio(-9,9);
        Ratio r4 = new Ratio(24,6);
        Ratio r5 = new Ratio(25,900);
        System.out.println("r1 "+r1);
        System.out.println("r1.getDoubleRatio " + r1.getDoubleRatio());
        System.out.println("r2.getDoubleRatio() " + r2.getDoubleRatio());
        System.out.println("Ratio.mulTwoRatio(r1, r2) " + Ratio.mathOperationMult(r1, r2));
        System.out.println("r1.getResultToDouble() " + r1.getResultToDouble());
        System.out.println("r2.getResultToDouble() " + r2.getResultToDouble());
        System.out.println("new Ratio(10,15).toDouble() " + new Ratio(10,15).getResultToDouble());
        System.out.println(r3.isGreater(r4));
        System.out.println(r3.isSmaller(r4));

        System.out.println("r1.equals(r2) " + r1.equals(r2));
        System.out.println("Ratio.mathOperationPlus(r1, r2) " + Ratio.mathOperationPlus(r1, r2));
        System.out.println("Ratio.mathOperationPlus(r1, r2) " + Ratio.mathOperationMinus(r1, r2));
        System.out.println("Ratio.mathOperationDiv(r1, r2) " + Ratio.mathOperationDiv(r1, r2));
        System.out.println("Ratio.simplify(r3) " + r3.simplify());
        System.out.println("Ratio.simplify(r5) " + r5.simplify());

        /*Сравнение дробей =изБигер и изСмолер не статические;
        мат операции статические;
        метод иквелс не статический;
        метод сокращения дробей (только изменение полей);
         */
    }
}
