public class Circle {

    private double radius;

    private final static double PI = 3.14;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalFigureParamException("радиус должен быть положительным числом!");
        }
        this.radius = radius;
    }


    public double GetPerimeter(double a) {
        double p = 3.14;
        double b = (2 * p * a);
        return b;
    }

    public double GetArea(double a) {
        double p = 3.14;
        double g = (p * (a * a));
        return g;


    }
}

