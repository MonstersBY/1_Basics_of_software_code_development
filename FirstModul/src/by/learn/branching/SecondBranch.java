package by.learn.branching;

import java.util.Scanner;

public class SecondBranch {
    public static void main(String[] args){
        System.out.println("find max(min(a,b), min(c,d)}");
        Scanner in = new Scanner(System.in);
        System.out.print("input a: ");
        int a= in.nextInt();
        System.out.print("input b: ");
        int b= in.nextInt();
        int first, second;
        if (a<b) first=a; else first=b;
        System.out.print("input c: ");
        a= in.nextInt();
        System.out.print("input d: ");
        b= in.nextInt();
        if (a<b) second=a; else second=b;
        if (first>second) System.out.print(first); else System.out.print(second);

    }
}
