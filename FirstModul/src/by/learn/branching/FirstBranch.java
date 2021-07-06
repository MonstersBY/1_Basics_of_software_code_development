package by.learn.branching;

import java.util.Scanner;

public class FirstBranch {
    public static void main(String[] args){
        System.out.println("find triangle");
        Scanner in = new Scanner(System.in);
        System.out.print("input angle a: ");
        int a= in.nextInt();
        System.out.print("input angle b: ");
        int b= in.nextInt();
        if ((a+b)<180 && a !=0 && b!=0){
            int y = 180-a-b;
            if (a==90 || b==90 || y==90){
                System.out.println("This is a right triangle");
            }else System.out.println("This is a triangle");

        }else System.out.println("this is not a triangle");

    }
}
