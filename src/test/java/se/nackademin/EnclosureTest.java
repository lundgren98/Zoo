package se.nackademin;

import org.junit.Test;
import static org.junit.Assert.*;

public class EnclosureTest {
    private Enclosure enclosure = new Enclosure();

    @Test
    public void testClean() {
        enclosure.setDirty(true);
        enclosure.clean();
        assertFalse(enclosure.getDirty());
    }

    @Test
    public void testClose() {
        enclosure.setOpen(true);
        enclosure.close();
        assertFalse(enclosure.getOpen());
    }

    @Test
    public void testOpen() {
        enclosure.setOpen(false);
        enclosure.open();
        assertTrue(enclosure.getOpen());
    }
}
