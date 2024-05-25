package com.example.programengineeringautotests.models;

import com.example.programengineeringautotests.exceptions.ArrayNotSortedException;

public class Algorithm {

    private static <T extends Comparable> void check_if_array_is_sorted(T[] array) throws ArrayNotSortedException {
        for (int i = 1; i < array.length; i += 1) {
            if (array[i].compareTo(array[i-1]) == -1) {
                throw new ArrayNotSortedException();
            }
        }
    }

    public static <T extends Comparable> int binarySearch(T[] array, T elem) throws ArrayNotSortedException {
        check_if_array_is_sorted(array);
        int l = 0; int r = array.length-1;
        while (l < r) {
            int midindex = (r + l) / 2;
            T midelem = array[midindex];
            if (midelem.compareTo(elem) == 1) {
                l = midindex+1;
            } else if (midelem.compareTo(elem) == -1) {
                r = midindex-1;
            } else {
                return midindex;
            }
        }

        return -1;
    }
}
