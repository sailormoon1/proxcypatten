package com.example.test.util;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> linkedList= new LinkedList<String>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        System.out.println(linkedList.toString());
        java.util.LinkedList<String> linkedList1 = new java.util.LinkedList<>();
        linkedList1.add("a");
        linkedList1.add("b");
        linkedList1.add("c");
        linkedList1.iterator();
        System.out.println(linkedList1.toString());


        for (String str : linkedList1){
            System.out.println(str);
        }

        Iterator<String> iterator = linkedList1.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
