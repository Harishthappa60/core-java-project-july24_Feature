package methods;

public class EvenOdd {
    public void evenOdd() {
        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                System.out.println("Even: "+i);
            }
            else {
                System.out.println("Odd: "+i);

            }
        }
    }

    public static void main(String[] args) {
        EvenOdd ed=new EvenOdd();
        ed.evenOdd();
    }
}