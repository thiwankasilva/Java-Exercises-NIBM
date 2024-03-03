package com.nibm;


import java.util.LinkedList;

interface DisplayParamters {
     void display();
}



public class AnonymousClassDemo{

    public static void main(String[] args) {
        //Anonymous classes used  to implement an interface
        //public class x implements Polygon
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Polygon side one size : 20 ");
        myList.add("Polygon side two size : 20");
        DisplayParamters p = new DisplayParamters() {
            @Override
            public void display() {
                for(String x : myList)
                {
                    System.out.println(x);
                }
            }
        };
        p.display();
        LinkedList<String> cubeParameters = new LinkedList<>();
        cubeParameters.add("Cube side one size : 20 ");
        cubeParameters.add("Cube side two size : 20");
        DisplayParamters cube = new DisplayParamters() {
            @Override
            public void display() {
                for(String x : cubeParameters)
                {
                    System.out.println(x);
                }
            }
        };
        cube.display();
    }

}
