package com.example.programengineeringautotests.models;

import com.example.programengineeringautotests.exceptions.ArrayNotSortedException;

public class Algorithm {

    private static <T extends Comparable> void checkIfArrayIsSorted(T[] array) throws ArrayNotSortedException {
        for (int i = 1; i < array.length; i += 1) {
            if (array[i].compareTo(array[i-1]) == -1) {
                throw new ArrayNotSortedException();
            }
        }
    }

    public static <T extends Comparable> int binarySearch(T[] array, T elem) throws ArrayNotSortedException {
        checkIfArrayIsSorted(array);
        int left = 0; int right = array.length-1;
        while (left < right) {
            int middleIndex = (right + left) / 2;
            T middleElement = array[middleIndex];
            if (middleElement.compareTo(elem) == 1) {
                left = middleIndex+1;
            } else if (middleElement.compareTo(elem) == -1) {
                right = middleIndex-1;
            } else {
                return middleIndex;
            }
        }

        return -1;
    }
}
