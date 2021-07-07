package by.learn.branching;

import java.util.Scanner;

public class FourBranch {
    public static void main(String[] args){
        System.out.println("set the size of a rectangular hole ");
        Scanner in = new Scanner(System.in);
        System.out.print("input angle a: ");
        int a= in.nextInt();
        System.out.print("input angle b: ");
        int b= in.nextInt();
        System.out.println("set the size of brick ");
        System.out.print("input angle x: ");
        int x= in.nextInt();
        System.out.print("input angle y: ");
        int y= in.nextInt();
        System.out.print("input angle z: ");
        int z= in.nextInt();
        if ((x<=a && y<=b)||(y<=a && x<=b)||(x<=a && z<=b)||(z<=a && x<=b)||(z<=a && y<=b)||(y<=a && z<=b)){
            System.out.println("will pass");
        }else System.out.println("will not pass");

    }
}
