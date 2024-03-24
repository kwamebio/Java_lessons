package objects;

public class Rectangle {
    private double length;
    private double width;
    private int sides = 4;

    public Rectangle(){
        setLength(0);
        setWidth(0);
    }

    public Rectangle(double Length, double Width){
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public double calculatePerimeter(){
        return (length * 2) + (width + 2);
    }

    public double calculateArea(){
        return length * width;
    }
}
