package ru.netology.statistic;

public class StatisticsService {

    public long findMax(long[] incomes) { //12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12
        long currentMax = incomes[0]; // в переменную currentMax скопировать значение 0 ячейки массива
        for (long income : incomes) { //для каждого income(элемента массива) из массива incomes
            if (currentMax < income) {//если элемент массива меньше income
                currentMax = income;//блпблп
            }
        }
        return currentMax;
    }
}
