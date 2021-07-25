package com.SaiRohith;

import java.util.*;

class Shape {
    double pi = 3.14;
    public void rarea(double l,double b) {
        double area = (l*b);
        System.out.println("rect area is : "+ area);
        }
    public void rperiphery(double l,double b) {
        double cir = 2*(l+b);
        System.out.println("rect periphery is : "+cir);
    }
    public void carea(double r) {
        double area = pi*(r*r);
        System.out.println("circle area is : "+ area);
    }
    public void cperiphery(double r) {
        double cir = 2*pi*r;
        System.out.println("circle periphery is : "+cir);
    }
    public void sarea(int a){
        int area = a*a;
        System.out.println("Area of square is : "+ area);
    }
    public void speriphery(int a){
        int cir = 4 * (a);
        System.out.println("Periphery of square is : "+ cir);
    }
}

class Rectangle extends Shape {
    //Here rectangle class acquires the area and periphery from shape
    public Rectangle() {
        System.out.println("Rectangle Details - ");
    }
}

class Circle extends Shape {
    //Here circle class acquires the area and periphery from shape
    public Circle(){
            System.out.println("Circle Details - ");
    }
}

class Square extends Shape{
    public Square(){
        System.out.println("Square details - ");
    }
}

public class Shape {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length :");
        int a = sc.nextInt();
        System.out.println("Enter breadth :");
        int b = sc.nextInt();
        r1.rarea(a,b);
        r1.rperiphery(a,b);
        Circle c1 = new Circle();
        System.out.println("Enter Radius : ");
        int r = sc.nextInt();
        c1.carea(r);
        c1.cperiphery(r);
        Square s1= new Square();
        int p = sc.nextInt();
        s1.sarea(p);
        s1.speriphery(p);
    }
}
