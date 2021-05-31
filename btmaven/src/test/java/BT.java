import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class BT {
    @Test
    @DisplayName("Test 1 ")
    public void test1() {
        test ts= new test();
        assertEquals(ts.tong(2,3),5);
        assertNotEquals(ts.tong(12,15),23);

    }
    @Test
    @DisplayName("Test 2 ")
    public void test2()
    {
        assertArrayEquals(new int[]{0,2,3}, new int[]{0,2,3});

    }
    @Test
    @DisplayName("Test 3 ")
    public void test3()
    {
        String str = null;
        String str2= "bai tap ve nha";
        assertNull(str,"kiem tra");
        assertNotNull(str2,"kiem tra");
    }
    @Test
    @DisplayName("Test 4 ")
    public void test4()
    {
        test ts= new test();
        assertTrue(ts.tong(2,3)>4);
        assertFalse(ts.tong(12,3)<4);
        assertSame(ts.tong(2,3),5);
        assertNotSame(ts.tong(4,7),9);
    }



}
