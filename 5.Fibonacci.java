package Challenge;

import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the which number want to fibonacci: ");
        int n= sc.nextInt();
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n){
        int a=0, b=1;
        System.out.print(+ a + "," + b);
        for(int i=2; i<n; i++){
            int next=a+b;
            System.out.print("," + next);
            a=b;
            b=next;
        }

    }
}
