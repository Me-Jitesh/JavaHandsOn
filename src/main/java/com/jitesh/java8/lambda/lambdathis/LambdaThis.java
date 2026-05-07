package com.jitesh.java8.lambda.lambdathis;

public class LambdaThis {

    private String name = "Outer Class";

    interface Printer {
        void print();
    }

    public void usingLambda() {

        Printer p = () -> {
            System.out.println("Lambda this: " + this);
            System.out.println("Lambda name: " + this.name);
        };

        p.print();
    }

    public void usingAnonymousClass() {

        Printer p = new Printer() {

            private String name = "Anonymous Class";

            @Override
            public void print() {
                System.out.println("Anonymous this: " + this);
                System.out.println("Anonymous name: " + this.name);
            }
        };

        p.print();
    }

    @Override
    public String toString() {
        return "Lambda This Object";
    }

    public static void main(String[] args) {

        LambdaThis demo = new LambdaThis();

        System.out.println("=== Lambda ===");
        demo.usingLambda();

        System.out.println();

        System.out.println("=== Anonymous Class ===");
        demo.usingAnonymousClass();
    }
}