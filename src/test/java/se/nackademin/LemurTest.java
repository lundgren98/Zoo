package src.test.java.se.nackademin;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

public class LemurTest {
    @Test
    public void shouldEat() {
        Lemur Tomislav = new Lemur();
        Tomislav.hunger = 8;
        boolean isHungry = Tomislav.eat();
        assertTrue(isHungry);

    }
    @Test
    public void shouldSleep() {
        Lemur Alexander = new Lemur();
        Alexander.energyLevel = 2;
        boolean isTired = Alexander.sleep();
        assertTrue(isTired);
    }
    @Test
    public void shouldSnuggle() {
        Lemur Timmy = new Lemur();
        Timmy.snuggle();
        int fluffiness + 2;
        int energyLevel - 2;
    }
}
