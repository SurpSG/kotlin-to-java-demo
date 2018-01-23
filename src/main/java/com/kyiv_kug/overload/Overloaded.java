package com.kyiv_kug.overload;

public class Overloaded {
    void doSomething(){
        doSomething(0);
    }

    void doSomething(int a){
        doSomething(a, "");
    }

    void doSomething(int a, String str){
        doSomething(a, str, false);
    }

    void doSomething(int a, String str, boolean bool){
    }
}



