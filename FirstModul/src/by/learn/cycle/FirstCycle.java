package by.learn.cycle;

import java.util.Scanner;

public class FirstCycle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("write any number");
        int a= in.nextInt();
        int sum=0;
        if (a>=0){
            for(int i=1; i<=a;i++){
                sum=sum+i;
            }
            System.out.println("sum of numbers: "+ sum);
        }else System.out.println("a negative number");

    }
}
