import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatFlapTest {
    CatFlap s;

    @BeforeEach
    void setUp() {
        s = new CatFlap();
        assertEquals(flapState.LUKKET, s.getMode());
    }

    @Test
    void getMode() {
        assertEquals(flapState.LUKKET, s.getMode());
    }

    @Test
    void setMode() {
    }

    @Test
    void canEnter() {
    }

    @Test
    void canExit() {
    }

    @Test
    void catRegistered() {
    }

    @Test
    void registerCat() {
    }

    @Test
    void getRegisteredCatsCount() {
    }
}
