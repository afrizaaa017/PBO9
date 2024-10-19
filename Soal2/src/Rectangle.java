public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double p, double l)
    {
        super("Rectangle");
        length = p;
        width = l;
    }

    public double area()
    {
        return length * width;
    }

    public String toString()
    {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
