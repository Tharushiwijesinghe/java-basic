import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Circle cirObj = new Circle();
        double areaf= cirObj.computeArea(14,7);
        System.out.println("Area:" + areaf);

        double cirf = cirObj.computeCircumference(14,7);
        System.out.println("Circumference" + cirf);
    }
}

class Circle {

    public double computeArea(double r1, double r2)
    {
        double area = Math.PI*(r2*r2-r1*r1);
        return area;
    }
    public double computeCircumference(double r1, double r2)
    {
        double circumference = 2*Math.PI*(r1+r2);
        return  circumference;
    }
}
