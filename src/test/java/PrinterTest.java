import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;


    @Before
    public void before() {
        printer = new Printer();
       // setUp() new Printer(20)
    }

    @Test
    public void printer_has_20_sheets_of_paper() {
        assertEquals(20, printer.paperInPrinter().intValue());
    }

    @Test
    public void check_if_enough_pages_to_print_false() {
        assertEquals(false, printer.enough_paper(5, 10));
    }

    @Test
    public void check_if_enough_pages_to_print_true() {
        assertEquals(true, printer.enough_paper(2, 5));
    }

    @Test
    public void print_out_all_pages_if_enough_paper_when_given_pages_and_copies() {
//        printer.print_out();
//        printer.enough_paper();
        assertEquals(6, printer.print_out(2, 3).intValue());
    }

//    @Test
//    public void can_not_print_all_pages_when_given_pages_and_copies() {
//        assertEquals();
//    }

}
