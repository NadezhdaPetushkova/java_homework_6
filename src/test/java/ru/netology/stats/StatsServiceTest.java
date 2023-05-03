package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void summaSales() {
        StatsService service = new StatsService();

        int[] sumSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales(sumSales);

        Assertions.assertEquals(expectedSum, actualSum);
        System.out.println("Сумма всех продаж = " + actualSum);

    }

    @Test
    public void averageSalesAmountPerMonth() {
        StatsService service = new StatsService();

        int[] averageMonthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonthlySales = 15;
        int actualMonthlySales = service.averageMonthlySales(averageMonthlySales);

        Assertions.assertEquals(expectedMonthlySales, actualMonthlySales);
        System.out.println("Средняя сумма продаж в месяц = " + actualMonthlySales);

    }

    @Test
    public void monthNumberForMaximumAmount() {
        StatsService service = new StatsService();

        int[] maxSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(maxSales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
        System.out.println("Номер месяца, в котором был пик продаж = " + actualMaxMonth);

    }

    @Test
    public void monthNumberForMinimumAmount() {
        StatsService service = new StatsService();

        int[] minSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(minSales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
        System.out.println("Номер месяца, в котором был минимум продаж = " + actualMinMonth);

    }

    @Test
    public void totalMonthsWhichSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] totalMonthsSalesBelowAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAllMinMonth = 5;
        int actualAllMinMonth = service.totalMonthsSalesBelowAverage(totalMonthsSalesBelowAverage);

        Assertions.assertEquals(expectedAllMinMonth, actualAllMinMonth);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего = " + actualAllMinMonth);

    }

    @Test
    public void totalMonthsWhichSalesUpAverage() {
        StatsService service = new StatsService();

        int[] totalMonthsSalesUpAverage = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAllMaxMonth = 5;
        int actualAllMaxMonth = service.totalMonthsSalesUpAverage(totalMonthsSalesUpAverage);

        Assertions.assertEquals(expectedAllMaxMonth, actualAllMaxMonth);
        System.out.println("Количество месяцев, в которых продажи были выше среднего = " + actualAllMaxMonth);

    }
}