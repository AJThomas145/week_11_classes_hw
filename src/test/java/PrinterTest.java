import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp() { printer = new Printer(500, 5000);}

    @Test
    public void numberOfPages(){
        assertEquals(500, printer.numberOfPages);
    }

    @Test
    public void printCopiesHasPaper(){
        printer.print(50);
        assertEquals(450, printer.numberOfPages);
        assertEquals(4950, printer.tonerVolume);
    }

    @Test
    public void printCopiesNotEnoughPaper(){
        printer.print(600);
        assertEquals(500, printer.numberOfPages);
        assertEquals(5000, printer.tonerVolume);
    }




}
