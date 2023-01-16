package se.nackademin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void shouldNotEat() {
        Lemur tomislav = new Lemur();
        tomislav.hunger = 3;
        boolean isHungry = tomislav.eat();
        assertFalse(isHungry);

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
        assertEquals("Something went wrong.", "Snuggling...", response);
        assertEquals(8, timmy.energyLevel);
        assertEquals(6, timmy.getFluffiness());
    }
    @Test
    public void shouldSpeak() {
        Lemur mira = new Lemur();
        String response = mira.speak();
        assertEquals("Hakkunah Matatatatatatata", response);
    }
    @Test
    public void shouldBackflip() {
        Lemur lemur = new Lemur();
        String response = lemur.backflip();
        assertEquals("Lemur backflips", response);
    }
    @Test
    public void shouldGetOld() {
        Lemur lemur = new Lemur();
        int age = lemur.getOld();
        assertEquals(1, age);
    }
    @Test
    public void shouldGetDirty() {
        Lemur lemur = new Lemur();
        boolean isDirty = lemur.getDirty();
        assertEquals(false, isDirty);
    }

    @Test
    public void shouldBeatBox() {
        Lemur lemur = new Lemur();
        String beatboxing = lemur.beatBox();
        assertEquals("Lemur is beatboxing", beatboxing);
    }
}

