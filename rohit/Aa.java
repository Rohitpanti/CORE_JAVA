package rohit;

class Dd{

    public void kuchBhi(){
        Aa a=new Aa();
        System.out.println("Age :"+a.age);
    }
}

public class Aa {
    //Public can be accessed any where if we import.
    public int marks=100;

    //Can be accessed in side the same  package and Sub Class
    protected int age=25;

    public void dekhao(){
        System.out.println("Dehkle Bhai ");
    }
}
