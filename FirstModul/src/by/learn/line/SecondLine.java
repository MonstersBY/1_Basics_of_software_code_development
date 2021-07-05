package by.learn.line;

import java.util.Scanner;

public class SecondLine {
    public static void main(String[] args){
        System.out.println("evaluate the value of the expression: ((b+sqrt((b^2)+4ac))/2a)-(a^3)c+b^(-2)");
        Scanner in = new Scanner(System.in);
        System.out.print("input number a: ");
        float a= in.nextFloat();
        System.out.print("input number b: ");
        float b= in.nextFloat();
        System.out.print("input number c: ");
        float c= in.nextFloat();
        float x = (float) ((b+Math.sqrt((b*b)+4*a*c))/(2*a));
        System.out.println(x-(a*a*a*c)+(1/(b*b)));
    }
}
