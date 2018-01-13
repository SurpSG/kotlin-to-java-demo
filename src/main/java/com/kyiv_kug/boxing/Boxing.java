package com.kyiv_kug.boxing;

public class Boxing {

    public static void main(String[] args) {
        print(0); // 0 int
        Integer arg = 1;
        print(arg); // 1 Integer
        print(new Integer(2)); // 2 Integer
        Integer argNull = null;
        print(argNull); // null Integer
    }

    private static void print(int a){
        System.out.println(a + " int");
    }

    private static void print(Integer a){
        System.out.println(a + " Integer");
    }
}