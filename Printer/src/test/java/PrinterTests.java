import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {
    Printer printer;
    @Before
    public void before(){
        printer = new Printer(50, 500);
    }

    @Test
    public void sheetsLeftTest(){
        assertEquals(50, printer.getSheetsLeft());
    }

    @Test
    public void printIfSheetsAvailableTestPass(){
        printer.printPages(4,10);
        assertEquals(10, printer.getSheetsLeft());
    }

    @Test
    public void printIfSheetsAvailableTestFail(){
        printer.printPages(6,10);
        assertEquals(50, printer.getSheetsLeft());
    }

    @Test
    public void tonerReducedTest(){
        printer.printPages(4,10);
        assertEquals(460, printer.getTonerLeft());
    }
    
}
