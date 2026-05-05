package com.jitesh.java8.lambda.sideeffect;

import java.util.Arrays;
import java.util.List;

public class SideEffect {

    // Pure Function
    int pure(int a, int b) {
        return a + b;
    }

    // Impure Function
    int total = 0;

    void add(int x) {
        total += x; // side effect
    }

    // Side Effect
    int x = 10;    // Instance Variable

    void change() {

        Runnable runnable = () -> {
            x = 20; // Allowed but may cause side effect in multithreaded environment, so should avoid it
        };
    }

    // Race Condition
    int count = 0;

    void race() {
        List<Integer> list = Arrays.asList(1, 2, 3);

        list.parallelStream().forEach(n -> count++); // ❌ race condition
    }

    //   I/O Operations
    void print() {
        System.out.println("Hello"); // side effect
    }


}
