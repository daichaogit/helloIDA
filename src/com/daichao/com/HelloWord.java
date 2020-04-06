package com.daichao.com;


import java.util.ArrayList;

public class HelloWord {
    public static void main(String[] args) {
        String[] strings = new String[]{"tom", "jerry", "jjh"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("----------------");
        for (String string : strings) {
            System.out.println(string);
        }

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        for (Integer fi : arr1) {
            System.out.println(fi);
        }
        System.out.println("----forr----");
        //forr
        for (int i = arr1.size() - 1; i >= 0; i--) {
            System.out.println(arr1.get(i));
        }
        System.out.println("fori");
        //fori
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i));
        }
        if (arr1 == null) {
            System.out.println("arry是null");
        }
        if (arr1 != null) {
            System.out.println("arry不是null");
        }
    }
    private int hh; //hh

    public void testUpdate(){
        String s = new String();
    }
}
