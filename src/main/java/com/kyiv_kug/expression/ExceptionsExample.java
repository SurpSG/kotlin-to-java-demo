package com.kyiv_kug.expression;

public class ExceptionsExample {

    /**
     * @see com.kyiv_kug.expression.ExceptionExampleKt
     */
    public static void main(String[] args) {
        String msg = "";
        try{
            msg = "arg successfully parsed: "+Integer.parseInt(args[0]);
        }catch (Exception e){
            msg = e.getMessage();
        } finally {
            msg = msg.trim();
        }
        System.out.println(msg);
    }
}