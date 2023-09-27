package ru.geekbrains.lesson2;

public class SortUtils {


    /**
     * Сортировка выбором
     *
     * 5 4 1 0 1
     * 0 4 1 5 1
     *
     */
    public static void directSort(int[] array){
        for (int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min]){
                    min = j;
                }
            }

            if (i != min){
                int buf = array[i];
                array[i] = array[min];
                array[min] = buf;
            }

        }
    }

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int start, int end){
        int left = start;
        int right = end;
        int middle = array[(start + end) / 2]; // Значение опорного элемента

        do {
            while (array[left] < middle){
                left++;
            }

            while (array[right] > middle){
                right--;
            }

            if (left <= right){
                if (left < right) {
                    int buf = array[left];
                    array[left] = array[right];
                    array[right] = buf;
                }
                left++;
                right--;
            }
        }
        while (left <= right);

        if (left < end)
            quickSort(array, left, end);

        if (start < right){
            quickSort(array, start, right);
        }

    }

}

    public static void heapSort(int[] array) {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in array[]. n is size of heap
    private static void heapify(int[] array, int n, int i) {
        int largest = i;  // Initialize largest as root
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // If right child is larger than the largest so far
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
