import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class getDoubleRatio {
    //Что делать, если чар
    // как запаковать все тесты в пакадж относящийся к классу Ратио
    // в каждый ли тест кидать ассершн ноля?
    /* можно ли называть метод в тесте также, как и в базе.
    И почему в тесте вызывается базовый метод, а не тестовый
     */
    // что показывают полоски в Ратио
    // что такое @Not null
    // как запустить все тесты вместе
    // почему на ТуСтрингк вертикальная полоска
    // Иквелз


    @Test
    @DisplayName("Get Double 6/3")
    void testGetDoubleRatio() {
        var ratio = new Ratio(6, 3);
        var doubleRatio = ratio.getDoubleRatio();
        assertEquals(12,doubleRatio.getUp());
        assertEquals(3,doubleRatio.getDown());


//        Assertions.assertEquals ("Ratio{up=12, down=3}", ratio.getDoubleRatio().toString());

    }
    @Test
    @DisplayName("Get Double -2/3")
    void testGetDoubleRatio2() {
        var ratio = new Ratio(-2, 3);
        Assertions.assertEquals ("Ratio{up=-4, down=3}", ratio.getDoubleRatio().toString());
    }
    @Test
    @DisplayName("Get Double -2/-3")
    void testGetDoubleRatio3() {
        var ratio = new Ratio(-2, -3);
        Assertions.assertEquals ("Ratio{up=4, down=3}", ratio.getDoubleRatio().toString());
    }
    @Test
    @DisplayName("Get Double 7/-2")
    void testGetDoubleRatio4() {
        var ratio = new Ratio(7, -2);
        Assertions.assertEquals ("Ratio{up=-14, down=2}", ratio.getDoubleRatio().toString());
    }
    @Test
    @DisplayName("Get Double 0/50")
    void testGetDoubleRatio5() {
        Ratio ratio = new Ratio(0, 50);
        assertEquals ("Ratio{up=0, down=50}", ratio.getDoubleRatio().toString());
    }
    @Test
    @DisplayName("Get Double 8/0")
    void testGetDoubleRatio6() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    new Ratio(8, 0).getDoubleRatio();
                });
    }
    @Test
    @DisplayName("Get Double 2/2")
    void testGetDoubleRatio7() {
        var ratio = new Ratio(2, 2);
        Assertions.assertEquals (2.0, ratio.getDoubleRatio().getResultToDouble());
    }









    @Test
    @DisplayName("is Greater Compare")
    void testIsGreater() {
        Ratio r1 = new Ratio(2,3);
        Ratio r2 = new Ratio(1,3);
        assertTrue(r1.isGreater(r2) == true);
    }

    @Test
    @DisplayName("is Smaller Compare")
    void testIsSmaller() {
        Ratio r1 = new Ratio(2,3);
        Ratio r2 = new Ratio(1,3);
        assertFalse(r1.isSmaller(r2));
    }

    @Test
    @DisplayName("Equals")
    void testEquals() {
        Ratio r1 = new Ratio(1,3);
        Ratio r2 = new Ratio(1,3);
        assertEquals("true", Objects.toString(r1.equals(r2)));
    }

    @Test
    @DisplayName("Plus")
    void mathOperationPlus() {
        Ratio r1 = new Ratio(2,3);
        Ratio r2 = new Ratio(4,6);
        assertEquals("Ratio{up=24, down=18}", Ratio.mathOperationPlus(r1,r2).toString());
    }

    @Test
    @DisplayName("Minus")
    void mathOperationMinus() {
        Ratio r1 = new Ratio(5,4);
        Ratio r2 = new Ratio(1,2);
        assertEquals("Ratio{up=6, down=8}", Ratio.mathOperationMinus(r1,r2).toString());
    }

    @Test
    @DisplayName("Div")
    void mathOperationDiv() {
        Ratio r1 = new Ratio(5,4);
        Ratio r2 = new Ratio(1,4);
        assertEquals("Ratio{up=20, down=4}", Ratio.mathOperationDiv(r1,r2).toString());
    }

    @Test
    @DisplayName("Simplify")
    void simplify() {
        Ratio ratio = new Ratio(18,24);
        assertEquals("Ratio{up=3, down=4}", ratio.simplify().toString());
    }

    @Test
    void main() {
    }
}
