public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int deposit = 15_000;
        int total = 0;
        int i = 0;
        for (; total <= 2_459_000; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        int b = 0;
        while (b < 10) {
            b = b + 1;
            System.out.print(b + " ");
        }
        System.out.println();
        for (int c = 10; c > 0; c = c - 1) {
            System.out.print(c + " ");
        }
        System.out.println();
        int population = 12_000_000;
        int year = 0;
        int populationDead = 8;
        int populationBorn = 17;
        while (year < 10) {
            year++;
            population = population / 1000 * (populationBorn - populationDead) + population;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        int deposit1 = 15_000;
        int month = 0;
        int result = 0;
        for (; result < 12_000_000; month++) {
            result = result + result * 7 / 100 + deposit1;
            System.out.println("Месяц " + month + " - результат накоплений: " + result);

        }
        System.out.println();
        int deposit2 = 15_000;
        int month2 = 0;
        int result2 = 0;
        for (; result2 < 12_000_000; month2 ++) {
            result2 = result2 + result2 * 7 / 100 + deposit2;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " - результат накоплений: " + result2);
            }
        }
        System.out.println( result );
    }
}