package rohit.tools;

public class Calculator {

    public int add(int x,int y){
        System.out.println("The Sum of "+x+" and " + y +":");
        return x+y;
    }



    public int sub(int x,int y){
        System.out.println("The Sub of "+x+" and " + y +":");
        return x-y;
    }


    public int product(int x,int y){
        System.out.println("The Product  of "+x+" and " + y +":");
        return x*y;
    }
    public int div(int x,int y){
        System.out.println(x+ " Divide by "+ y +":");
        return x/y;
    }


    //Method overloading
    public int add(int x,int y,int z){
        System.out.println("The Sum of "+x+" + " + y +" + "+z+":");
        return x+y+z;
    }

    public double sub(double x,double y,double z){
        System.out.println("The Sub of "+x+" - " + y +" - "+z+":");
        return x-y-z;
    }

    public double product(double x,double y,double z){
        System.out.println("The Product  of "+x+" * " + y +" * "+z+":");
        return x*y*z;
    }

    
}