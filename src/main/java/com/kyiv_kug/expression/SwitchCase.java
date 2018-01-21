package com.kyiv_kug.expression;

/**
 * @see SwitchCaseKt
 */
public class SwitchCase {

    static int apply(String operation, int a, int b){
        switch (operation){
            case "+" : return a+b;
            case "-" : return a-b;
            case "*" : return a*b;
            case "/" : return a/b;
            default : throw new UnsupportedOperationException("Unknown operation: "+operation);
        }
    }

    static int apply2(String operation, int a, int b){
        int result;
        switch (operation){
            case "+" :
                result = a+b;
                break;
            case "-" :
                result = a-b;
                break;
            case "*" :
                result = a*b;
                break;
            case "/" :
                result = a/b;
                break;
            default :
                throw new UnsupportedOperationException("Unknown operation: "+operation);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(apply("+", 1, 2));
        System.out.println(apply("-", 1, 2));
        System.out.println(apply("*", 1, 2));

        System.out.println(apply2("+", 1, 2));
        System.out.println(apply2("-", 1, 2));
        System.out.println(apply2("*", 1, 2));
    }
}
