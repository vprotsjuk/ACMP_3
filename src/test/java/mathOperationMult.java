import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;


class mathOperationMult {

//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }

    @Test
    @DisplayName("Mult 2/3 * 3/4")
    void testMathOperationMult() {
        Ratio r1 = new Ratio(2,3);
        Ratio r2 = new Ratio(3,4);
        Assertions.assertEquals("Ratio{up=6, down=12}", Ratio.mathOperationMult(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 1/1 * 1/1")
    void testMathOperationMult2() {
        Ratio r1 = new Ratio(1,1);
        Ratio r2 = new Ratio(1,1);
        Assertions.assertEquals("Ratio{up=1, down=1}", Ratio.mathOperationMult(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 1/10 * 10/1")
    void testMathOperationMult3() {
        Ratio r1 = new Ratio(1,10);
        Ratio r2 = new Ratio(10,1);
        Assertions.assertEquals("Ratio{up=10, down=10}", Ratio.mathOperationMult(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 1/10 * 10/1 Simplify")
    void testMathOperationMult4() {
        Ratio r1 = new Ratio(1,10);
        Ratio r2 = new Ratio(10,1);
        Assertions.assertEquals("Ratio{up=1, down=1}", Ratio.mathOperationMult(r1,r2).simplify().toString());
    }
    @Test
    @DisplayName("Mult -2/-3 * 3/4")
    void testMathOperationMult5() {
        Ratio r1 = new Ratio(-2,-3);
        Ratio r2 = new Ratio(3,4);
        Assertions.assertEquals("Ratio{up=6, down=12}", Ratio.mathOperationMult(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 2/3 * -3/-4")
    void testMathOperationMult6() {
        Ratio r1 = new Ratio(2,3);
        Ratio r2 = new Ratio(-3,-4);
        Assertions.assertEquals("Ratio{up=6, down=12}", Ratio.mathOperationMult(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult -2/3 * -3/4")
    void testMathOperationMult7() {
        Ratio r1 = new Ratio(-2,-3);
        Ratio r2 = new Ratio(-3,-4);
        Assertions.assertEquals("Ratio{up=6, down=12}", Ratio.mathOperationMult(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 2/-3 * 3/-4")
    void testMathOperationMult8() {
        Ratio r1 = new Ratio(2,-3);
        Ratio r2 = new Ratio(3,-4);
        Assertions.assertEquals("Ratio{up=6, down=12}", Ratio.mathOperationMult(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 2/-3 * -3/4")
    void testMathOperationMult9() {
        Ratio r1 = new Ratio(2,-3);
        Ratio r2 = new Ratio(-3,4);
        Assertions.assertEquals("Ratio{up=6, down=12}", Ratio.mathOperationMult(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 2/0 * -3/4")
    void testMathOperationMult10() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Ratio.mathOperationMult(new Ratio(2,0),new Ratio(-3,4)));
    }
    @Test
    @DisplayName("Mult 2/3 * -3/0")
    void testMathOperationMult11() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Ratio.mathOperationMult(new Ratio(2,3),new Ratio(-3,0)));
    }
    @Test
    @DisplayName("Mult 2/0 * -3/0")
    void testMathOperationMult12() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> Ratio.mathOperationMult(new Ratio(2,0),new Ratio(-3,0)));
    }
    @Test
    @DisplayName("Mult 0/3 * 3/4")
    void testMathOperationMult13() {
        Ratio r1 = new Ratio(0,3);
        Ratio r2 = new Ratio(3,4);
        Assertions.assertEquals("Ratio{up=0, down=12}", Ratio.mathOperationMult(r1,r2).toString());
    }
    @Test
    @DisplayName("Mult 2/1 * 6/4")
    void testMathOperationMult14() {
        Ratio r1 = new Ratio(2,1);
        Ratio r2 = new Ratio(6,4);
        Assertions.assertEquals(3.0, Ratio.mathOperationMult(r1,r2).getResultToDouble());
    }
}