package tests;

import com.example.junit.MyClass;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: jjensen
 * Date: 10/14/13
 * Time: 8:59 AM
 */
public class MyClassTest {
    private MyClass myClass;

    @Before
    public void setUp() throws Exception {
        myClass = new MyClass();
    }

    @Test
    public void testSayHello() throws Exception {
        assertEquals("Hello", myClass.sayHello());

    }

    @Test
    public void testSayGoodbye() throws Exception {
        assertEquals("Goodbye!", myClass.sayGoodbye());
    }
}
