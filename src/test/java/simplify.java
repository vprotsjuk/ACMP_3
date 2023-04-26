import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class simplify {

    @Test
    @DisplayName("Simplify 2/4")
    void testSimplify() {
        Assertions.assertEquals("Ratio{up=1, down=2}", new Ratio(2,4).simplify().toString());
    }
    @Test
    @DisplayName("Simplify 9/3")
    void testSimplify2() {
        Assertions.assertEquals("Ratio{up=3, down=1}", new Ratio(9,3).simplify().toString());
    }
    @Test
    @DisplayName("Simplify 9/9")
    void testSimplify3() {
        Assertions.assertEquals("Ratio{up=1, down=1}", new Ratio(9,9).simplify().toString());
    }
    @Test
    @DisplayName("Simplify -9/13")
    void testSimplify4() {
        Assertions.assertEquals("Ratio{up=-9, down=13}", new Ratio(-9,13).simplify().toString());
    }
    @Test
    @DisplayName("Simplify 7/-9")
    void testSimplify5() {
        Assertions.assertEquals("Ratio{up=-7, down=9}", new Ratio(7,-9).simplify().toString());
    }
    @Test
    @DisplayName("Simplify -4/-11")
    void testSimplify6() {
        Assertions.assertEquals("Ratio{up=4, down=11}", new Ratio(-4,-11).simplify().toString());
    }
    @Test
    @DisplayName("Simplify -15/9")
    void testSimplify7() {
        Assertions.assertEquals("Ratio{up=-5, down=3}", new Ratio(-15,9).simplify().toString());
    }
    @Test
    @DisplayName("Simplify -9/9")
    void testSimplify8() {
        Assertions.assertEquals("Ratio{up=-1, down=1}", new Ratio(-9,9).simplify().toString());
    }
}