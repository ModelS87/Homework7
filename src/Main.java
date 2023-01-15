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
            b= b + 1 ;
            System.out.print(b + " ");
        }
        System.out.println();
        for ( int c = 10; c > 0 ; c = c - 1) {
            System.out.print(c + " ");
        }
        System.out.println();
        int population = 12_000_000;
        int year = 0;
        int populationDead = 8;
        int populationBorn = 17;
        while (year < 10) {
            year++;
            population = population / 1000* (populationBorn-populationDead) + population;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }


    }
}