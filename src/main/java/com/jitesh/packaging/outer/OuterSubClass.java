package com.jitesh.packaging.outer;

import com.jitesh.packaging.parent.ParentClass;
import com.jitesh.packaging.parent.subpackage.ChildClass;

public class OuterSubClass extends ParentClass {

    public static void main(String[] args) {

        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();
        OuterSubClass outerSubClass = new OuterSubClass();

//        String parentStr = parentClass.protectedMethod();       // Not Allowed
//        String childStr = childClass.protectedMethod();     // Not Allowed
        String outerStr = outerSubClass.protectedMethod();

        System.out.println(outerStr);
    }
}
