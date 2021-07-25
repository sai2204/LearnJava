package com.SaiRohith;

import java.util.*;
class com{
    int r,i;
    public com(int a,int b){
        r=a;
        i=b;
    }
}
class mathop {
    public void sum1(int a,int b){
        System.out.print("The sum is :");
        System.out.println(a+b);
    }
    public void sum2(int a,int b,int c){
        System.out.print("The sum is :");
        System.out.println(a+b+c);
    }
    public void add(com a,com b)
    {
        com result=new com(0,0);
        result.r=a.r+b.r;
        result.i=a.i+b.i;
        System.out.print("The complex number sum is :");
        System.out.println(result.r+"+i"+result.i);
    }
    public void sub(com a,com b)
    {
        com result=new com(0,0);
        result.r=a.r-b.r;
        result.i=a.i-b.i;
        System.out.print("The difference of complex number is :");
        System.out.println(result.r+"+i"+result.i);
    }



}
public class ComplexandAdd
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real and imaginary part of complex number1:");
        int f=sc.nextInt();
        int g=sc.nextInt();
        com i1=new com(f,g);
        System.out.println("Enter real and imaginary part of complex number2:");
        int h=sc.nextInt();
        int i=sc.nextInt();
        com i2=new com(h,i);
        mathop op=new mathop();
        op.sub(i1,i2);
        op.add(i1,i2);
        System.out.println("Enter two numbers to be added");
        int a=sc.nextInt();
        int b=sc.nextInt();
        op.sum1(a,b);
        System.out.println("Enter three numbers to be added");
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        op.sum2(c,d,e);

    }
}
