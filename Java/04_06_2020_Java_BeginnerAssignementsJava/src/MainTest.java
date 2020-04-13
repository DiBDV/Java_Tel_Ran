import org.junit.Test;


public class MainTest {

//    testing !weekday or vacation means we're sleeping, so it's true
    @Test
    public void testMainSleepIn1{
        Main c = new Main();
        boolean b = c.sleepIn(!weekday, !vacation);
        assertTrue(b);
    }

    @Test
    public void testMainSleepIn2{
        Main c = new Main();
        boolean b = c.sleepIn(weekday, !vacation);
        assertFalse();
    }

    @Test
    public void testMainSleepIn3{
        Main c = new Main();
        boolean b = c.sleepIn(!weekday, vacation);
        assertTrue();
    }

// testing absolute difference between 21 - n
    @Test
    public void testMainDiff21{
        diff21(19)
        assertEquals(2);

    }

    @Test
    public void testMainDiff21{
        diff21(10);
        assertEquals(11);

    }
    @Test
    public void testMainDiff21{
        diff21(21);
        assertEquals(0);

    }
    @Test
    public void testMainDiff21{
        diff21(25)
        assertEquals(8);

    }


    @Test
    public void testMainIntMax {
        return null;
    }
}
