package by.learn.line;

import java.util.Scanner;

public class ThirdLine {
    public static void main(String[] args){
        System.out.println("evaluate the value of the expression: ((sinx+cosy)/(cosx-siny))*tgxy");
        Scanner in = new Scanner(System.in);
        System.out.print("input number x: ");
        float x = in.nextFloat();
        System.out.print("input number y: ");
        float y = in.nextFloat();

        System.out.println((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));
    }
}
