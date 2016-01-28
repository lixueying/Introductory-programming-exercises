package main.java.lxy.print;

/**
 * Created by lixueying on 16/1/28.
 */
public class FizzBuzz {
    private boolean flag = true;
    private String str;

    public void output(){
        for(int i = 1; i <= 100; i++){
            str = fizzBuzz(i);
            if(flag){
                System.out.println(i);
            }else{
                System.out.println(str);
                flag = true;
            }
        }
    }

    public String fizzBuzz(int i){
        if(i % 3 == 0 && i % 5 == 0)
        {
            flag = false;
            str = "FizzBuzz";
        }
        else if(i % 5 == 0)
        {
            flag = false;
            str = "Buzz";
        }
        else if(i % 3 == 0)
        {
            flag = false;
            str = "Fizz";
        }
        return str;
    }

}
