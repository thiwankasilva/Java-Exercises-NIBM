package com.nibm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        //Creating a List
        List<String> fruiList = new ArrayList<>();
        //Adding elements in the List
        fruiList.add("Mango");
        fruiList.add("Apple");
        fruiList.add("Banana");
        fruiList.add("Grapes");
        //Iterating the List element using for-each loop
        for (String fruit : fruiList)
            System.out.println(fruit);

        System.out.println("-----------------------");
        fruiList.add(2,"Orange");

        for (String fruit : fruiList)
            System.out.println(fruit);

        System.out.println(fruiList.get(4));
        System.out.println("------------------------");
        fruiList.remove(2);
        for (String fruit : fruiList)
            System.out.println(fruit);

        //Sort on alphabetical Order
        Collections.sort(fruiList);
        System.out.println("Sorted List");
        for (String fruit : fruiList)
            System.out.println(fruit);

        List<Integer> marks = new ArrayList<>();

        marks.add(34);
        marks.add(45);
        marks.add(23);
        marks.add(78);

        Collections.sort(marks);
        for (Integer num : marks)
            System.out.println(num);

    }
}
