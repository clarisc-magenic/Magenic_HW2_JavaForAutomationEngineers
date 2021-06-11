import java.util.Scanner;

/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [ ] Update both the set method for rectangle like you did for square
 *      [ ] Write the setters for the Rectangle Class
 *      [ ] Write methods for the Rectangle Class
 */
public class Rectangle {
    /**
     * The length of the rectangle
     */
    private double length;

    /**
     * The width of the rectangle
     */
    private double width;

    /**
     * Creates an instance of the Rectangle class
     */
    public Rectangle() {
    }

    /**
     * Gets the length of the rectangle
     * @return The length
     */
    public double getLength() {
        return length;
    }

    // TODO FOR HOMEWORK: Write the setLength method
    //      NOTE: Use a conditional to only set the value if it's positive and non-zero

    public void setLength(double length) {
        if(length>0) this.length = length;
    }

    public double getWidth() {
        return width;
    }

    // TODO FOR HOMEWORK: Write the setWidth method
    //      NOTE: Use a conditional to only set the value if it's positive and non-zero

    public void setWidth(double width) {
        if(width>0) this.width = width;
    }

    // TODO FOR HOMEWORK: Write the method for area
    public double area(){
        return width * length;
    }
    // TODO FOR HOMEWORK: Write the method for perimeter
    public double perimeter(){
        return 2*(length + width);
    }
    // TODO FOR HOMEWORK: Write a main method
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = scan1.nextDouble();
        System.out.print("Enter length: ");
        double length = scan2.nextDouble();

        rectangle.setWidth(width);
        rectangle.setLength(length);

        double area = rectangle.area();
        double perimeter = rectangle.perimeter();

        System.out.println("A rectangle with width of " + rectangle.getWidth() + " has an area of: " + area);
        System.out.println("A rectangle with length of " + rectangle.getLength() + " has a perimeter of: " + perimeter);
    }

}