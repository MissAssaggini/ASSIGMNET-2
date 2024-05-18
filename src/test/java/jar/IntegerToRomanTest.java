////////////////////////////////////////////////////////////////////
// Arianna Piva 2076427
// Nicholas Salmaso 2080038
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized.Parameter;
public class IntegerToRomanTest {
    @Test(expected=IllegalStateException.class)
    public void test_zero_num(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(0);
        
    }
    @Test(expected=IllegalStateException.class)
    public void test_negative_num(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(-1);
        
    }
    @Test(expected=IllegalStateException.class)
    public void test_out_of_range_num(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(4000);
        
    }

    @Test
    public void test_I(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(1);
        assertEquals("I",s);
        
    }
    @Test
    public void test_IV(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(4);
        assertEquals("IV",s);

    }

@Test
    public void test_V(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(5);
        assertEquals("V",s);

    }

@Test
    public void test_IX(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(9);
        assertEquals("IX",s);

    }

@Test
    public void test_X(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(10);
        assertEquals("X",s);

    }

@Test
    public void test_XL(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(40);
        assertEquals("XL",s);

    }

@Test
    public void test_L(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(50);
        assertEquals("L",s);

    }

@Test
    public void test_XC(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(90);
        assertEquals("XC",s);

    }

@Test
    public void test_C(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(100);
        assertEquals("C",s);

    }
    @Test
    public void test_CD(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(400);
        assertEquals("CD",s);
        
    }
    @Test
    public void test_D(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(500);
        assertEquals("D",s);
        
    }
   
    @Test
    public void test_CM(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(900);
        assertEquals("CM",s);
        
    }
    @Test
    public void test_M(){
        IntegerToRoman integertoroman=new IntegerToRoman();
        String s=integertoroman.convert(1000);
        assertEquals("M",s);
        
    }
   
    
   
}
