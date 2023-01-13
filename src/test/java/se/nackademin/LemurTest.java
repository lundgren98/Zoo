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
        assertEquals(8, timmy.energyLevel);
        assertEquals(6, timmy.getFluffiness());
    }
    @Test
    public void shouldSpeak() {
        Lemur mira = new Lemur();
        String svar = mira.speak();
        assertEquals("Hakkunah Matatatatatatata", svar);
    }
    @Test
    public void shouldBackflip() {
        Lemur lemur = new Lemur();
        String response = lemur.backflip();
        assertEquals("Lemur backflips", response);
    }
    @Test
    public void shoudBliÄldre() {
        Lemur lemur = new Lemur();
        int ålder = lemur.bliÄldre();
        assertEquals(1, ålder);
    }
}

