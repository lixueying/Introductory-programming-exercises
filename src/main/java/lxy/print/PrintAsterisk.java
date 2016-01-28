package main.java.lxy.print;

/**
 * Created by lixueying on 16/1/28.
 */
public class PrintAsterisk {
    public void printOneAsterisk(){
        System.out.println("*");
    }

    public void printNAsterisk(int number){

        for(int i = 0;i < number;i++){
            System.out.print("*");
        }
    }

    public void printNAsteriskWithWrap(int number){
        for(int i = 0; i < number; i++){
            printOneAsterisk();
        }
    }

    public void printAsteriskRightTriangle(int number){
        for(int i =0; i < number; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printIsoscelesTriangle(int number){
        topHalfDiamond(number);
        printNAsterisk(2 * number - 1);
    }

    public void printDiamond(int number) {
        topHalfDiamond(number);
        HalfDiamond(number);
    }

    public void printDiamondWithName(int number){
        topHalfDiamond(number);
        System.out.println("Shawn");
        HalfDiamond(number);
    }

    public void topHalfDiamond(int number){
        for(int i = 0; i < number - 1; i++)
        {
            for(int x = i + 1; x < number; x++)
            {
                System.out.print(" ");
            }
            for(int y = 0; y < (i + 1) * 2 - 1; y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void HalfDiamond(int number){
        for(int i = 0; i < number; i++)
        {
            for(int x = 0; x < i; x++)
            {
                System.out.print(" ");
            }
            for(int y = i; y < 2 * number - i - 1; y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
