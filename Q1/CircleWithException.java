package T8.Q1;

public class CircleWithException extends Exception{
    private double radius;
    private double area;
    private double diameter;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0) {
            throw new IllegalArgumentException("Radius cannot be smaller than 0");
        }
        this.radius = radius;
    }

    public double getArea(double radius) throws Exception {
        if(Math.PI*radius*radius>1000){
            throw new Exception("Area cannot be bigger than 1000");
        }
        return Math.PI*radius*radius;
    }


    public void setDiameter(double radius) {
        this.diameter = radius * 2;
    }
}
