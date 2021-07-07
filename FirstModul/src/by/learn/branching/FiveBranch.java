package by.learn.branching;

import java.util.Scanner;

public class FiveBranch {
    public static void main(String[] args){
        System.out.println("find function");
        Scanner in = new Scanner(System.in);
        System.out.print("input angle x: ");
        double x= in.nextInt();
        if (x<=3){
            System.out.println((x*x)-(3*x)+9);
        }else System.out.println(1/((x*x*x)+6));

    }
}
