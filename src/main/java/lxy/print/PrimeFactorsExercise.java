package main.java.lxy.print;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Created by lixueying on 16/1/28.
 */
public class PrimeFactorsExercise {

    private ArrayList<Integer> primeNum;

    public void input(){
        int number = 0;
        System.out.println("please input a number:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        try{
            number = parseInt(str);
        }catch (NumberFormatException e) {
            System.out.println("Not number");
        }
        primeNum = primeFactorsExercise(number);
        System.out.println(primeNum);
    }

    public ArrayList<Integer> primeFactorsExercise(int number){

        primeNum = new ArrayList<Integer>();

        int k = 2;

        while (k <= number){
            if(number % k != 0){
                k++;
            }else{
                primeNum.add(k);
                number /= k;
                k = 2;
            }
        }
        return primeNum;
    }
}
