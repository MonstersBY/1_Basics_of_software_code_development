package by.learn.cycle;

import java.util.Scanner;

public class SixCycle {
    public static void main(String[] args){
        System.out.println("Correspondences between symbols and their numerical designations");
        Scanner in = new Scanner(System.in);
            for(int i=32; i<=126;i++){
                System.out.println(i+" - "+(char) i);
            }
    }
}
