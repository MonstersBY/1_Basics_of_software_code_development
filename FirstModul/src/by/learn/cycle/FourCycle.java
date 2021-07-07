package by.learn.cycle;

import java.math.BigInteger;

public class FourCycle {
    public static void main(String[] args){
        System.out.print("Products of the squares of the first two hundred numbers");
        BigInteger sum= BigInteger.valueOf(1);
        for(int i=1; i<=200;i++){
            sum =sum.multiply(BigInteger.valueOf(i * i));
        }
        System.out.println("sum of numbers: "+ sum);
    }
}
