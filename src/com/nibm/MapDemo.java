package com.nibm;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        //LinkedHashMap maintains the order of insertion
        //This is map of students whose having index number as the key and their details as the value
        Map<String,NibmStudent> studentsMap = new LinkedHashMap<>();

        NibmStudent student1 = new NibmStudent("Hiruni","20","Negombo");
        NibmStudent student2 = new NibmStudent("Dilshan","21","Galle");
        NibmStudent student3 = new NibmStudent("Thiwanka","26","Negombo");

        studentsMap.put("973880",student1);
        studentsMap.put("973881",student2);
        studentsMap.put("973856",student3);

        for(Map.Entry m:studentsMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        List<NibmStudent> myList = new LinkedList<>();
        myList.add(student1);
        myList.add(student2);
        myList.add(student3);
        System.out.println("---------------------------------");
        //this is commonly used for collections unlike other for loop you don't need to define last index
        for(NibmStudent student :myList)
        {
            System.out.println(student);
        }
        for (int i=0;i<myList.size() ; i++)
        {
            System.out.println(myList.get(i));
        }


    }

}
