package com.example.programengineeringautotests.exceptions;

public class ArrayNotSortedException extends Exception {
    @Override
    public String toString() {
        return "Массив не отсортирован";
    }
}
