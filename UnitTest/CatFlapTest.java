import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatFlapTest {
    CatFlap kattelem;

    @BeforeEach
    void setUp() {
        kattelem = new CatFlap();
        assertEquals(flapState.LUKKET, kattelem.getMode());
    }

    @Test
    void getMode() {
        assertEquals(flapState.LUKKET, kattelem.getMode());
    }

    @Test
    void setMode() {
        // Ændr dens state til at være åben
        kattelem.setMode(flapState.IND_UD);
        assertEquals(flapState.IND_UD, kattelem.getMode());
    }

    @Test
    void canEnter() {
        Cat meowth = new Cat(1);
        kattelem.registerCat(meowth);
        boolean result = kattelem.canEnter(meowth);
        assertEquals(true,result);

    }

    @Test
    void canExit() {
    }

    @Test
    void catRegistered() {
    }

    @Test
    void registerCat(Cat meowth) {
    }

    @Test
    void getRegisteredCatsCount() {
    }
}
