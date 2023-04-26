import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class equals {


    @Test
    @DisplayName("Equals 2/1, 2/1")
    void testEquals2() {
        assertTrue(new Ratio(2,1).equals(new Ratio(2,1)));
    }
    @Test
    @DisplayName("Equals 1/2, 1/3")
    void testEquals3() {
        assertFalse(new Ratio(1,2).equals(new Ratio(1,3)));
    }
    @Test
    @DisplayName("Equals 1/2, 1/-2")
    void testEquals4() {
        assertFalse(new Ratio(1,2).equals(new Ratio(1,-2)));
    }

    @Test
    @DisplayName("Equals 1/0, 1/2")
    void testEquals10(){
        assertThrows(IllegalArgumentException.class,
                () -> new Ratio(1,0).equals(new Ratio(1,2)));
    }
}