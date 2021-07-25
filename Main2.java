package com.SaiRohith;

import java.util.*;

class Complex {
    int real;
    int imaginary;

    Complex add(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp;
    }
    Complex sub(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
        return temp;
    }
    public void Complex_A(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }
}

class Complex_A extends Complex{

}


public class Main2 {
    public static void main(String[] args)
    {

        Complex_A C1 = new Complex_A();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter complex number 1 real part : ");
        int a = sc.nextInt();
        System.out.println("Enter complex number 1 imaginary part : ");
        int b = sc.nextInt();
        C1.Complex_A(a,b);
        System.out.println("Complex number 1 : " + C1.real+ " + i" + C1.imaginary);
        Complex_A C2 = new Complex_A();
        System.out.println("Enter complex number 2 real part : ");
        int p = sc.nextInt();
        System.out.println("Enter complex number 2 imaginary part : ");
        int q = sc.nextInt();
        C2.Complex_A(p,q);
        System.out.println("Complex number 2 : " + C2.real+ " + i"  + C2.imaginary);
        Complex C3 = new Complex();
        C3 = C3.add(C1, C2);
        System.out.println("Sum of complex number : " + C3.real +" + i"  + C3.imaginary);
        C3 = C3.sub(C1, C2);
        System.out.println("Sub of complex number : " + C3.real +  " + i" +C3.imaginary  );
    }
}

