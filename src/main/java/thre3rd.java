import java.util.Scanner;
public class thre3rd
{
    public static abstract class Animal
    {
        String name;
        int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public abstract void speak();

        public static class Monkey extends Animal
        {
            public Monkey(String name, int age) {
                super(name, age);
            }

            public void speak()
            {
                System.out.printf("别说话！");
            }

            public void think()
            {
                System.out.printf("认真思考！");

            }
        }

    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入猴子的名字：");
        String name = sc.nextLine();
        System.out.println("请输入猴子的年龄：");
        int age = sc.nextInt();
        Animal.Monkey monkey = new Animal.Monkey(name, age);
        monkey.speak();
        monkey.think();
    }
}
