package com.nibm;

@FunctionalInterface  //It is optional
interface Drawable{
     void draw();
}

public class LamdaExpressions {
    public static void main(String[] args) {
        int width = 10;
//        LamdaExpressions lamdaExpressions = new LamdaExpressions();
//        lamdaExpressions.draw();
        //with lambda
        Drawable d2=()->{
            System.out.println("Drawing "+width); };
        d2.draw();

    }
//
//    @Override
//    public void draw() {
//         System.out.println("Drawing "+width)
//    }
}
