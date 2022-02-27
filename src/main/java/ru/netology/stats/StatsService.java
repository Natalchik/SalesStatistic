package ru.netology.stats;

public class StatsService {
    //1.Сумма продаж:
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;

    }

    //2.Средняя сумма продаж:
    public int calculateAverage(int[] sales) {

        return calculateSum(sales) / sales.length;
    }

    //3.Номер месяца, в котором был пик продаж

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }
    //4. Номер месяца, в котором был min продаж

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //5.Количество месяцев, продажи в которых ниже среднего:
    public int calculateMonthsNumberUnderAverageSales(int[] sales) {
        int number = 0;
        int Average = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < Average) {
                number++;
            }

        }
        return number;
    }

    //5.Количество месяцев, продажи в которых ниже среднего:
    public int calculateMonthsNumberOverAverageSales(int[] sales) {
        int number = 0;
        int Average = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > Average) {
                number++;
            }

        }
        return number;
    }
}

