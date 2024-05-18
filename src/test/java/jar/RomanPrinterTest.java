////////////////////////////////////////////////////////////////////
// Arianna Piva 2076427
// Nicholas Salmaso 2080038
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class RomanPrinterTest {
    @Test
    public void test_ascii_I(){
    String s=RomanPrinter.print(1);
        assertEquals("  _____ " + "\n" 
                   + " |_   _|" + "\n" 
                   + "   | |  " + "\n" 
                   + "   | |  " + "\n" 
                   + "  _| |_ " + "\n" 
                   + " |_____|",s);
        
    }

    @Test
    public void test_ascii_V(){
    String s=RomanPrinter.print(5);
        assertEquals(" __      __" + "\n" + 
                     " \\ \\    / /" + "\n" + 
                     "  \\ \\  / / " + "\n" + 
                     "   \\ \\/ /  " + "\n" + 
                     "    \\  /   " + "\n" + 
                     "     \\/    ",s);
        
    }

    @Test
    public void test_ascii_X(){
    String s=RomanPrinter.print(10);
        assertEquals(" __   __" + "\n" + 
                     " \\ \\ / /" + "\n" + 
                     "  \\ V / " + "\n" + 
                     "   > <  " + "\n" + 
                     "  / . \\ " + "\n" + 
                     " /_/ \\_\\",s);
        
    }

    @Test
    public void test_ascii_L(){
    String s=RomanPrinter.print(50);
        assertEquals("  _      " + "\n" + 
                     " | |     " + "\n" + 
                     " | |     " + "\n" + 
                     " | |     " + "\n" + 
                     " | |____ " + "\n" + 
                     " |______|",s);
        
    }

    @Test
    public void test_ascii_C(){
    String s=RomanPrinter.print(100);
        assertEquals("   _____ " + "\n" + 
                     "  / ____|" + "\n" + 
                     " | |     " + "\n" + 
                     " | |     " + "\n" + 
                     " | |____ " + "\n" + 
                     "  \\_____|",s);
        
    }

    @Test
    public void test_ascii_D(){
    String s=RomanPrinter.print(500);
        assertEquals("  _____  " + "\n" + 
                     " |  __ \\ " + "\n" + 
                     " | |  | |" + "\n" + 
                     " | |  | |" + "\n" + 
                     " | |__| |" + "\n" + 
                     " |_____/ ",s);
        
    }

    @Test
    public void test_ascii_M(){
    String s=RomanPrinter.print(1000);
        assertEquals("  __  __ " + "\n" + 
                     " |  \\/  |" + "\n" + 
                     " | \\  / |" + "\n" + 
                     " | |\\/| |" + "\n" + 
                     " | |  | |" + "\n" + 
                     " |_|  |_|",s);
        
    }

    
}
