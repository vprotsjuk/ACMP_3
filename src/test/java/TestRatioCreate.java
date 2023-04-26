import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRatioCreate {
    @Test
    @DisplayName("Zero Down 1/0")
    void createRatioZeroDown(){
        assertThrows(IllegalArgumentException.class,
                () -> new Ratio(1,0));
    }
    @Test
    @DisplayName("Zero Up 0/1")
    void createRatioZeroUp(){
        assertDoesNotThrow(() -> new Ratio(0,1));
//        assertEquals("Ratio{up=0, down=1}", new Ratio(0,1).toString());
    }

}
