package ru.geekbrains.lesson2;


import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        int[] array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        SortUtils.directSort(array);
        ArrayUtils.printArray(array);

        System.out.println();

        array = ArrayUtils.prepareArray();
        ArrayUtils.printArray(array);
        SortUtils.quickSort(array);
        ArrayUtils.printArray(array);

        /*array = ArrayUtils.prepareArray(300000);

        int[] array1 = array.clone();
        long startTime = System.currentTimeMillis();
        SortUtils.directSort(array1);
        long endTime = System.currentTimeMillis();
        System.out.printf("Время работы сортировки выбором: %d мс.\n", endTime - startTime);


        int[] array2 = array.clone();
        startTime = System.currentTimeMillis();
        SortUtils.quickSort(array2);
        endTime = System.currentTimeMillis();
        System.out.printf("Время работы быстрой сортировки: %d мс.\n", endTime - startTime);


        int[] array3 = array.clone();
        startTime = System.currentTimeMillis();
        Arrays.sort(array3);
        endTime = System.currentTimeMillis();
        System.out.printf("Время работы системной сортировки: %d мс.\n", endTime - startTime);
        */

        System.out.println();
        array = new int[] {-5, 5, 10, -8, -10, 6, 9, -5, 4, 22, - 20};
        ArrayUtils.printArray(array);
        SortUtils.quickSort(array);
        ArrayUtils.printArray(array);
        int searchElement = 9;
        int searchResult = SearchUtils.binarySearch(array, searchElement);
        System.out.printf("Значение %d %s", searchElement,
                searchResult >= 0 ? String.format("найдено в массиве по индексу %d", searchResult) :
                "не найдено в массиве");

        System.out.println();

        int searchResult2 = Arrays.binarySearch(array, searchElement);
        System.out.printf("Значение %d %s", searchElement,
                searchResult2 >= 0 ? String.format("найдено в массиве по индексу %d", searchResult2) :
                        "не найдено в массиве");



    }

}
