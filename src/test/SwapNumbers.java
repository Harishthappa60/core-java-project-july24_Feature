package test;

public class SwapNumbers {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a and b after swap a: "+a+" ,b: "+b);
    }
}
