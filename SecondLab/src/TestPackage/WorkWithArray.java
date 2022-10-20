package TestPackage;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Random;

public class WorkWithArray {
    static protected int[][] GetFilledArray(int size) {
        int [][] array = new int[3][size]; //создание двумерного массива для хранения 3-х массивов
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            array[0][i] = r.nextInt(Integer.MAX_VALUE);
        }

        array[2] = array[0].clone();
        Arrays.sort(array[2]); // отсортированный массив

        array[1] = array[2].clone();
        for (int i = 0; i < size/10; i++) {
            array[1][i] = array[0][i];
        }
        return array;
    }
    protected static void BubbleSort(int[] array)
    {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
    protected static void InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }
    protected static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // замена
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
    protected static void MergeSort(int[] array,  int left, int right)
    {
        if (right <= left) return;
        int mid = (left+right)/2;
        MergeSort(array, left, mid);
        MergeSort(array, mid+1, right);
        Merge(array, left, mid, right);
    }
    private static void Merge(int[] array,  int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;
        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];
        // копируем отсортированные массивы во временные
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];
        // итераторы содержат текущий индекс временного подмассива
        int leftIndex = 0;
        int rightIndex = 0;
        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
             else if (leftIndex < lengthLeft) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                        }
                        // если все элементы были скопированы из leftArray, то скопировать остальные из rightArray
             else if (rightIndex < lengthRight) {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
            }
        }

    }
    protected static void QuickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = Partition(array, begin, end);
        QuickSort(array, begin, pivot-1);
        QuickSort(array, pivot+1, end);
    }
    private static int Partition(int[] array, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;
        return counter;
    }
    protected static int[] RemoveDuplicates(int[] array)
    {
        int counter = 0;
        for (int i = 0; i < array.length-1 - counter; i++)
        {

            for (int j = i+1; j < array.length-counter; j++)
            {
                if(array[i]==array[j])
                {
                    for (int k = j; k < array.length-1; k++)
                    {
                        array[k] = array[k+1];
                    }
                    counter++;
                }
            }
        }
        int arrayWithoutCopies[] = new int[array.length-counter];
        for (int i = 0; i < array.length-counter; i++)
            arrayWithoutCopies[i] = array[i];
        return arrayWithoutCopies;
    }
    protected static int GetDuplicatesCount(int[] array)
    {
        int counter = 0;
        for (int i = 0; i < array.length-1 - counter; i++)
        {

            for (int j = i+1; j < array.length-counter; j++)
            {
                if(array[i]==array[j])
                {
                    for (int k = j; k < array.length-1; k++)
                    {
                        array[k] = array[k+1];
                    }
                    counter++;
                }
            }
        }
        return counter;
    }
}
