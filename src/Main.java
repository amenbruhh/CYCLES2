public class Main {

    public static void printSeparator() {
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // задача 1

        int monthlySavings = 15_000;
        int bankTotal = 0;
        int month = 0;

        while (bankTotal < 2_459_000) {
            month++;
            bankTotal = bankTotal + monthlySavings;
            bankTotal = bankTotal + bankTotal / 100;
            System.out.println("Месяц " + month + " сумма накоплений равна " + bankTotal);
        }
        printSeparator();

        // задача 2

        int string2 = 1;

        while (string2 <= 10) {
            System.out.print(string2 + " ");
            string2++;
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        printSeparator();

        // задача 3

        int populationOfCityY = 12_000_000;
        int year = 0;

        while (year < 10) {
            year++;
            int birthRate = 17 * (populationOfCityY / 1000);
            int mortality = 8 * (populationOfCityY / 1000);
            populationOfCityY = populationOfCityY + birthRate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + populationOfCityY);
        }
        printSeparator();

        // задача 4

        int initialDeposit = 15000;
        int goal = 12000000;
        double monthlyIncrease = 0.07;
        double currentAmount = initialDeposit;
        int months = 0;

        while (currentAmount < goal) {
            months++;
            currentAmount *= (1 + monthlyIncrease);
            System.out.printf("Месяц %d: %.2f рублей\n", months, currentAmount);
        }
        System.out.println("\nВасилию потребуется " + months + " месяцев, чтобы накопить " + goal + " рублей.");
        printSeparator();

        // задача 5

        currentAmount = initialDeposit;
        months = 0;

        while (currentAmount < goal) {
            months++;
            currentAmount *= (1 + monthlyIncrease);

            if (months % 6 == 0) {
                System.out.printf("Месяц %d: %.2f рублей\n", months, currentAmount);
            }
        }
        printSeparator();

        // задача 6

        currentAmount = initialDeposit;
        months = 0;

        for (int year0 = 1; year0 <= 9; year0++) {
            for (int halfYear = 1; halfYear <= 2; halfYear++) {
                months++;
                currentAmount *= (1 + monthlyIncrease / 2);
                System.out.printf("Полугодие %d.%d: %.2f рублей\n", year0, halfYear, currentAmount);
            }
        }
        printSeparator();

        // задача 7

        int firstFriday = 6;

        for (int day = 0; day < 31; day++) {
            int dayOfWeek = (firstFriday + day - 1) % 7;
            if (dayOfWeek == 5) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
        printSeparator();

        // задача 8

        int currentYear = 2024;
        int firstYear = currentYear - 200;
        int nextPeriodEnd = currentYear + 100;

        for (int year1 = firstYear; year1 < nextPeriodEnd; year1++) {
            if (year1 % 79 == 0) {
                System.out.println(year1);
            }
        }
    }
}

