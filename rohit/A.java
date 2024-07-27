package rohit;
//every class in java defaultly extend Object class
public class A extends Object{
    public A(){
        System.out.println("In A class");
    }

    public A(int n){
        super();
        System.out.println("In A class Parameterized constructor :" + n);
    }

    public void show(){
        System.out.println("In A class show");
    }

    public void rally(){
        System.out.println("In A class Rally");
    }

    public void showTheDataInsideThisClass(){
        System.out.println("In A class i am A king");
    }

}