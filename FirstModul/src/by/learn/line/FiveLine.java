package by.learn.line;

import java.util.Scanner;

public class FiveLine {
    public static void main(String[] args){
        System.out.println("write T sec change to HH MM SS");
        Scanner in = new Scanner(System.in);
        System.out.print("input number T: ");
        int t= in.nextInt();
        System.out.printf("%d h %d m %d s", t/3600, (t/60)%60,t%60);
    }
}
