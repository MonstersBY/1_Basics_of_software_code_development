package by.learn.cycle;

import java.util.Scanner;

public class FiveCycle {
    public static void main(String[] args){
        System.out.println("find sum");
        Scanner in = new Scanner(System.in);
        System.out.print("write e: ");
        double e= in.nextDouble();
        double an,sum=0;
        System.out.print("write n: ");
        int n= in.nextInt();
        for(int i=0; i<=n;i++){
            an= 1/(Math.pow(2,i))+1/(Math.pow(3,i));
            if(Math.abs(an)>=e) sum+=an;
        }
        System.out.println("sum of numbers: "+ sum);
    }
}
