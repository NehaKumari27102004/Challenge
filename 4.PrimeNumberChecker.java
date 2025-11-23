package Challenge;

import java.util.Scanner;
class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=sc.nextInt();
        CheckNumber(n);
        System.out.println(CheckNumber(n));
    }

    public static boolean CheckNumber(int n){
        if(n==0 || n==1){
            return  false;
        }
        if(n==2){

            return true;
        }

        for(int i=2; i< n/2; i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
}
