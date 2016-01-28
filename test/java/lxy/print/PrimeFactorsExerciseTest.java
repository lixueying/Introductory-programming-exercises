package lxy.print;

import main.java.lxy.print.PrimeFactorsExercise;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by lixueying on 16/1/28.
 */
public class PrimeFactorsExerciseTest {
    private PrimeFactorsExercise primeFactorsExercise;
    private ArrayList<Integer> primeNum;

    @Before
    public void setUp() throws Exception {
        primeFactorsExercise = new PrimeFactorsExercise();
        primeNum = new ArrayList<Integer>();
    }
    @Test
    public void should_return_prime_list(){
        primeNum = primeFactorsExercise.primeFactorsExercise(30);
        System.out.println(primeNum);
    }
}
