import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest1Test {

    @Test
    public void test(){
        UnitTest1 test = new UnitTest1();
        int result = test.addNumber(5,2);
        assertEquals(7, result);

    }

    @Test
    public void testString(){
        UnitTest1 test2 = new UnitTest1();
        String result2 = test2.addString("Jordan", "Roberts");
        assertEquals("JordanRoberts", result2);
    }

}
