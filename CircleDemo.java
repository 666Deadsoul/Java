public class CircleDemo {
    public static void main(String[] a)
    {
        Circle c1 = new Circle(5.8);
        System.out.println("Area="+ c1.CalculateArea());
        System.out.println("Perimeter=" +c1.CalculateOPerimeter());
    }
}
class Circle
{
    double radius;
    final double PI= 3.1415;
    public Circle(double r)
    {
        radius=r;
    }
    public double CalculateArea()
    {
        return PI*radius*radius;
    }
    public double CalculateOPerimeter()
    {
        return 2 * PI * radius;
    }
}
