public class Rectangle {


    private double a;
    private double b;

    public Rectangle(double a, double b) {
        if ((a <= 0) || (b <= 0)) {
            throw new IllegalFigureParamException("стороны должны быть положительным числом!");
        }
        this.a = a;
        this.b = b;
    }


    public int GetPerimeter(int a, int b) {
        int h = (2*(a+b));

        return h;

    }
    public int GetArea (int a, int b) {


        return (a*b);
    }
}
