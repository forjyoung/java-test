package com.luosheng.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        String str = "工";
        int ad = str.compareTo("我");
        System.out.println(ad);
        test("");
        List<String[]> lsit = new ArrayList<String[]>();
        String[] a = new String[]{"a", "b"};
        String[] b = new String[]{"b", "a"};
        lsit.add(a);
        lsit.add(b);
        listSort(lsit, 0, false);
        System.out.println(lsit.get(0)[1]);
        System.out.println(lsit.get(1)[1]);
//        System.out.println(lsit[0]);
//        System.out.println(lsit[0]);
    }
    
    public static void test(final String a){
        
    }
    
    public static void listSort(List<String[]> arrayList, final int index, final boolean desc) {
        Collections.sort(arrayList, new Comparator<String[]>() {
            @Override
            public int compare(String[] lhs, String[] rhs) {
                if (desc) {
                    // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                    return lhs[index].compareTo(rhs[index]) > 0 ? -1 : (lhs[index].compareTo(rhs[index]) < 0 ) ? 1 : 0;
                }
                return lhs[index].compareTo(rhs[index]) > 0 ? 1 : (lhs[index].compareTo(rhs[index]) < 0 ) ? -1 : 0;
            }
        });
    }
}
