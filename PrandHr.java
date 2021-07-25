package com.SaiRohith;

class Programmer{
    public static void display(){
        System.out.println("Original code");
    }
}
class Hacker extends Programmer{
    public static void display() {
        System.out.println("Yor code is hacked");
    }
}

public class PrandHr{
    public static void main (String[] args) {
        Programmer h1 = new Hacker();
        h1.display();
    }

}
