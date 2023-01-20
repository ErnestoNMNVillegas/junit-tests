import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {
    private Car miata;
    private Car ptCruiser;
    private Car jalopy;

    @Before
    public void setup(){
        this.miata = new Car("Mazda", "Miata", (short) 1999, (byte) 4, "petrol");
        this.ptCruiser = new Car("ptCruiser", "Miata", (short) 1999, (byte) 4, "petrol");
        this.jalopy = new Car();
    }

    @Test
    public void jalopyIsEmpty(){
        assertNull(jalopy.getMake());
        assertNull(jalopy.getModel());
        assertNull(jalopy.getPowerSource());
        assertEquals(jalopy.getYear(), 0);
        assertEquals(jalopy.getCylinders(), 0);
    }

}
