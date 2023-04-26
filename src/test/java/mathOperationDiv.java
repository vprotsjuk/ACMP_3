import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mathOperationDiv {

    @Test
    void mathOperationDiv() {
    }
    @Test
    @DisplayName("Mult 1/2 / 1/0")
    void testMathOperationDiv2() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Ratio.mathOperationDiv(new Ratio(1,2),new Ratio(1,0)));
    }
    @Test
    @DisplayName("Mult 1/0 / 2/5")
    void testMathOperationDiv3() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Ratio.mathOperationDiv(new Ratio(1,0),new Ratio(2,5)));
    }
    @Test
    @DisplayName("Mult 4/0 / 5/0")
    void testMathOperationDiv4() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Ratio.mathOperationDiv(new Ratio(4,0),new Ratio(5,0)));
    }
    @Test
    @DisplayName("Mult 4/2 / 0/1")
    void testMathOperationDiv5() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Ratio.mathOperationDiv(new Ratio(4,2),new Ratio(0,1)));
    }

    @Test
    @DisplayName("Mult 1/2 / 1/2")
    void testMathOperationDiv7() {
        Ratio r1 = new Ratio(1,2);
        Ratio r2 = new Ratio(1,2);
        Assertions.assertEquals("Ratio{up=2, down=2}", Ratio.mathOperationDiv(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 1/2 / 1/4")
    void testMathOperationDiv8() {
        Ratio r1 = new Ratio(1,2);
        Ratio r2 = new Ratio(1,4);
        Assertions.assertEquals("Ratio{up=4, down=2}", Ratio.mathOperationDiv(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 3/2 / 16/4")
    void testMathOperationDiv9() {
        Ratio r1 = new Ratio(4,2);
        Ratio r2 = new Ratio(16,4);
        Assertions.assertEquals("Ratio{up=16, down=32}", Ratio.mathOperationDiv(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult -1/2 / 3/4")
    void testMathOperationDiv10() {
        Ratio r1 = new Ratio(-1,2);
        Ratio r2 = new Ratio(3,4);
        Assertions.assertEquals("Ratio{up=-4, down=6}", Ratio.mathOperationDiv(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 1/-2 / 3/4")
    void testMathOperationDiv11() {
        Ratio r1 = new Ratio(-1,2);
        Ratio r2 = new Ratio(3,4);
        Assertions.assertEquals("Ratio{up=-4, down=6}", Ratio.mathOperationDiv(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 1/2 / -3/4")
    void testMathOperationDiv12() {
        Ratio r1 = new Ratio(1,2);
        Ratio r2 = new Ratio(-3,4);
        Assertions.assertEquals("Ratio{up=-4, down=6}", Ratio.mathOperationDiv(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 1/2 / 3/-4")
    void testMathOperationDiv13() {
        Ratio r1 = new Ratio(1,2);
        Ratio r2 = new Ratio(3,-4);
        Assertions.assertEquals("Ratio{up=-4, down=6}", Ratio.mathOperationDiv(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 1/2 / -3/-4")
    void testMathOperationDiv14() {
        Ratio r1 = new Ratio(1,2);
        Ratio r2 = new Ratio(-3,-4);
        Assertions.assertEquals("Ratio{up=4, down=6}", Ratio.mathOperationDiv(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult -1/-2 / -3/-4")
    void testMathOperationDiv15() {
        Ratio r1 = new Ratio(-1,-2);
        Ratio r2 = new Ratio(-3,-4);
        Assertions.assertEquals("Ratio{up=4, down=6}", Ratio.mathOperationDiv(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 0/2 / 1/4")
    void testMathOperationDiv16() {
        Ratio r1 = new Ratio(0,2);
        Ratio r2 = new Ratio(1,4);
        Assertions.assertEquals("Ratio{up=0, down=2}", Ratio.mathOperationDiv(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 1/2 / 1/6")
    void testMathOperationDiv17() {
        Ratio r1 = new Ratio(1,2);
        Ratio r2 = new Ratio(1,6);
        Assertions.assertEquals(3.0, Ratio.mathOperationDiv(r1,r2).getResultToDouble());
    }
}