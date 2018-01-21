package com.kyiv_kug.expression;

import java.util.Arrays;
import java.util.List;

public class ExceptionsExample {

    /**
     * @see com.kyiv_kug.expression.ExceptionExampleKt
     */
    public static void main(String[] args) {
        String msg = "";
        List<Integer> list = Arrays.asList(1,2,3,4);
        int index = 0;
        try{
            msg = String.format("%d element is: %d", index, list.get(index));
        }catch (Exception e){
            msg = e.getMessage();
        } finally {
            msg = msg.trim();
        }
        System.out.println(msg);
    }
}