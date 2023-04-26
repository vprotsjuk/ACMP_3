import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isGreater {

    @Test
    @DisplayName("Is Greater 2/3, 1/3 True")
    void testIsGreater() {
        Ratio r1 = new Ratio(2,3);
        Ratio r2 = new Ratio(1,3);
        assertTrue(r1.isGreater(r2));
    }
    @Test
    @DisplayName("Is Greater 1/3, 4/6 False")

    void testIsGreater2() {
        Ratio r1 = new Ratio(1,3);
        Ratio r2 = new Ratio(4,6);
        assertFalse(r1.isGreater(r2));
    }
    @Test
    @DisplayName("Is Greater 2/3, 2/3 False")
    void testIsGreater3() {
        Ratio r1 = new Ratio(2,3);
        Ratio r2 = new Ratio(2,3);
        assertFalse(r1.isGreater(r2));
    }
    @Test
    @DisplayName("Is Greater 1/3, 2/-3 False")
    void testIsGreater4() {
        Ratio r1 = new Ratio(1, 3);
        Ratio r2 = new Ratio(2, -3);
        assertTrue(r1.isGreater(r2));
    }
    @Test
    @DisplayName("Is Greater 1/3, -2/3 True")
    void testIsGreater5() {
        Ratio r1 = new Ratio(1, 3);
        Ratio r2 = new Ratio(-2, 3);
        assertTrue(r1.isGreater(r2));
    }
    @Test
    @DisplayName("Is Greater 1/3, -2/-3 False")
    void testIsGreater6() {
        Ratio r1 = new Ratio(1, 3);
        Ratio r2 = new Ratio(-2, -3);
        assertFalse(r1.isGreater(r2));
    }

    @Test
    @DisplayName("Is Greater 1/0, -2/0 Exception")
    void testIsGreater9() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Ratio(1,0).isGreater(new Ratio(-2,0)));
    }
}