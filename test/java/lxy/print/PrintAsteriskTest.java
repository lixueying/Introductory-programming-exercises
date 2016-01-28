package lxy.print;

import main.java.lxy.print.PrintAsterisk;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lixueying on 16/1/28.
 */
public class PrintAsteriskTest {
    private PrintAsterisk printAsterisk;
    private int num = 3;

    @Before
    public void setUp() throws Exception {
        printAsterisk = new PrintAsterisk();
    }

    @Test
    public void should_print_one_asterisk(){
        printAsterisk.printOneAsterisk();
    }


    @Test
    public void should_print_N_asterisk(){
        printAsterisk.printNAsterisk(num);
    }

    @Test
    public void should_print_N_asterisk_With_Wrap(){
        printAsterisk.printNAsteriskWithWrap(num);
    }

    @Test
    public void should_print_Right_Triangle(){
        printAsterisk.printAsteriskRightTriangle(num);
    }

    @Test
    public void should_print_Isosceles_Triangle(){
        printAsterisk.printIsoscelesTriangle(num);
    }

    @Test
    public void should_print_Diamond(){
        printAsterisk.printDiamond(num);
    }

    @Test
    public void should_print_Diamond_With_Name(){
        printAsterisk.printDiamondWithName(num);
    }
}
