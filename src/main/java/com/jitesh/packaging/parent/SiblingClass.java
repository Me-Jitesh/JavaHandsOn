package com.jitesh.packaging.parent;

import com.jitesh.packaging.outer.OuterSubClass;
import com.jitesh.packaging.parent.subpackage.ChildClass;

public class SiblingClass {

    public static void main(String[] args) {

        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();
        OuterSubClass outerSubClass = new OuterSubClass();

        String parentStr = parentClass.protectedMethod();
        String childStr = childClass.protectedMethod();
        String outerStr = outerSubClass.protectedMethod();

        System.out.println(parentStr);
        System.out.println(childStr);
        System.out.println(outerStr);
    }

}
