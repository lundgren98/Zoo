package se.nackademin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PersonellTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void sellTicket()
    {
	    Personell per = new Personell();
	    int oldSalary = per.getSalary();
	    per.sell();
	    int newSalary = per.getSalary();
	    assertEquals(newSalary, oldSalary + 1);
    }

    @Test
    public void feedHungryAnimal()
    {
	    Personell per = new Personell();
	    Lemur timon = new Lemur();
	    timon.hunger = 10;
	    boolean wantsToEat = per.feed_animal(timon);
	    assertTrue(wantsToEat);
    }

    @Test
    public void feedFullAnimal()
    {
	    Personell per = new Personell();
	    Lemur timon = new Lemur();
	    timon.hunger = 0;
	    boolean wantsToEat = per.feed_animal(timon);
	    assertFalse(wantsToEat);
    }

    @Test
    public void cleanDirtyEnclosure()
    {
	    Personell per = new Personell();
	    Enclosure lemurHouse = new Enclosure();
	    lemurHouse.dirty = true;
	    boolean needsCleaning = per.clean(lemurHouse);
	    assertTrue(needsCleaning);
    }

    @Test
    public void cleanCleanEnclosure()
    {
	    Personell per = new Personell();
	    Enclosure lemurHouse = new Enclosure();
	    lemurHouse.dirty = false;
	    boolean needsCleaning = per.clean(lemurHouse);
	    assertFalse(needsCleaning);
    }
    
    @Test
    public void acceptPayment()
    {
	    Personell per = new Personell();
	    int oldBalance = per.getBalance();
	    int salary = per.getSalary();
	    per.acceptPayment();
	    int newBalance = per.getBalance();
	    assertEquals(newBalance, oldBalance + salary);
    }
    

}
