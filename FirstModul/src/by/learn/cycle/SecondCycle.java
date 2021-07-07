package by.learn.cycle;

import java.util.Scanner;

public class SecondCycle {
    public static void main(String[] args){
        System.out.println("find function on the segment");
        Scanner in = new Scanner(System.in);
        System.out.print("start segment: ");
        int a= in.nextInt();
        System.out.print("end segment: ");
        int b= in.nextInt();
        System.out.print("step: ");
        int h= in.nextInt();
        int fun;
        for(int i=a; i<=b;i+=h){
            if(i>2) fun=i; else fun=-i;
            System.out.println("function = "+ fun);
        }
    }
}
