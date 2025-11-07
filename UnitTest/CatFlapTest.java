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
        s = new CatFlap();
        // Ændr dens state til at være åben
        s.setMode(flapState.IND_UD);
        assertEquals(flapState.IND_UD, s.getMode());

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
