package com.company;

public class Circle {
    static int radius = 3;
     static void Area(){

        double area = Math.PI * (radius * radius);
        System.out.println("Area = " + area);

    }
    static void Circumference(){
        double circumference = Math.PI * 2 * radius;
        System.out.println("Circumference = " + circumference);
    }


}
