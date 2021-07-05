package by.learn.line;

import java.util.Scanner;

public class FourLine {
    public static void main(String[] args){
        System.out.println("change nnn.ddd to ddd.nnn");
        Scanner in = new Scanner(System.in);
        System.out.print("input number a: ");
        float a= in.nextFloat();
        System.out.println((a * 1000) % 1000 + (int) a / 1000.0);

    }
}
