package laboratory_class;

import java.util.Scanner;

public class two
{
    static Scanner scanner = new Scanner(System.in);

    public static class Point
    {
        double x, y;

        void givenumber1()
        {
            this.x = 0;
            this.y = 0;
            System.out.println("x:" + x + ",y:" + y);
        }

        void givenumber2(int a, int b)
        {
            this.x = a;
            this.y = b;
        }

        void move()
        {
            System.out.printf("请输入平移后的坐标点(用空格分隔): ");
            double temp1 = scanner.nextDouble();
            double temp2 = scanner.nextDouble();
            System.out.printf("平移后坐标点为:(%.1f,%.1f)\n", x + temp1, y + temp2);
        }

        void getinfo()
        {
            System.out.printf("点坐标为(%.1f,%.1f)\n", x, y);
        }
    }

    public static class Circle
    {
        double pi;
        static double x, y;
        static double r;

        void pi()
        {
            x = y = 0.0;
            r = 1.0;

            pi = 3.14;
            System.out.println("now,pi=" + pi + ",please input new pi:");
            double d = scanner.nextDouble();
            pi = d;

        }

        static void move()
        {
            x = y = 0;
            r = 1.0;
            x++;
            y++;
            r++;
            System.out.println("目前的圆心坐标和半径为：" + "(" + x + "," + y + ")" + " "+r);
        }

        static void getbig()
        {
            System.out.println("now radius=" + r + ",please input increment r");
            double RadiusNew = scanner.nextDouble();
            r += RadiusNew;
            System.out.println("New radius=" + r);
        }

        static void getinfo()
        {
            System.out.printf("圆的坐标为(%.1f,%.1f),半径为%.1f\n", x, y, r);

        }
    }

    public static class User
    {
        String ID;
        String password;
        String email;

        public User(String ID, String password) {
            this.ID = ID;
            this.password = password;
            this.email = ID + "@gameschool.com";
        }

        public User(String ID, String password, String email) {
            this.ID = ID;
            this.password = password;
            this.email = email;
        }

        void display()
        {
            System.out.printf("用户ID: %s, 邮箱: %s\n", this.ID, this.email);
        }

        void inputFromKeyboard()
        {
            System.out.print("请输入用户ID: ");
            this.ID = scanner.nextLine();
            System.out.print("请输入密码: ");
            this.password = scanner.nextLine();
            System.out.print("请输入邮箱: ");
            this.email = scanner.nextLine();
        }
    }

    public static class Person
    {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void display()
        {
            System.out.printf("姓名:%s,年龄:%d\n", name, age);
        }
    }

    public static class Student
    {
        int sNo, sAge;
        String sName, sSex;
        double sJava;

        public Student(int sNo, String sName, String sSex, int sAge, double sJava) {
            this.sNo = sNo;
            this.sAge = sAge;
            this.sJava = sJava;
            this.sName = sName;
            this.sSex = sSex;
        }

        public int getNo()
        {
            System.out.printf("学生学号为:%d\n", sNo);
            return sNo;
        }

        public int getAge()
        {
            System.out.printf("学生年龄为:%d\n", sAge);
            return sAge;
        }

        public double getJava()
        {
            System.out.printf("学生Java成绩为:%.2f\n", sJava);
            return sJava;
        }

        public String getName()
        {
            System.out.printf("学生姓名为:%s\n", sName);
            return sName;
        }

        public String getSex()
        {
            System.out.printf("学生性别为:%s\n", sSex);
            return sSex;
        }
    }

    public static void main(String args[])
    {
        int choice;

        while (true)
        {
            // 显示菜单
            System.out.println("\n╔════════════════════════════════════╗");
            System.out.println("║        Java 作业测试系统           ║");
            System.out.println("╠════════════════════════════════════╣");
            System.out.println("║  1. 测试 Point 类                  ║");
            System.out.println("║  2. 测试 Circle 类                 ║");
            System.out.println("║  3. 测试 User 类                   ║");
            System.out.println("║  4. 测试 Person 类                 ║");
            System.out.println("║  5. 测试 Student 类（单个对象）    ║");
            System.out.println("║  6. 测试 Student 类（数组+统计）   ║");
            System.out.println("║  0. 退出系统                       ║");
            System.out.println("╚════════════════════════════════════╝");
            System.out.print("请选择功能 (0-6): ");

            choice = scanner.nextInt();
            scanner.nextLine(); // 清除换行符

            switch (choice)
            {
            case 1:
                // 测试 Point
                System.out.println("\n========== 测试 Point 类 ==========");
                Point point = new Point();
                int a, b;
                a = b = 12;
                point.givenumber1();
                point.givenumber2(a, b);
                point.move();
                point.getinfo();
                System.out.println("\nPoint 测试完成！");
                break;

            case 2:
                // 测试 Circle
                System.out.println("\n========== 测试 Circle 类 ==========");
                Circle circle = new Circle();
                circle.pi();
                Circle.move();
                Circle.getbig();
                Circle.getinfo();
                System.out.println("\nCircle 测试完成！");
                break;

            case 3:
                // 测试 User
                System.out.println("\n========== 测试 User 类 ==========");
                User user1 = new User("001", "123456");
                User user2 = new User("002", "abc123", "user2@example.com");
                user1.display();
                user2.display();
                System.out.println("\nUser 测试完成！");
                break;

            case 4:
                // 测试 Person
                System.out.println("\n========== 测试 Person 类 ==========");
                Person person = new Person("张三", 19);
                person.display();
                System.out.println("\nPerson 测试完成！");
                break;

            case 5:
                // 测试 Student 单个对象
                System.out.println("\n========== 测试 Student 类（单个对象） ==========");
                Student student = new Student(2021001, "李四", "男", 20, 85.0);
                student.getNo();
                student.getAge();
                student.getJava();
                student.getName();
                student.getSex();
                System.out.println("\nStudent 单个对象测试完成！");
                break;

            case 6:
                // 测试 Student 数组和成绩统计
                System.out.println("\n========== 测试 Student 类（数组+统计） ==========");
                Student[] students = new Student[5];
                students[0] = new Student(1001, "张三", "男", 20, 85.5);
                students[1] = new Student(1002, "李四", "女", 21, 92.0);
                students[2] = new Student(1003, "王五", "男", 20, 78.5);
                students[3] = new Student(1004, "赵六", "女", 22, 96.0);
                students[4] = new Student(1005, "小明", "男", 19, 88.0);

                System.out.println("\n===== 成绩统计 =====");

                // 输出每个学生信息
                for (Student s : students)
                {
                    System.out.printf("学号:%d, 姓名:%s, 性别:%s, 年龄:%d, Java成绩:%.1f\n", s.sNo, s.sName, s.sSex, s.sAge,
                            s.sJava);
                }

                // 计算统计值
                double sum = 0;
                double max = students[0].sJava;
                double min = students[0].sJava;

                for (Student s : students)
                {
                    sum += s.sJava;
                    if (s.sJava > max)
                        max = s.sJava;
                    if (s.sJava < min)
                        min = s.sJava;
                }

                double avg = sum / students.length;

                System.out.printf("\n平均分: %.2f\n", avg);
                System.out.printf("最高分: %.1f\n", max);
                System.out.printf("最低分: %.1f\n", min);
                System.out.println("\nStudent 数组测试完成！");
                break;

            case 0:
                System.out.println("\n感谢使用，再见！");
                scanner.close();
                System.exit(0);
                break;

            default:
                System.out.println("\n❌ 无效选择，请输入 0-6 之间的数字！");
                break;
            }

            // 按回车键继续
            System.out.print("\n按回车键返回主菜单...");
            scanner.nextLine();
        }
    }
}