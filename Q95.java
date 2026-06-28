import java.lang.Math;

public class Q95 {
    public static void main(String[] args) {
        Ellipse el1 = new Ellipse(8, 4); // major axis 8, minor axis 4
        Ellipse el2 = new Ellipse(5); // radius 5 (this is just a circle!)

        el1.setMajorAxis(7);
        el2.setMinorAxis(19);

        double perimeter = el1.perimeter(); //returns a double with the perimeter
        double area = el2.area(); // returns a double with the area

        el1.display();
    }

}

class Ellipse {
    private double majorAxis;
    private double minorAxis;

    Ellipse(double mainRadius) {
        majorAxis = mainRadius;
    }

    Ellipse(double Axis1, double Axis2){
        majorAxis = Axis1;
        minorAxis = Axis2;
    }

    public void setMajorAxis(double axis) {
        majorAxis = axis;
    }
    public void setMinorAxis(double axis) {
        minorAxis = axis;
    }

    public double perimeter() {
        double temp;
        if (minorAxis == Double.NaN) {
            temp = 2 * Math.PI * majorAxis;
        } else {
            temp = 2 * Math.PI * Math.sqrt((Math.pow(majorAxis, 2) + Math.pow(minorAxis, 2)) / 2);
            
        }
        return temp;
    }

    public double area() {
        double temp;
        if (minorAxis == Double.NaN) {
            temp = Math.PI * Math.pow(majorAxis, 2);
        } else {
            temp = Math.PI * minorAxis * majorAxis;
        }
        return temp;
    }

    public void display() {
        System.out.printf("Perimeter: %.2f%n", perimeter());
        System.out.printf("Area: %.2f%n", area());
    }
}
