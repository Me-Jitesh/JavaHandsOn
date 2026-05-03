package com.jitesh.packaging.parent;

// Protected Method Is Accessible in Sibling Class  Directly but in SubPackage & OuterPackage through SubClass  Object Only  not even with Parent, Child  Class Object
public class ParentClass {

    protected String protectedMethod() {
        return "I'm Parent Class Protected Method";
    }
}
