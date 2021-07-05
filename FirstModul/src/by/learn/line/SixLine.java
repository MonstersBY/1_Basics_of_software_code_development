package by.learn.line;

import java.util.Scanner;

public class SixLine {
    public static void main(String[] args){
        System.out.println("write coordinate x y");
        Scanner in = new Scanner(System.in);
        System.out.print("input number x: ");
        double x= in.nextDouble();
        System.out.print("input number y: ");
        double y= in.nextDouble();
        boolean result;
        if (y>=0 && y<=4){
            if(x>=-2 && x<=2){
                result=true;
            }else result=false;
        }else if(y>=-3 && y<=0){
            if(x>=-4 && x<=4){
                result=true;
            }else result=false;
        } else result=false;
        System.out.println(result);
    }
}
