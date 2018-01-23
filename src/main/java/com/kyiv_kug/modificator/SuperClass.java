package com.kyiv_kug.modificator;

public class SuperClass {
    protected void protectedMethod(){
        System.out.println("SuperClass#protectedMethod");
    }
}

class ChildClass extends SuperClass{

    private SuperClass superClass;

    public ChildClass(SuperClass superClass) {
        this.superClass = superClass;
    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
        superClass.protectedMethod();
    }
}