package rohit.tools;

public class VeryAdanceCalculator extends AdvancedCalculator{
    public double power(double x,double y){
        System.out.println(x+"power of "+y+"=" );
        return Math.pow(x, y);
    }

    public int sub(int x,int y){
        System.out.println(x+" - " + y +" - "+1+" : ");
        return x-y-1;
    }
}