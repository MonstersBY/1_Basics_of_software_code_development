package by.learn.cycle;

import java.util.Scanner;

public class EightCycle {
    public static void main(String[] args){
        System.out.println("Determine the digits included in the record of both the first and second numbers.");
        Scanner in = new Scanner(System.in);
        System.out.print("first number: ");
        int a= in.nextInt();
        System.out.print(a+"- ");
        for (int i=0; a>0;i++){
            System.out.print(a%10+ " ");
            a/=10;
        }
        System.out.println();
        System.out.print("second number: ");
        int b= in.nextInt();
        for (int i=0; b>0;i++){
            System.out.print(b%10+ " ");
            b/=10;
        }
    }
}
