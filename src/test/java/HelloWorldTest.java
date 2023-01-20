import org.junit.Test;
import static org.junit.Assert.*;


public class HelloWorldTest {
    @Test
    public void testIfHelloWorldWorks(){
        String helloWorld = "Hello World!";
        String testing = "Hello World!";
        assertEquals(helloWorld, testing);
    }

//    @Test
//    public void testIfZeroisNotFour(){
//        assertEquals(0, 4);
//    }
}
