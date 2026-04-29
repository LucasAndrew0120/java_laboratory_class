import java.util.Scanner;
public class three1and2
{
    public static class Father
    {
        public int f(int a, int b)
        {
            
            int temp;
            while (b != 0)
            {
                temp = a % b;
                a = b;
                b = temp;
            }
            System.out.printf("%d和%d的最大公约数为：",a,b);
            return a;

        }

    }

    public static class Son extends Father
    {
        public int f(int a, int b)
        {
            int m;
            m = super.f(a, b);
            System.out.printf("%d和%d的最小公倍数为：", a, b);
            return (a * b) / m;
        }

    }

    static abstract class Animal
    {
        int age;

        void info()
        {

        }

    }

    static class Bird extends Animal
    {
        String color;
        void info()
        {
            System.out.printf("鸟属于动物，具有颜色");
        }

    }
     static class Fish extends Animal
    {
        double weight;

        void info()
        {
            System.out.printf("鱼属于动物，具有重量");
        }
    }

    public static void main(String[] args)
    {
        Father father = new Father();
        father.f(20, 16);
        Son son = new Son();
        son.f(14, 21);
        Bird bird = new Bird();
        bird.info();
        Fish fish = new Fish();
        fish.info();      
    }
}
