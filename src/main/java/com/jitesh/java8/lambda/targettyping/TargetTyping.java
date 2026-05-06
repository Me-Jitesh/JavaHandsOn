package com.jitesh.java8.lambda.targettyping;

interface A {
    void m1();
}

interface B {
    void m1();
}

class Test {

    void fun(A a) {
    }

    void fun(B b) {
    }
}

public class TargetTyping {
    public static void main(String[] args) {
// Compilation Error Ambiguous Type
        Test test = new Test();
//        test.fun(() -> {
//            System.out.println("Hello!");
//        });

        // Resolve :: Using Target Typing

        A targetType = () -> {
            System.out.println("Hello!");
        };

        test.fun(targetType);

        // Resolve :: Explicit Cast
        test.fun(
                (B) () -> {
                    System.out.println("Hello!");
                }
        );
    }


}
