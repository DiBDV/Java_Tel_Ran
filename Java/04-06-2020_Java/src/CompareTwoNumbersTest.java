import org.junit.Test;

import static junit.framework.TestCase.*;

public class CompareTwoNumbersTest {

    @Test
    public void testCompareTwoNumbers1(){
        CompareTwoNumbers c = new CompareTwoNumbers();
        boolean b = c.compareNumbers(10, 5);
        assertTrue(b);
    }

    @Test
    public void testCompareTwoNumbers2(){
        CompareTwoNumbers c = new CompareTwoNumbers();
        boolean b = c.compareNumbers(5, 15);
        assertFalse(b);
    }

    @Test
    public void testCompareTwoNumbers3(){
        CompareTwoNumbers c = new CompareTwoNumbers();
        boolean b = c.compareNumbers(10, 10);
        assertTrue(b);
    }

    @Test
    public void testConcat(){
        CompareTwoNumbers c = new CompareTwoNumbers();
        String concat = c.concat("aaa", "bbb");
        assertEquals("concat", concat.equals("aaabbb"));
        assertEquals("concat", concat.length() == 4);
    }

    @Test
    public void testPersonCreation(){
        String fistNameAndLastName = "piotr;ivanov";
        Person p = Person.createPerson(fistNameAndLastName);

        assertNotNull(p);
        assertEquals("fist name", "piotr", p.getFirstName());
        assertEquals("last name", "ivanov", p.getLastName());



    }
}
