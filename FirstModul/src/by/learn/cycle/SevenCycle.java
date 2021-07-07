package by.learn.cycle;

import java.util.Scanner;

public class SevenCycle {
    public static void main(String[] args){
        System.out.println("Output all divisors");
        Scanner in = new Scanner(System.in);
        System.out.print("start segment: ");
        int m= in.nextInt();
        System.out.print("end segment: ");
        int n= in.nextInt();

        for (int i=m; i<=n;i++){
            System.out.print(i+": ");
            for (int j=2;j<i;j++){
                if ((i%j)==0) System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
