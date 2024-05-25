package com.example.programengineeringautotests;

import com.example.programengineeringautotests.exceptions.ArrayNotSortedException;
import com.example.programengineeringautotests.models.Algorithm;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProgramEngineeringAutoTestsApplicationTests {

    @SneakyThrows
    @Test
    @DisplayName("Алгоритм бинарного поиска находит элемент")
    void binarySearchFoundElement() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Assertions.assertEquals(2, Algorithm.binarySearch(numbers, 3));
    }

    @SneakyThrows
    @Test
    @DisplayName("Алгоритм бинарного поиска не находит элемент")
    void binarySearchNotFoundElement() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Assertions.assertEquals(-1, Algorithm.binarySearch(numbers, 30));
    }

    @Test
    @DisplayName("Алгоритм бинарного поиска выявляет отсортированность списка")
    @SneakyThrows
    void binarySearchDetectedSorteredArray() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Assertions.assertDoesNotThrow(() -> {
            Algorithm.binarySearch(numbers, 3);
        });
    }

    @Test
    @DisplayName("Алгоритм бинарного поиска выявляет неотсортированность списка")
    @SneakyThrows
    void binarySearchDetectedUnsorteredArray() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        Assertions.assertThrows(ArrayNotSortedException.class, () -> {
            Algorithm.binarySearch(numbers, 3);
        });
    }
}
