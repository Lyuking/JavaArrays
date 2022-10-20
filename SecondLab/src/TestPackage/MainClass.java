package TestPackage;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
    int[][] array = WorkWithArray.GetFilledArray(10000);
        GetBubbleInfo(array.clone() );
        GetInsertInfo(array.clone());
        GetSelectionInfo(array.clone());
        GetMergeInfo(array.clone());
        GetQuickInfo(array.clone());
        GetDefaultInfo(array.clone());

        int[] questArray1 = new int[]{14,16,15,10,5,12,14,16,18,20,2,3,20,3,11,15,16,11,15};
        StringBuilder s1 = new StringBuilder();
        for(int i = 0; i < questArray1.length; i++)
            s1.append(questArray1[i] + " ");
        System.out.println("Исходный массив: " + s1);

        int[] solutionArray1 = WorkWithArray.RemoveDuplicates(questArray1);
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < solutionArray1.length; i++)
            s2.append(solutionArray1[i] + " ");
        System.out.println("Конечный массив: " + s2);
    }
    static void GetBubbleInfo(int array[][])
    {
        long startTime, estimatedTime;
        System.out.println();

        startTime = System.nanoTime();
        WorkWithArray.BubbleSort(array[0]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы пузырька 0: " + estimatedTime );

        startTime = System.nanoTime();
        WorkWithArray.BubbleSort(array[1]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы пузырька 1: " + estimatedTime );

        startTime = System.nanoTime();
        WorkWithArray.BubbleSort(array[2]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы пузырька 2: " + estimatedTime );
    }
    static void GetInsertInfo(int array[][])
    {
        long startTime, estimatedTime;
        System.out.println();

        startTime = System.nanoTime();
        WorkWithArray.InsertionSort(array[0]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы вставками 0: " + estimatedTime );

        startTime = System.nanoTime();
        WorkWithArray.InsertionSort(array[1]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы вставками 1: " + estimatedTime );

        startTime = System.nanoTime();
        WorkWithArray.InsertionSort(array[2]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы вставками 2: " + estimatedTime );
    }
    static void GetSelectionInfo(int array[][])
    {
        long startTime, estimatedTime;
        System.out.println();

        startTime = System.nanoTime();
        WorkWithArray.SelectionSort(array[0]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы выборки 0: " + estimatedTime );

        startTime = System.nanoTime();
        WorkWithArray.SelectionSort(array[1]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы выборки 1: " + estimatedTime );

        startTime = System.nanoTime();
        WorkWithArray.SelectionSort(array[2]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы выборки 2: " + estimatedTime );
    }
    static void GetMergeInfo(int array[][])
    {
        long startTime, estimatedTime;
        System.out.println();

        startTime = System.nanoTime();
        WorkWithArray.MergeSort(array[0], 0,array[0].length-1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы слияния 0: " + estimatedTime );

        startTime = System.nanoTime();
        WorkWithArray.MergeSort(array[1], 0,array[1].length-1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы слияния 1: " + estimatedTime );

        startTime = System.nanoTime();
        WorkWithArray.MergeSort(array[2], 0,array[2].length-1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы слияния 2: " + estimatedTime );
    }
    static void GetQuickInfo(int array[][])
    {
        long startTime, estimatedTime;
        System.out.println();

        startTime = System.nanoTime();
        WorkWithArray.QuickSort(array[0], 0,array[0].length-1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы быстрой 0: " + estimatedTime );

        startTime = System.nanoTime();
        WorkWithArray.QuickSort(array[1], 0,array[1].length-1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы быстрой 1: " + estimatedTime );

        startTime = System.nanoTime();
        WorkWithArray.QuickSort(array[2], 0,array[2].length-1);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы быстрой 2: " + estimatedTime );
    }
    static void GetDefaultInfo(int array[][])
    {
        long startTime, estimatedTime;
        System.out.println();

        startTime = System.nanoTime();
        Arrays.sort(array[0]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы по умолчанию 0: " + estimatedTime );

        startTime = System.nanoTime();
        Arrays.sort(array[1]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы по умолчанию 1: " + estimatedTime );

        startTime = System.nanoTime();
        Arrays.sort(array[2]);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время работы по умолчанию 2: " + estimatedTime );
    }
}
