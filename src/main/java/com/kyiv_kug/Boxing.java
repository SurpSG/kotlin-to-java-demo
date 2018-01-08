package com.kyiv_kug;

public class Boxing {

    public static void main(String[] args) {
        print(0);
        Integer integer = 1;
        print(integer);
    }

    static void print(int a){
        System.out.println("print(int)");
    }

    static void print(Integer a){
        System.out.println("print(Integer)");
    }
}
