import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class getResultToDouble {

    @Test
    @DisplayName("Get Result To Double 1/1")
    void testGetResultToDouble() {
        assertEquals (1.0, new Ratio(1,1).getResultToDouble());
        assertEquals ("1.0", Objects.toString(new Ratio(1,1).getResultToDouble()));



    }
    @Test
    @DisplayName("Get Result To Double 2/4")
    void testGetResultToDouble2() {
        assertEquals (0.5, new Ratio(2,4).getResultToDouble());
    }
    @Test
    @DisplayName("Get Result To Double 2/0")
    void testGetResultToDouble3() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new  Ratio(2,0).getResultToDouble());
    }
    @Test
    @DisplayName("Get Result To Double 0/4")
    void testGetResultToDouble4() {
        assertEquals (0.0, new Ratio(0,4).getResultToDouble());
    }
    @Test
    @DisplayName("Get Result To Double 7/8")
    void testGetResultToDouble5() {
        assertEquals (0.875, new Ratio(7,8).getResultToDouble());
    }
    @Test
    @DisplayName("Get Result To Double 5/1")
    void testGetResultToDouble6() {
        assertEquals (5.0, new Ratio(5,1).getResultToDouble());
    }
}