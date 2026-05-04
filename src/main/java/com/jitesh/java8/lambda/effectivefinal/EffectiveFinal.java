package com.jitesh.java8.lambda.effectivefinal;

import java.util.Arrays;
import java.util.List;

public class EffectiveFinal {

    public static void main(String[] args) {
        // Local Variable
        int x = 10;

        x = 20; // ❌ modified -  NOT effectively final

        Runnable r = () -> {
//            System.out.println(x); // ❌ compile-time error
        };

        // Loop
        for (int i = 0; i < 5; i++) {
//            Runnable run = () -> System.out.println(i); // ❌ error

            int temp = i; // effectively final
            Runnable runnable = () -> System.out.println(temp); // ✔ Allowed
        }

        // Anonymous Class
        int a = 10;
        a = 20;

        new Thread(new Runnable() {
            public void run() {
//                System.out.println(a); //  ❌ compile-time error, must be effectively final
            }

        }).start();

        // Lambda + Stream Example
        int multiplier = 2;

        List<Integer> list = Arrays.asList(1, 2, 3);

        list.forEach(n -> {
            System.out.println(n * multiplier); // ✔ multiplier effectively final
        });
    }
}
