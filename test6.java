import java.util.*;
public class test6 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println(" Enter a, b and c: ");
     QuadraticEquation quadraticEquation = new QuadraticEquation(in.nextDouble(), in.nextDouble(), in.nextDouble());
     if((quadraticEquation.getRealRoot1() == 0) && (quadraticEquation.getRealRoot2() == 0)) {
            System.out.printf("There are no real roots%n");

     } else if(quadraticEquation.getRealRoot1() == quadraticEquation.getRealRoot2() ) {
        System.out.printf("The real root is %s", quadraticEquation.getRealRoot2() == 0 ? quadraticEquation.getRealRoot2() : quadraticEquation.getRealRoot1());
    } else {
        System.out.printf("The real root is %s and %s", quadraticEquation.getRealRoot1(),quadraticEquation.getRealRoot2());
        }
    }
}
class QuadraticEquation {

         private double a;
         private double b;
         private double c;


    QuadraticEquation( double a , double b, double c){
         this.a = a;
         this.b = b;
         this.c = c;
    }


    public double getA() {return a;}
    public void setA(double a) {this.a = a;}
    public double getB() {return b;}
    public void setB(double b) {this.b = b;}
    public double getC() {return c;}
    public void setC(double c) {this.c = c;}

    public double getDiscriminant(){
        double dis = Math.pow(b, 2) - (4 *a * c);
        return dis;
    }

    public double getRealRoot1() {
        double r2 = 0;
        if (getDiscriminant() < 0) {
            r2 = 0;
            }else {
                r2 = ((b * -1) + Math.sqrt(getDiscriminant())) / ( 2*a);
        }
        return r2;
        }
    public double getRealRoot2() {
    double r2 = 0;
    if (getDiscriminant() <  0) {
        r2 = 0;
        }else {
            r2 = ((b * -1) - Math.sqrt(getDiscriminant())) / ( 2*a);
    }
    return r2;
    }

    }