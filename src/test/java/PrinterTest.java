import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void setUp() { printer = new Printer(500);}

    @Test
    public void numberOfPages(){
        assertEquals(500, printer.numberOfPages);
    }

    @Test
    public void printCopiesHasPaper(){
        printer.printCopies(50);
        assertEquals(450, printer.numberOfPages);
    }

    @Test
    public void printCopiesNotEnoughPaper(){
        printer.printCopies(600);
        assertEquals(500, printer.numberOfPages);
    }




}
