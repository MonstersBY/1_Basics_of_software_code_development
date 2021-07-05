package by.learn.line;

import java.util.Scanner;

public class FirstLine {
    public static void main(String[] args){
        System.out.println("find function z=((a-3)*b/2)+c");
        Scanner in = new Scanner(System.in);
        System.out.print("input number a: ");
        int a= in.nextInt();
        System.out.print("input number b: ");
        int b= in.nextInt();
        System.out.print("input number c: ");
        int c= in.nextInt();
        System.out.println(((a-3)*b/2)+c);
    }
}
