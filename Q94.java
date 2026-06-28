public class Q94 {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle(8, 17); // length 8, height 17
        Triangle tri2 = new Triangle(8); // length 8, height 8

        tri1.setHeight(7);
        tri2.setLength(19);

        double perimeter = tri1.perimeter(); //returns a double with the perimeter
        double area = tri2.area(); // returns a double with the area

        tri1.display();
    }    
}

class Triangle {
    private double height;
    private double length;

    Triangle(double aLength){
        length = aLength;
        height = aLength;
    }
    Triangle(double aLength, double aHeight) {
        this.length = aLength;
        this.height = aHeight;
    }

    //setters
    public void setHeight(double aHeight) {height = aHeight;}
    public void setLength(double aLength) {length = aLength;}

    public double perimeter() {
        double tempHeight = Math.pow(height,2);
        double tempLength = Math.pow(length,2);
        double h = Math.sqrt((tempHeight + tempLength));
        return h;
    }
    public double area() {
        double temp = (height * length) / 2;
        return temp;
    }

    public void display() {
        System.out.printf("Perimeter: %.2f%n", perimeter());
        System.out.printf("Area: %.2f%n", area());
    }
}
