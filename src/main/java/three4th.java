import java.util.*;

public class three4th
{
    public interface Geometry
    {
        double getArea();
    }

    public class Yuan implements Geometry //圆面积接口类
    {
        private double radius;

        public Yuan(double radius) {
            this.radius = radius;
        }

        public double getArea()
        {
            return Math.PI * radius * radius;
        }
    }

    public class Juxing implements Geometry //矩形面积接口类
    {
        private double length;
        private double width;

        public Juxing(double length, double width) 
        {
            this.length = length;
            this.width = width;
        }

        public double getArea()
        {
            return length * width;
        }
    }

    public class pillar
    {
        double underarea;
        double high;

        pillar(double underarea, double high) {
            this.underarea = underarea;
            this.high = high;

        }

        double getVolume() //体积
        {
            return underarea * high;
        }

    }
    public static void main(String[] args)
    {
        three4th t = new three4th();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double radius = sc.nextDouble();
        Geometry yuan = t.new Yuan(radius);
        System.out.printf("圆的面积为：%.2f\n", yuan.getArea());

        System.out.println("请输入矩形的长和宽：");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Geometry juxing = t.new Juxing(length, width);
        System.out.printf("矩形的面积为：%.2f\n", juxing.getArea());

        System.out.println("请输入柱体的底面积和高：");
        double underarea = sc.nextDouble();
        double high = sc.nextDouble();
        pillar p = t.new pillar(underarea, high);
        System.out.printf("柱体的体积为：%.2f\n", p.getVolume());
    }
}