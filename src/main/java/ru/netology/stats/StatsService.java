package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageMonthlySales(int[] sales) {
        int sum = 0;
        int averageAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            averageAmount = sum / sales.length;
        }
        return averageAmount;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int totalMonthsSalesBelowAverage(int[] sales) {
        int monthBelowAverage = 0;
        int averageAmount = averageMonthlySales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                monthBelowAverage += 1;
            }
        }

        return monthBelowAverage;
    }

    public int totalMonthsSalesUpAverage(int[] sales) {
        int monthUpAverage = 0;
        int averageAmount = averageMonthlySales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                monthUpAverage += 1;
            }
        }

        return monthUpAverage;
    }
}
