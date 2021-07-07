package by.learn.cycle;

public class ThirdCycle {
    public static void main(String[] args){
        System.out.print("Sum of the squares of the first hundred numbers");
        int sum=0;
        for(int i=1; i<=100;i++){
            sum +=i*i;
        }
        System.out.println("sum of numbers: "+ sum);
    }
}
