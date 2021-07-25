package com.SaiRohith;
class Automobile_A{

    int no_wheels;
    int no_mirrors;
    int no_gears;

    public Automobile_A(int a, int b, int c){
        no_wheels = a;
        no_mirrors = b;
        no_gears = c;
    }

    public void run(){
        System.out.println("run");
    }
    public void breaks(){
        System.out.println("breaks");
    }
    public void change_direction(){
        System.out.println("change_direction");
    }
}

class Toto extends Automobile_A{
    public Toto(int a,int b, int c){
        super(a,b,c);
    }
    public void details(){
        System.out.println("No.of wheels for Toto : "+no_wheels);
        System.out.println("No.of mirrors for Toto : "+no_mirrors);
        System.out.println("No.of gears for Toto : "+no_gears);
    }
    public void run(){
        System.out.println("Toto run");
    }
    public void breaks(){
        System.out.println("Toto breaks");
    }
    public void change_direction(){
        System.out.println("Toto change_direction");
    }
}

class Two_wheeler{
    int no_wheels;
    int no_mirrors;
    int no_gears;
}

class Motor_cycle extends Two_wheeler{
    public void details(int no_wheels,int no_mirrors,int no_gears){
        System.out.println("No.of wheels for Motor_cycle : "+no_wheels);
        System.out.println("No.of mirrors for Motor_cycle : "+no_mirrors);
        System.out.println("No.of gears for Motor_cycle : "+no_gears);
    }
    public void run(){
        System.out.println("Motor_cycle run");
    }
    public void breaks(){
        System.out.println("Motor_cycle breaks");
    }
    public void change_direction(){
        System.out.println("Motor_cycle change_direction");
    }
}

class Cycle extends Two_wheeler{
    public void details(int no_wheels,int no_mirrors,int no_gears){
        System.out.println("No.of wheels for Cycle : "+no_wheels);
        System.out.println("No.of mirrors for Cycle : "+no_mirrors);
        System.out.println("No.of gears for Cycle : "+no_gears);
    }
    public void run(){
        System.out.println("Cycle run");
    }
    public void breaks(){
        System.out.println("Cycle breaks");
    }
    public void change_direction(){
        System.out.println("Cycle change_direction");
    }
}


public class Automobile {

    public static void main(String[] args) {
        System.out.println("Details of Toto : ");
        Toto t1 = new Toto(4,2,3);
        t1.details();
        t1.run();
        t1.breaks();
        t1.change_direction();

        System.out.println("Details of Motor_cycle : ");
        Motor_cycle m1 = new Motor_cycle();
        m1.details(2,2,5);
        m1.run();
        m1.breaks();
        m1.change_direction();

        System.out.println("Details of Cycle : ");
        Cycle c1 = new Cycle();
        c1.details(2,2,0);
        c1.run();
        c1.breaks();
        c1.change_direction();
    }

}
