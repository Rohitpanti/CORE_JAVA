package rohit.tools;

public class AdvancedCalculator extends Calculator{

    public int add(int x,int y){
        System.out.println(x+" + " + y +" + "+10+" : ");
        return x+y+10;
    }

    public int addAndsub(int x,int y){
        System.out.println(x+" + " + y +" - "+x+" : ");
        return x+y-x;
    }

    public int subAndadd(int x,int y){
        System.out.println(x+" - " + y +" + "+x+" : ");
        return x-y+x;
    }

    public double multiplyAndDevide(int x,int y){
        System.out.println(x+" * " + y +" / "+x+" : ");
        return x*y/x;
    }

    public double devideAndMultiply(int x,int y){
        System.out.println(x+" / " + y +" * "+x+" : ");
        return x/y*x;
    }



}