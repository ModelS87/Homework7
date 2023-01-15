public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int deposit = 15_000;
        int total = 0;
        int i = 0;
        for (; total <= 2_459_000; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна "+ total);
        }
        int b = 0;
        while ( b < 10 ) {
            b=b+1;
            System.out.print(b + " ");
        }
        System.out.println();
        for ( int c = 10; c > 0 ; c = c - 1) {
            System.out.print(c + " ");
        }
    }
}