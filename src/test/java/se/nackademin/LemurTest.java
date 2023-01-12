package se.nackademin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.beans.Transient;

import org.junit.Test;

public class LemurTest {
    @Test
    public void shouldEat() {
        Lemur tomislav = new Lemur();
        tomislav.hunger = 8;
        boolean isHungry = tomislav.eat();
        assertTrue(isHungry);

    }
    @Test
    public void shouldSleep() {
        Lemur alexander = new Lemur();
        alexander.energyLevel = 2;
        boolean isTired = alexander.sleep();
        assertTrue(isTired);
    }
    @Test
    public void shouldSnuggle() {
        Lemur timmy = new Lemur();
        String response = timmy.snuggle();
        assertEquals("Det har blivit fel", "Snuggling...", response);
    }
}
