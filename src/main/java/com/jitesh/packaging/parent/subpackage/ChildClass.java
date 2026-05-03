package com.jitesh.packaging.parent.subpackage;

import com.jitesh.packaging.parent.ParentClass;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        ParentClass parentClass = new ParentClass();

        String childStr = childClass.protectedMethod();
//        String parentStr = parentClass.protectedMethod(); // Not Allowed

        System.out.println(childStr);
    }
}
