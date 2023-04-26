import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isSmaller {

    @Test
    @DisplayName("Is Smaller 2/3, 1/3 False")
    void testIsSmaller() {
        Ratio r1 = new Ratio(2,3);
        Ratio r2 = new Ratio(1,3);
        assertFalse(r1.isSmaller(r2));
    }
    @Test
    @DisplayName("Is Smaller 1/3, 4/6 True")

    void testIsSmaller2() {
        Ratio r1 = new Ratio(1,3);
        Ratio r2 = new Ratio(4,6);
        assertTrue(r1.isSmaller(r2));
    }
    @Test
    @DisplayName("Is Smaller 2/3, 2/3 False")
    void testIsSmaller3() {
        Ratio r1 = new Ratio(2,3);
        Ratio r2 = new Ratio(2,3);
        assertFalse(r1.isSmaller(r2));
    }
    @Test
    @DisplayName("Is Smaller 1/3, 2/-3 False")
    void testIsSmaller4() {
        Ratio r1 = new Ratio(1, 3);
        Ratio r2 = new Ratio(2, -3);
        assertFalse(r1.isSmaller(r2));
    }
    @Test
    @DisplayName("Is Smaller 1/3, -2/3 False")
    void testIsSmaller5() {
        Ratio r1 = new Ratio(1, 3);
        Ratio r2 = new Ratio(-2, 3);
        assertFalse(r1.isSmaller(r2));
    }
    @Test
    @DisplayName("Is Smaller 1/3, -2/-3 True")
    void testIsSmaller6() {
        Ratio r1 = new Ratio(1, 3);
        Ratio r2 = new Ratio(-2, -3);
        assertTrue(r1.isSmaller(r2));
    }
    @Test
    @DisplayName("Is Smaller 1/3, -2/0 Exception")
    void testIsSmaller7() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Ratio(1,3).isSmaller(new Ratio(-2,0)));
    }
    @Test
    @DisplayName("Is Smaller 1/0, -2/0 Exception")
    void testIsSmaller8() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Ratio(1,0).isSmaller(new Ratio(-2,0)));
    }
    @Test
    @DisplayName("Is Smaller 1/0, -2/0 Exception")
    void testIsSmaller9() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Ratio(1,0).isSmaller(new Ratio(-2,0)));
    }
}