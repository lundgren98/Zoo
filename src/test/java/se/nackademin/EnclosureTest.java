import org.junit.Test;
import static org.junit.Assert.*;

public class EnclosureTest {
    private Enclosure enclosure = new Enclosure();

    @Test
    public void testGetSize() {
        enclosure.setSize(100);
        assertEquals(100, enclosure.getSize(), 0);
    }

    @Test
    public void testGetDirty() {
        enclosure.setDirty(true);
        assertTrue(enclosure.getDirty());
    }

    @Test
    public void testGetTemperature() {
        enclosure.setTemperature(70);
        assertEquals(70, enclosure.getTemperature(), 0);
    }

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
