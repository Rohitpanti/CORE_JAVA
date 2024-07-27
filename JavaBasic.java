


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.Iterator;


import rohit.A;
import rohit.Aa;
import rohit.B;
// import rohit.*; ->* uses all files not folders 
import rohit.tools.*;


class Player{
    String name;
    int JersyNo;
    int score;

}

class Mobile{
    String brand;
    int minPurchase;
    int price;
    String modelname;
    //Makes the Variable Comman for all the objects Created
    static String type;

    

    public Mobile(){
        minPurchase= 10000;
        System.out.println("Minumum Purchse Value : "+minPurchase);
    }

    public void show(){
        System.out.println(brand+" "+modelname+" is a "+type +" costs you ="+price+" rs");
    }

    public static void store(Mobile m){
    System.out.println("Gada electronics has "+ Mobile.type + "phones");
    }

    static{
        System.out.println("Welocome to Gada Electronics");
    }

    public static void showStatic(Mobile m){
        System.out.println("Brands we have :"+m.brand );
        System.out.println("Models we have :"+m.modelname );
    }
}

class Person{
    String name;
    private int age;
    private String status;

    public Person(){
        System.out.println("Must be Human.");
        age=18;
        name="please enter Name";
        status="Please Enter Martial status";

    }

    public Person(int a,String n, String status){
        
        System.out.println("Must be Human.");
        age=a;
        name=n;
        this.status=status;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStutuswothis(String status , Person p){
        p.status=status;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age=a;
    }



}

class Cc extends Aa{

    public void MeriUmmar(){
        System.out.println("My Age is "+ age);
    }

}

class Computer {

    public void playMusic(){
        System.out.println("Dolby walya bulao maja Dj laa");
    }

    public String start(){
        return "Starting ....";
    }

    public String message(String msg){
        return msg;
    }

    public String searchFileNo(int no){
        if(no == 0){
            return "File Doesn't exist";
        }
        return "File Exist "+no;

    }

}

class Laptop extends Computer{
    String model;
    int price;

    // public String toString(){
    //     return ("overrides toString() in Object Class.");
    // }
    

    // public boolean equals(Laptop that){

    //     return this.model==that.model && this.price==that.price;
    // }

    
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }



}

class I{

    public void show(){
        System.out.println("In I show.");
    }
}

class J1 extends I{
    public void show(){
        System.out.println("In J1 show.");
    }
}

class J2 extends I{
    public void show(){
        System.out.println("In J2 show.");
    }
}

// if the Class Has Final it can not be inherited
final class M{

    public void show(){
        System.out.println("In M class Show");
    }

    public void add(int x, int y){
        System.out.println(x+" + "+y+"= "+(x+y));
    }
}

//can not extend The M class bcs of final
// class N extends M
class N{

    final public void reminder(double x, double y){
        System.out.println(x+" % "+y+" = "+(x%y));
    }

    public void sub(int x, int y){
        System.out.println(x+" - "+y+"= "+(x-y));
    }
}

class O extends N{

    // Can Not Override The Metod in M as it final
    // final public void reminder(double x, double y){
    //     System.out.println(x+" % "+y+" = "+(x%y));
    // }

    public void sub(int x, int y){
        System.out.println(x+"  substracted from "+y+" is equal to  "+(x-y));
    }
}

class Atc{

    public void show1(){
        System.out.println("In Atc.show1() Class ");
    }

}
class Btc extends Atc{
    public void show2(){
        System.out.println("In Btc.show2() Class ");
    }
}

abstract class Car{
    //It is neccesary to have Abstrac Class to have Abstract Method But Not Vice-versa.
    public abstract void drive();
    

    public void playMusic(){
        System.out.println("Playing music inside the Car");
    }
}

abstract class GWagonR extends Car{

    public void drive(){
        System.out.println("Driving......... GWagonR");
    }

    public abstract void park();
    

}

class MyCar extends GWagonR{

    public void park(){
        System.out.println("Parking......... GWagonR");
    }
}

//The Outer Class cannot be static
class House{
    String ownwerName;
    public void welcome(String houseName){
        System.out.println("Welcom to "+houseName);
    }

    static class Rooms{

        public void kitchen(){
            System.out.println("This is Kitchen");
        }
        public void hall(){
            System.out.println("This is Hall");
        }

        public void balcony(){
            System.out.println("This is Balcony");
        }

        public void bedRoom(){
            System.out.println("This is Bed Room");
        }

        public void bathRoom(){
            System.out.println("This is Bath room");
        }

    }

}

abstract class AbstractClass{
    public abstract  void show();
    public abstract  void dikhao();
}



//Instead of using abstract class with abstract Methods like above we can also use Interface
interface Ainterface{

    //By default every variable  in Interface  are  final static
    int lifespan=100;
    String sathya="Yehi Jeevan Ka Sathya Hian";

    //By default every Method in Interface  are  Public abstract
    void show();
    void dikhao();
}

interface Binterface{
    void run();
}

interface Cinterface extends Binterface{
    void kuch();
}

/*
 * class->class = extends
 * interface->interface=extends
 * class->interface=implements
 */

class Aimplemnetation implements Ainterface,Cinterface{

    public void show() {
        System.out.println("implemented show() in A class using A interface");
    }

    public void dikhao() {
        System.out.println("implemented dikhao() in A class using A interface");
    }

    public void run() {
        System.out.println("implemented run() in A class using B interface");
    }

    public void kuch() {
        System.out.println("implemented kuch() in A class using B interface");
    }

}
// abstract class Computer1{
//     public abstract void code();
// }
interface Computer1{
    void code();
}

class Laptop1 implements Computer1{
    public void code(){
        System.out.println("Coding in Laptop");
    }
}

class Desktop implements Computer1{
    public void code(){
        System.out.println("Coding in  DeskTop");
    }
}



class Developer{

    public void work(Computer1 l){
        l.code();
    }
}


//is a class that holds Named constatnts
enum Status{
    Succesfull,Failed,Pending,Issue
}

enum Cars{
    VirtusGt(2000000),TataHariear(2500000),RangeRover(20000000),Xuv700(3000000),Ferrari;

   
    private int price;
    private Cars() {
        price=1000000;
    }
    private Cars(int price){
        this.price=price;
    }
    public int getPrice() {
        return price;
    }
}
//Naming Convention

//Camel casing
//class & interface = Calc,MyMobile
//variables & method = mai,goodWishes()
//constants = KEY

//Types of Interface
//Normal->Ineteface wit multiple methods
//Functional/Single Abstract Method
//Marker=>Blank Interface used for serialization and Deserialization
@FunctionalInterface
interface Ek{
void ekMethod(int i);
// void dusraMethod();
}

interface Doo{
    double dooMethod(double i,double j);
}

class MyException extends ArithmeticException {
    MyException(String s){
        super(s);
    }
}

class Athrows{
    public void pheku() throws ClassNotFoundException{
        // try {
        //     Class.forName("name");
        //     System.out.println("class Mill gayi");
        // } catch (ClassNotFoundException e) {
        //     System.out.println("Not able To find "+e);
        // }
        Class.forName("name");
    }
}

//Threads
class Hi extends Thread{
    public void run(){
        int n=10;
        for (int index = 1; index <= n; index++) {
            System.out.println("Hi..."+ index);
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("rukh ja bhai..");
            }
        }
        
    }
}

// class Hello implements Runnable{
//     public void run(){
//         int n=10;
//         for (int index = 1; index <= n; index++) {
//             System.out.println("hello..."+ index);

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 System.out.println("rukh ja bhai..");
//             }
//         }
        
//     }
// }

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

class Employee implements Comparable<Employee>{
    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Employee [age= "+age+","+"name= "+name+" ]";
    }

    
    public int compareTo(Employee that) {
        if (this.age > that.age) {
            return 1;
        }
        return -1;
    }

    
    
}

/**
 * JAVA BASIC
 */
public class JavaBasic {
    /*
     * Exceptions
     * Errors:
     * compileTime error/Sytax error
     * Logical Error
     * runtime Error->Occurs during execution and needs to be handled hence we call it exception
     */
    
    public static void main(String a[]) throws ClassNotFoundException, IOException
    {
        System.out.println("Hello world");

        System.out.println(3+8);
        
        int num1=1;
        int num2=3;
        int sum;
        sum=num1+num2;
        System.out.println(sum);

        String name ="Karna";
        long long1=2133123l;
        float float1=121.12f;
        double double1=1213.23113;
        byte range1=-128;
        byte range2=127;
        
        
        char character='k';
        boolean is=true;
        System.out.println(name +"says  "+long1+","+float1+","+double1+","+range1+","+character+","+is+"Are all the primitive datatype");

        //literals

        int num3=0b101;
        int num4=0x7E;
        int num5=1_00_00_000;
        double num6=12e10;
        System.out.println(num3+" "+num4+" "+num5+" "+num6);

        char c='a'; 
        c++;
        System.out.println(c);  

        //Type Conversion & casting
        int b=257;
        //Type Conversion
        byte  k = (byte) b;
        System.out.println(k);

        float f = 5.6f;
        int t = (int) f;
        System.out.println(t);
        
        // Type Promotion
        byte  x=6;
        byte y=10;
        int z= x*y;
        System.out.println(z);

        //opertors

        //Arthematic operators
        int n1=10;
        int n2=20;

        int  add = n1+ n2;
        System.out.println(add);

        int  sub = n1-n2;
        System.out.println(sub);

        int  product = n1*n2;
        System.out.println(product);

        int  div = n1/ n2;
        System.out.println(div);

        int  mod = n1%n2;
        System.out.println(mod);

        n1=n1+2;
        System.out.println(n1);
        n2-=22;
        System.out.println(n2);
        n1*=2;
        System.out.println(n1);
        n2/=2;
        System.out.println(n2);
        System.out.println(n1++);//post increment
        System.out.println(--n2);//pre decrement

        //relation operators
        int x1=2;
        int x2=5;

        boolean result = x1< x2;
        System.out.println(result);

        boolean result1 = x1>x2;
        System.out.println(result1);

        boolean result2 = x1==x2;
        System.out.println(result2);

        boolean result3 = x1!=x2;
        System.out.println(result3);

        boolean result4 = x1>=x2;
        System.out.println(result4);

        boolean result5 = x1<=x2;
        System.out.println(result5);

        //logical operator
        boolean result6 = x1>x2 && n1<n2;
        System.out.println(result6);
        boolean result7 = x1>x2|| n1>n2;
        System.out.println(result7);
        boolean result8= true;
        System.out.println(!result8);

        //conditional statements
        int q=12;
        int w=20;
        int m=30;
        if(true)
        System.out.println("ganaptahi bappa mourya");
        if(true){
            System.out.println("Radhe");
            System.out.println("krishna");
        }
        if (q>w || q<w) {
            System.out.println("jai shree Ram");
        }else{
            System.out.println("jai jagnath");
        }

        if (q>w && q>m) {
            System.out.println(q);
        }else if(w>m){
            System.out.println(w);
        }else{
            System.out.println(m);
        }

        //odd or even
        String result9="";
        if (x1%2==0) 
            result9="Even";
        else
            result9="Odd";
            System.out.println(result9);

        //ternary opertor
        String result10= x%2==0 ? "odd" : "even";
        System.out.println(result10);

        //Switch statement
        int d=1;
        switch (d) {
            case 1:
                System.out.println("Monday");
                break;
        
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;


            default:
                System.out.println("Enter a vailid No.of day in week");
                break;
        }

        //loops

        //while
        int i=0;
        System.out.println("Printing Numbers");
        while (i<=5) {
            System.out.println(i);
            int j=1;
            while (j<=3) {
                System.out.println("Hello  "+ j);
                j++;
            }
            i++;
            
        }
        System.out.println("stopped printing by "+ i);

        //Infinite Loop
        // while (true) {
        //     System.out.println("Ram");
        // }
    
        //Do while
        int idw=4;
        do{
            System.out.println(idw+" Bar");
            idw++;
        }while(idw<=3);
        
        //for loop
        System.out.println("printing No in decrement");
        for (int ki = 5; ki >= 0; ki--) {
            System.out.println(ki);
            
        }

        for (int j = 0; j <=5; j++) {

            System.out.println("Day"+j);

            // for (int mj = 1; mj<=9; mj++) {
            //     System.out.println(" "+ (mj+8)+ "- "+(mj+9));
            // }
        }

        //Object Oriented Programming
        //object has properties and behaviours

        Calculator calc=new Calculator();

        int sumc=calc.add(2, 2);
        System.out.println(sumc);
        int subc=calc.sub(2, 2);
        System.out.println(subc);
        int proc=calc.product(2, 2);
        System.out.println(proc);
        int divc=calc.div(10, 2);
        System.out.println(divc);

        //method overlaoding
        System.out.println(calc.product(2,3,4));
    
        //object
        Calculator calc1=new Calculator();
        System.out.println(calc1.add(x, y));
        System.out.println(calc.add(3,5,5));

        //class & method
        Computer comp = new Computer();
        comp.playMusic();
        System.out.println(comp.start());
        String message= comp.message("Kalki 2898 Ad");
        System.out.println(message);
        String filesearch=comp.searchFileNo(1);
        System.out.println(filesearch);

        //Array

        int numArr[] ={1,2,3,4,5};
        System.out.println(numArr[2]);
        numArr[2]= 6;
        System.out.println(numArr[2]);

        int numArr1[]= new int[4];
        numArr1[0]=10;
        numArr1[1]=20;
        numArr1[2]=30;
        numArr1[3]=40;

        System.out.println("Numbers in Array : ");
        for (int index = 0; index < 4; index++) {
            System.out.println( numArr1[index]);
            
        }

        //Multi dimensional Array
        int num2DArr[][]=new int[3][4];
        num2DArr[0][0]= 1;num2DArr[0][1]= 2;num2DArr[0][2]= 3;num2DArr[0][3]= 4;
        num2DArr[1][0]= 10;num2DArr[1][1]= 20;num2DArr[1][2]= 30;num2DArr[1][3]= 40;
        num2DArr[2][0]= 100;num2DArr[2][1]= 200;num2DArr[2][2]= 300;num2DArr[2][3]= 400;

        System.out.println("Priniting the Values Of 2D array set individually");
        for (int i2 = 0; i2 <3 ; i2++) {
            
            for (int j2 = 0; j2 < 4; j2++) {
                System.out.print(num2DArr[i2][j2]+ "  ");
            }
            System.out.println("");
        }

        //Adding random values to 2D array using loop
        for (int i2 = 0; i2 <3 ; i2++) {
            
            for (int j2 = 0; j2 < 4; j2++) {
                num2DArr[i2][j2]=(int) (Math.random()*10);
            }
            
        }

        System.out.println("Priniting the Values Of 2D array set using loop");
        for (int i2 = 0; i2 <3 ; i2++) {
            
            for (int j2 = 0; j2 < 4; j2++) {
                System.out.print(num2DArr[i2][j2]+ "  ");
            }
            System.out.println("");
        }

        System.out.println("Printin Array using for each loop");
        for (int n[] : num2DArr ) {

            for (int m1 : n) {
                System.out.print(m1+ "  ");
            }
            System.out.println("");
            
        }

        //jagged Array
        int num2DArrjagged[][]=new int[3][];

        num2DArrjagged[0]=new int[3];
        num2DArrjagged[1]=new int[4];
        num2DArrjagged[2]=new int[2];

        for (int i2 = 0; i2 <num2DArrjagged.length ; i2++) {
            
            for (int j2 = 0; j2 < num2DArrjagged[i2].length; j2++) {
                num2DArrjagged[i2][j2]= (int) (Math.random()*10);
            }
            
        }
        
        

        System.out.println("Priniting the Values Of 2D Jagged array set using loop");
        for (int n[] : num2DArrjagged ) {

            for (int m1 : n) {
                System.out.print(m1+ "  ");
            }
            System.out.println("");
            
        }

        //3D array
    int num3DArr[][][] = new int[2][3][4];

    //Adding random values to 2D array using loop
    for (int i2 = 0; i2 <2 ; i2++) {
            
        for (int j2 = 0; j2 < 3; j2++) {
            for (int k2 = 0; k2 < 4; k2++) {
                num3DArr[i2][j2][k2]=(int) (Math.random()*10);
            }
        }
        
    }

    System.out.println("Priniting the Values Of 3D array set using loop");
    for (int i2 = 0; i2 <2 ; i2++) {
            
        for (int j2 = 0; j2 < 3; j2++) {
            for (int k2 = 0; k2 < 4; k2++) {
                System.out.print(num3DArr[i2][j2][k2]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Array of Objects
    System.out.println("PLAYERS :");
    Player p1= new  Player();
    p1.name="Rohit Sharma";
    p1.JersyNo=45;
    p1.score=264;
    System.out.println(p1.name+" : "+p1.JersyNo );

    

    Player p2= new  Player();
    p2.name="Virat Kholi";
    p1.JersyNo=18;
    p1.score=183;
    System.out.println(p2.name+" : "+p2.JersyNo );

    Player p3= new  Player();
    p3.name="Rishab Pant";
    p3.JersyNo=17;
    p3.score=125;
    System.out.println(p3.name+" : "+p3.JersyNo );

    Player players[]=new Player[3];
    players[0]=p1;
    players[1]=p2;
    players[2]=p3;

    System.out.println("Printing Players Score Using For Loop and Array oof objects");
    System.out.println("SCORES");
    for (int p = 0; p < 3; p++) {
        System.out.println(players[p].name+" : "+players[p].score);
    }


    //foreacg Loop
    for (int n  : numArr) {
        System.out.println(n);
    }

    for (Player p : players) {
        
        System.out.println(p.JersyNo+" : "+p.name);
    }

    //Strings
    // String naam = "Ved";
    // String naam=new String();
    String naam=new String("Ved");
    System.out.println(naam);
    System.out.println(name.hashCode());
    System.out.println(name.charAt(1));
    System.out.println(naam.concat(" : Tara"));

    String hero="Chulbul";
    hero= hero +" Pandey";
    System.out.println(hero);

    String s1="Krishna";
    String s2="Krishna";
    System.out.println(s1==s2);
    //Strings are Mutable - can change 

   //Immutable Strings
        StringBuffer sb= new StringBuffer("Rohit");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append("- Barad"));
        System.out.println(sb.deleteCharAt(6));
        System.out.println(sb.insert(5," M"));
        System.out.println(sb.substring(0,5));
        sb.setLength(30);
        sb.ensureCapacity(50);
        //String Buffer is Thread safe

    //Static Keyword
    Mobile mob1 =new Mobile();
    mob1.brand="Samsung ";
    mob1.modelname="S21FE";
    mob1.type="premium midrange";
    mob1.price=30000;

    Mobile mob2 =new Mobile();
    
    mob2.brand="Nothing ";
    mob2.type="Flagship";
    mob2.modelname="phone 2";
    mob2.price=35000;


    //Always use the class to access the Static Variable
    
    Mobile.type="Smartphone";

    Mobile.store(mob1);

    Mobile.showStatic(mob1);
    Mobile.showStatic(mob2);

    mob1.show();
    mob2.show();

    //If you dont create a object the static method is not called

    //Class
    //Loading a Class w/o Creating Object
    Class.forName("Mobile");

    //Data Encapsulation
    System.out.println("Data  Encapsulation");
    Person person=new Person();
    System.out.println("Before assigning the Values ");
    System.out.println("Person's Name : " +person.name);
    System.out.println("Person's Age : " +person.getAge());
    System.out.println("Person's Status : " +person.getStatus());



    person.name="Soumya B";
    person.setAge(19);
    person.setStatus("Single");

    Person person1=new Person();
    person1.name="Manjula B";
    person1.setAge(48);
    person1.setStutuswothis("Married",person1);

    System.out.println("Assigninng values using Contructors");
    Person person2=new Person(24,"Rohit","Single");

    System.out.println("Person's Name : " +person.name);
    System.out.println("Person's Age : " +person.getAge());
    System.out.println("Person's Status : " +person.getStatus());

    System.out.println("Person's Name : " +person1.name);
    System.out.println("Person's Age : " +person1.getAge());
    System.out.println("Person's Status : " +person1.getStatus());

     //Constructors
    System.out.println("Person's Name : " +person2.name);
    System.out.println("Person's Age : " +person2.getAge());
    System.out.println("Person's Status : " +person2.getStatus());

    //Inheritence with this  & super
    System.out.println("__________________________________________________");
    System.out.println("Inhertence & this , Super Keywords");
    B bi=new B();
    System.out.println("---------------");
    B bip=new B(10);
    System.out.println("---------------");
    B bim=new B(20);

    AdvancedCalculator adCalc=new AdvancedCalculator();
    int r1=adCalc.add(10, 5);
    System.out.println(r1);
    int r2=adCalc.sub(10, 5);
    System.out.println(r2);
    int r3=adCalc.product(10, 5);
    System.out.println(r3);
    int r4=adCalc.div(10, 5);
    System.out.println(r4);
    int r5=adCalc.addAndsub(10, 5);
    System.out.println(r5);
    int r6=adCalc.subAndadd(10, 5);
    System.out.println(r6);
    double r7=adCalc.multiplyAndDevide(10, 5);
    System.out.println(r7);
    double r8=adCalc.devideAndMultiply(10, 5);
    System.out.println(r8);

    VeryAdanceCalculator veryAdanceCalc = new  VeryAdanceCalculator();
    double r9=veryAdanceCalc.power(10,5);
    System.out.println(r9);
    double r10=veryAdanceCalc.multiplyAndDevide(10,5);
    System.out.println(r10);
    int r11=veryAdanceCalc.sub(10, 5);
    System.out.println(r11);

    System.out.println("Java Supports Multi level Inheritence But Not Multiple Inheritence");


    //Overriding
    bi.show();
    bi.rally();

    //Imports
    // ArrayList al=new ArrayList();

    //Access Modifiers
    Aa aa=new Aa();
    aa.dekhao();
    System.out.println("Marks from Class Aa : "+aa.marks);

    Bb bb=new Bb();
    System.out.println("Marks from Class Bb : "+bb.marks);

    //As email is private variable it can only be accessed in ts own class
    // bb.email;
    bb.emailIdBol();
    Cc cc= new Cc();
    cc.MeriUmmar();

    //Ideal ways to Use Access Modifier
    //Keep your Classes Public
    //Instance Variable private
    //methods can majorly be public but in case of specifiaclly allowing in sub class use Protected
    //PolyMorphism
    I il=new I();
    il.show();

    //Object Type here is I (Parent) but the Implementation or Objec here is J1(Child)
    
    il=new J1();
    il.show();

    il=new J2();
    il.show();

    // il=new A();

    //This is calle Runtime Poly morphism and Dynamic Method dispatch can only be done  when extended or Iheritens
    
    

    Computer laptop=new Laptop();
    laptop.playMusic();

    //final - variable , method Class keyword
    // can be used for a constant variable which are not suppose to change the values
    final String sach="Sathayamev Jayethe";
    // sach="juth";

    M ma=new M();
    ma.show();
    ma.add(12, 10);

    N na=new N();
    na.reminder(200.2, 212);
    na.sub(222, 111);
    O oa = new O();
    oa.sub(221,110);

    //Objects
    Laptop l1=new Laptop();
    l1.model="MacBook Pro";
    l1.price=120000;
    System.out.println(l1);
    //Behind Yhe scene
    Laptop l2=new Laptop();
    l2.model="MacBook Pro";
    l2.price=120000;
    
    System.out.println(l2);
    boolean l1equlsl2 = l1 ==l2 ;
    boolean isl1equlsl2 = l1.equals(l2) ;
    System.out.println(l1equlsl2);
    System.out.println(isl1equlsl2);

    //Type Casting
    double digit=2.323;
    System.out.println(digit);
    int digitint=(int) digit;
    System.out.println(digitint);

    //typecasting in Class & Object

    Atc atc = new Atc();
    atc.show1();
    // atc.show2();

    //Upcastinng
    Atc abtc = new Btc();
    abtc.show1();
    // abtc.show2(); -> Here we are referencing to Btc class but the object Still is Atc class as we are suing parent class it is called Upcasting

    //DownCasting
    Btc batc = (Btc) abtc;
    batc.show2();


    //Abstract

    // Car car =new Car();
    // Car car=new GWagonR();
    GWagonR car=new MyCar();
    car.drive();
    car.playMusic();
    car.park();

    //Inner Class
    House home=new House();
    home.ownwerName="Rohit B";
    System.out.println("Owner Name :"+ home.ownwerName );
    home.welcome("Sai Sadan");

    // Rooms rooms=new Rooms();
    
    // House.Rooms rooms= home.new Rooms();


    //If the Inneer class is Static
    House.Rooms rooms= new House.Rooms();
    rooms.hall();

    //Anonymus Inner class

    A anonymusClass = new A(){
        public void show(){
            System.out.println("In Anonymus class show");
        }
    };
    anonymusClass.show();

    AbstractClass anonymusAbstractClass = new AbstractClass(){
        public void show(){
            System.out.println("In Abstaract Anonymus class show");
        }
        public void dikhao(){
            System.out.println("Dekho yeh  Abstaract Anonymus class Ko");
        }
    };
    anonymusAbstractClass.show();

    //Interfaces
    //interface just contain the declerations its the duty of class to implemnt it.
    Ainterface ai;
    ai=new Ainterface(){

        
        public void show() {
            System.out.println("implemented show() in Anonymus class using A interface");
        }


        public void dikhao() {
            System.out.println("implemented dikhao() in Anonymus class using A interface");
        }
        
    };
    ai.dikhao();
    ai.show();

    Aimplemnetation aImp =new Aimplemnetation();
    aImp.show();
    aImp.dikhao();
    aImp.run();

    System.out.println("Life span :" + ai.lifespan);
    System.out.println("Sathyavachan  :" + Ainterface.lifespan);

    //Need of Interface
    Computer1 deviceL= new Laptop1();
    Computer1 deviceD= new Desktop();
    Developer dev=new Developer();
    dev.work(deviceL);
    dev.work(deviceD);

    //Enum
    Status status=Status.Failed;
    // Status status=Status.DonntKonow;
    System.out.println(status);
    System.out.println(status.ordinal());

    Status[] allStatus= Status.values();
    for (Status s : allStatus) {
        System.out.println(s+" : "+s.ordinal());
    }

    if(status == Status.Succesfull)
        System.out.println("Congragulations !!");
    else 
    if(status == Status.Pending)
        System.out.println("Please Wait......");
    else
    if(status == Status.Issue)
        System.out.println("Has some issue Ty again later");
    else
        System.out.println("Sorry Failed");
    
        switch (status) {
            case Succesfull:
            System.out.println("Congragulations !!");
                break;
        
            case Issue:
            System.out.println("Has some issue Ty again later");
                break;
            
            case Pending:
            System.out.println("Please Wait......");
                break;

            default:
            System.out.println("Sorry Failed");
                break;
        }

        Cars myCar= Cars.RangeRover;
        System.out.println(myCar);
        System.out.println(myCar.getPrice());

        System.out.println("List of cars");

        for(Cars acar : Cars.values()){

            System.out.println(acar+" : "+acar.getPrice());
        }

        //Annotation -> will discuss m=in depth with frameworks

        B b3=new B();
        b3.showTheDataInsideThisClass();

        //Lambada expresion works only with a Functional Interface
    //    Ek ek=()->System.out.println("Yeh Ek Method");
    //ek.ekMethod();
    Ek ek= i1 -> System.out.println("Yeh Ek Method" + i1);
        ek.ekMethod(20);

    Doo doo = ( i5, j5) ->  i5+j5;

    double ans= doo.dooMethod(200, 450.342); 
    System.out.println("Answer for Do0: "+ans);

    //Statements
        //Normal
        int stmntI=20;
        int stmntJ=0;
        // int numt[]=new int[5];
        // String nalla=null;
        // for (int n : numt) {
        //     numt[n]++;
        // }
    //Try Catch
        try{
            //critcal 
            stmntJ=18/stmntI;
            if(stmntJ==0)
                throw new MyException("don't it is zero");
            // System.out.println(numt[1]);
            // System.out.println(numt[5]);
             // System.out.println(nalla.length());
        }
        catch(MyException e){
            System.out.println("Mera Exception "+ e);
        }
        catch(ArithmeticException e){
            //Handling the exception
            stmntJ=18/1;
            System.out.println("The Maths ka exception "+ e);
            
        }
        // catch(IndexOutOfBoundsException e){
        //     System.out.println("Oye aukat main ");
        // }
        //Always Make sure the Parent exception class are handled last
        catch(Exception e){
            System.out.println("Exception : Kuch aur gadbad hain");
        }

        
        System.out.println(stmntJ);

        System.out.println("Bye");

        Athrows ats=new Athrows();
        try {
            ats.pheku();
        } catch (Exception e) {
            System.out.println("pakkad liye ");
            // e.printStackTrace();
        }
        // ats.pheku();

        // How to take input from a user
        // System.out.println("Enter a number : ");
        // int numIIP =System.in.read();//gives You The ASCII value
        // System.out.println("The Ascii value of No. you entered : " + numIIP);
        // System.out.println("The  No. you entered : " + (numIIP-48));->Not a Valid  way
        // System.out.println("Enter a Number :");
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader bf =new BufferedReader(in);
        // int numbf=Integer.parseInt(bf.readLine());
        // System.out.println("Number entered :"+numbf);
        // bf.close();

        // we got Scanner class in java 1.5
        // Scanner sc=new Scanner(System.in);
        // int numSc=sc.nextInt();
        // System.out.println("No you entered :"+numSc);
        // System.out.println("Enter a String :");
        // String eneteredString=sc.nextLine();
        // System.out.println("No you entered :"+eneteredString);

        
        try {
            int u=4;
            int v=0;
            v=18/u;
            System.out.println("Main Try our sahi Condition ke wajah se print Ho raha Hu");
        } catch (Exception e) {
            System.out.println("No. ko 0 se / kartha hain.....");
            System.out.println("Main exception ke wajah se print Ho raha Hu");
        }finally{
            System.out.println("Mujhe insab se ghanta farak padtha hain Main Finnally Hu ");
        }

        // System.out.println("Enter a Number :");
        // int numbf=0;
        // BufferedReader bf=null;
        // try {
        //     bf =new BufferedReader(new InputStreamReader(System.in));
        //     numbf=Integer.parseInt(bf.readLine());
        //     System.out.println("Yeh Le tera No. : " + numbf );
        // } catch (Exception e) {
        //     System.out.println("No. ko 0 se / kartha hain.....");
        //     System.out.println("Main exception ke wajah se print Ho raha Hu");
        // }finally{
        //     bf.close();
        //     System.out.println("Buffer reader Bandh");
        // }

        //try resource
        // try(BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));){
            
        //     int numbf=Integer.parseInt(bf.readLine());
        //     System.out.println("Yeh Le tera No. : " + numbf );
        // }catch(Exception e) {
        //     System.out.println("YeaH Shaney No. daal");
        // }

        //Threads- smallest component to work with
        // Hi hi=new Hi();
        // Runnable hello=() ->{
        //     int n=10;
        //     for (int index = 1; index <= n; index++) {
        //         System.out.println("hello..."+ index);
        //         try {Thread.sleep(10);} catch (InterruptedException e) {System.out.println("rukh ja bhai..");}
        //     }
        // };
        // //will print one after other in squence
        // // hi.hiBolo();
        // // hello.helloBolo();
        // System.out.println(hi.getPriority());
        // hi.setPriority(Thread.MAX_PRIORITY);
        // hi.start();
        // try {
        //     Thread.sleep(2);
        // } catch (InterruptedException e) {
        //     System.out.println("rukh ja bhai..");
        // }
        // Thread t2=new Thread(hello);
        // t2.start();


        //Thread safe
        Counter counter = new Counter();

        Runnable cts1 = () -> {
            for (int index = 1; index <= 1000; index++) {
                counter.increment();
            }
        };

        Runnable cts2 = () -> {
            for (int index = 1; index <= 1000; index++) {
                counter.increment();
            }
        };

        Thread ts1 = new Thread(cts1);
        Thread ts2 = new Thread(cts2);
        ts1.start();
        ts2.start();

        try {
            ts1.join();
            ts2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("count: " + counter.count);
        

        //collection Api -concept
        //Will explore Deep in DSA
        //Collection - Interface
        //we can not use the Lambda expression here as it is Normal Collection But we can use The Class that have Already Implemented The Collection Interface
        //Some Calsses are : List ,Queue,Set and Etc.
        //the above classe also have ther own implementations such as ArrayList,Linkedlist,HashSet,linkedHashSet,DeQueue & etc
        //As  of the  numsCollection is adding the value in objects they are not integers
        //To specify the Type we must and The Genrics = <Type> 
        // Collection<Integer> numCollection=new ArrayList<Integer>();
        //to work with Index value
        List<Integer> numCollection=new ArrayList<Integer>();
        numCollection.add(61);
        numCollection.add(32);
        numCollection.add(14);
        numCollection.add(83);
        numCollection.add(14);
        
        System.out.println(numCollection);
        numCollection.set(2,101);
        System.out.println("Get the Index Value of 14 : "+numCollection.indexOf(14));

        System.out.println("Printing 2nd Index Value :" +numCollection.get(2) );
        // to print individually
        // As  of the  numsCollection is adding the value in objects they are not integers
        for (int n : numCollection) {
            System.out.println(n);
        }
        // 2nd Way- but this time we are supposed to *2
        for (Object n : numCollection) {

            int num=(int)n;
            System.out.println(num*2);
            
        }

        //Set
        System.out.println("_______________Set___________");
        //hash set doesnt have a sorted value
        // Set<Integer> numSet=new HashSet<Integer>();
        //TreeSet Does sort teh Value
        Collection<Integer> numSet=new TreeSet<Integer>();
        numSet.add(16);
        numSet.add(23);
        numSet.add(42);
        numSet.add(14);
        numSet.add(38);
        //set doesn't have index vlaue 
        System.out.println(numSet);
        System.out.println("Printed Using for loop");
        for (int n : numSet) {
            System.out.println(n);
        }
        //using Iterartor
        System.out.println("Printed Using iterator");
        Iterator<Integer> values=numSet.iterator();

        while(values.hasNext())
            System.out.println(values.next());

        //Map-{key,value}
        // Map<Integer,String> students=new HashMap<>();
        //HashMap are Asynchronised asnd Hash Tables are Sychronised
        Map<Integer,String> students=new Hashtable<>();
        students.put(10, "Sachin");
        students.put(18, "Virat");
        students.put(03, "Suresh");
        students.put(12, "YuvRaj");
        students.put(10, "Rohit");
        System.out.println(students);
        System.out.println(students.get(10));
        System.out.println(students.keySet());
        for (int rollNo : students.keySet()) {
            System.out.println(rollNo+" : "+students.get(rollNo));
        }


        //Sorting a Collection
        System.out.println("_____________Sorting Collections____________");
        System.out.println("The List of Items : "+numCollection);

        //Collections - Class
        Collections.sort(numCollection);
        System.out.println("Sorted using Collections : "+numCollection );
        Comparator<Integer> com= new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if (i%10 > j%10) {
                    return 1;
                }
                return -1;
            }
        };
        Collections.sort(numCollection,com);
        System.out.println("Sorted using Comparator and with reference 2 2nd digut : "+numCollection );

        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee(24, "Rohit"));
        empList.add(new Employee(27, "Lavish"));
        empList.add(new Employee(30, "Vijay"));
        empList.add(new Employee(26, "Jimit"));
        System.out.println("List of Employees :");
        for (Employee e : empList) {
            System.out.println(e);
        }
        Comparator<Employee> comea= (ia, j)-> ia.age > j.age ? 1:-1;
        Collections.sort(empList,comea);
        //w/o comparitor
        // Collections.sort(empList);
        System.out.println("List of Employees Sorted By Age:");
        for (Employee e : empList) {
            System.out.println(e);
        }

        //Stream Api
        List<Integer> numsInt= Arrays.asList(12,11,9,13,20,6,22,7);
        System.out.println(numsInt);
        System.out.println("Printing Fro traditinal for loop");
        for (int index = 0; index < numsInt.size(); index++) {
            System.out.println(numsInt.get(i));
        }
        System.out.println("Printing From enhanceed for loop");
        for (int num : numsInt) {
            System.out.println(num);
        }
        System.out.println("Printing From Foreach for loop");
        numsInt.forEach(n -> System.out.println(n));


        //Stream can only be used Once
        // Stream<Integer> stream= numsInt.stream();
        // System.out.println("values of stream");
        // stream.forEach(n->System.out.println(n));
        // Stream<Integer> streamF = stream.filter(n -> (n % 2) == 0);
        // System.out.println("Printing even No. in list");
        // streamF.forEach(n->System.out.println(n));
        // Stream<Integer> streamD=streamF.map(n->n*2);
        // System.out.println("Printing Double of Even No. in list");
        // streamD.forEach(n->System.out.println(n));
        // int sumD=streamD.reduce(0,(c1,e)->c1+e);

        Predicate<Integer> p=new Predicate<Integer>() {
            public boolean test(Integer n){
                if(n%2==0)
                    return true;
                else
                    return false;
            }
        };

        Function<Integer,Integer> func =new Function<Integer,Integer>() {

            public Integer apply(Integer n) {
                return n*2;
            }
        
            
        };

        int sumD=numsInt.stream()
            // .filter(p)
            .filter(n-> n%2==0)
            // .map(func)
            .map(n->n*2)
            .reduce(0,(c1,e)->c1+e);
        System.out.println("Sum of Squares of All Even No.s in the List by stream = "+sumD);
        //Double Only the even Numbers in the above List
        int sumI=0;
        for (int n : numsInt) {
            if(n%2==0){
                n=n*2;
                sumI=sumI+n;
            }
        }


        System.out.println("Sum of Squares of all even No. in the List  bye for: "+sumI);


    }
}



