package lxy.print;

import main.java.lxy.print.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lixueying on 16/1/28.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;
    private String str;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_Fizz(){
        str = fizzBuzz.fizzBuzz(3);
        assertThat(str, is("Fizz"));
    }

    @Test
    public void should_return_Buzz(){
        str = fizzBuzz.fizzBuzz(5);
        assertThat(str, is("Buzz"));
    }

    @Test
    public void should_return_FizzBuzz(){
        str = fizzBuzz.fizzBuzz(15);
        assertThat(str, is("FizzBuzz"));
    }

    @Test
    public void should_return(){
        fizzBuzz.output();
    }
}
