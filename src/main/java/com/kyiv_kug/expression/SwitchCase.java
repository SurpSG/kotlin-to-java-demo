package com.kyiv_kug.expression;

public class SwitchCase {

    int apply(String operation, int a, int b){
        switch (operation){
            case "+" : return a+b;
            case "-" : return a-b;
            case "*" : return a*b;
            case "/" : return a/b;
            default : throw new UnsupportedOperationException("Unknown operation: "+operation);
        }
    }

    int apply2(String operation, int a, int b){
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
}
