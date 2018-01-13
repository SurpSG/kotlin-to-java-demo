package com.kyiv_kug.expression;

/**
 * @see IfOperatorKotlinKt
 */
public class IfOperator {

    void divideAndPrint(int a, int b, boolean alwaysRoundUp){
        int result;
        if(alwaysRoundUp)
            result = (a-1)/b + 1;
        else
            result = a/b;
        System.out.println(result);
    }

    void ternaryDivideAndPrint(int a, int b, boolean alwaysRoundUp){
        int result = (alwaysRoundUp)
                ? (a-1)/b + 1
                : a/b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        IfOperator ifOperator = new IfOperator();
        ifOperator.divideAndPrint(1,3, false);
        ifOperator.divideAndPrint(1,3, true);
        ifOperator.ternaryDivideAndPrint(1,3, true);
    }
}
