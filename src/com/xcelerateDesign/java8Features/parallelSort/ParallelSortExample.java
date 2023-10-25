package com.xcelerateDesign.java8Features.parallelSort;

import java.util.Arrays;

/**
 * parallelSort() in the Arrays class of java.util package. This method is introduced to support the parallel sorting of array elements.
 * Algorithm of parallel sorting:
 * 1. The given array is divided into the sub arrays and the sub arrays are further divided into the their sub arrays,
 * this happens until the sub array reaches a minimum granularity.
 * 2. The sub arrays are sorted individually by multiple threads.
 * The parallel sort uses Fork/Join Framework for sorting sub arrays parallel.
 * 3. The sorted sub arrays are merged.
 */
public class ParallelSortExample {

    public static void main(String[] args) {

        int[] numbers = {21, 48, 6, 97, 15, 9};

        // parallel Sort method for sorting int array
        Arrays.parallelSort(numbers);
        Arrays.stream(numbers).forEach(System.out::println);

    }

}
