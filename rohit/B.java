package rohit;

public class B extends A{
    public B(){
        //wheneever we create a contructor it will have a super() by deagault even when we don't write it
        super();
        System.out.println("In B class");
    }

    public B(int n){
        this();
        // super(n);
        System.out.println("In B class Parameterized constructor :" + n);
    }

    public void rally(){
        System.out.println("In B class Rally");
    }

    @Override
    public void showTheDataInsideThisClass(){
        System.out.println("In B class i am B king");
    }
}
