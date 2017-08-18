package com.luosheng.test;

public class NullEqualNumber {
    public static void main(String[] args) {
        System.out.println(null instanceof Integer);
        System.out.println(Integer.valueOf(1) instanceof Integer);
        if(null == new Integer(1)){
            
        }
    }
}
