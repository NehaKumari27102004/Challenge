package Polymorphism;

public class Overloading {

    Overloading(){
        System.out.println("Default constructor called.");
    }

    Overloading(String pop){
        System.out.println("POP");
    }

    public int add(int a, int b){
        return a+b;
    }

    public String add(String a, String b){
        return a + b;
    }


    public int add(int a,int b, int c, int d){
        return a+b+c+d;
    }


    public static void main(String[] args){
        Overloading overload= new Overloading();
        int sum=overload.add(6,8,9,7);
        overload.add("Neha","Kumari");
        System.out.println(overload.add(5,sum));
    }
}
