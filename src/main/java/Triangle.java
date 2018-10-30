public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            throw new IllegalFigureParamException("стороны должны быть положительным числом!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int GetPerimeter(int a, int b, int c) {
        int p = (a + b + c);

        return p;

    }

    public int GetArea(int a, int b, int c) {
        double p = (a + b + c) / 2;
        double g = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return (int) g;


    }
}
