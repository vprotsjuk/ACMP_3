import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class toString {

    @Test
    @DisplayName("To String 2 / 3")
    void testToString() {
        Assertions.assertEquals("Ratio{up=2, down=3}", new Ratio(2,3).toString());
    }
    @Test
    @DisplayName("To String 0 / 3")
    void testToString2() {
        Assertions.assertEquals("Ratio{up=0, down=3}", new Ratio(0,3).toString());
    }
    @Test
    @DisplayName("To String 5 / 0")
    void testToString3() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Ratio(5,0));
    }
    @Test
    @DisplayName("To String 'a' / 2")
    void testToString4() {
        Assertions.assertEquals("Ratio{up=97, down=2}", new Ratio('a',2).toString());
    }
    @Test
    @DisplayName("To String 'a' / 'b'")
    void testToString5() {
        Assertions.assertEquals("Ratio{up=97, down=98}", new Ratio('a','b').toString());
    }
    @Test
    @DisplayName("To String 4 / 'b'")
    void testToString6() {
        Assertions.assertEquals("Ratio{up=4, down=98}", new Ratio(4,'b').toString());
    }
}