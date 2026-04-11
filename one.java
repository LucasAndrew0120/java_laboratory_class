package laboratory_class;
import java.util.*;

public class one
{
    public static void one()
    {
        int a;
        long i, temp, total;
        temp = 1;
        total = 0;
        System.out.println("请输入一个数，求它的阶乘和");
        Scanner reader = new Scanner(System.in);
        a = reader.nextInt();
        for (i = 1; i < a + 1; i++)
        {
            temp = temp * i;
            total += temp;
        }
        System.out.println(total);
        
    }

    public static void two()
    {
        int b;
        System.out.println("请输入要生成的随机数的个数");
        Scanner reader = new Scanner(System.in);
        b = reader.nextInt();
        int a[] = new int[b];
        for (int i = 0; i < b; i++)
        {
            int randomInt = (int) (Math.random() * 100);
            System.out.println(randomInt + " ");
            a[i] = randomInt;
        }
        System.out.println("请选择排序方式；1.冒泡排序，2.选择排序");
        int style = reader.nextInt();
        if (style == 1)
        {
            for (int i = 0; i < b - 1; i++)
            {
                for (int j = 0; j < b - 1 - i; j++)
                {
                    if (a[j] > a[j + 1])
                    {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        } 
        else if (style == 2)
        {
            for (int i = 0; i < b - 1; i++)
            {
                int max = i;
                for (int j = i + 1; j < b; j++)
                    if (a[j] > a[max])
                        max = j;
                if (max != i)
                {
                    int temp = a[i];
                    a[i] = a[max];
                    a[max] = temp;
                }
            }

        } 
        else
        {
            System.out.println("请输入有效字符");
        }
        int length = 5;
        for (int i = 0; i < b; i++)
        {
            // %4d 表示每个数字占4个字符宽度，右对齐
            System.out.printf("%4d", a[i]);

            if ((i + 1) % length == 0)
            {
                System.out.println(); // 换行
            }
        }
        
    }

    public static void three()
    {
        Scanner reader = new Scanner(System.in);

        // 添加提示信息
        System.out.println("请输入数组大小和要查找的数（例如：10 5）：");
        int c = reader.nextInt();
        int search = reader.nextInt();

        int a[] = new int[c];
        System.out.println("生成的随机数组：");
        for (int i = 0; i < c; i++)
        {
            int randomInt = (int) (Math.random() * 100);
            System.out.print(randomInt + " ");
            a[i] = randomInt;
        }
        System.out.println(); // 换行

        // 冒泡排序
        for (int i = 0; i < c - 1; i++)
        {
            for (int j = 0; j < c - 1 - i; j++)
            {
                if (a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // 显示排序后的数组
        System.out.println("排序后的数组：");
        for (int i = 0; i < c; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 二分查找
        int index = Arrays.binarySearch(a, search);
        if (index >= 0)
            System.out.println("找到 " + search + " 了，位置在数列的第 " + (index + 1) + " 位");
        else
            System.out.println("没有找到目标数 " + search);
    }

    public static void four()
    {
        System.out.println("1.二进制>>十进制；2.十进制>>二进制");
        Scanner reader = new Scanner(System.in);
        int choice = reader.nextInt();
        if (choice == 1)
        {
            System.out.println("请输入一个二进制数");
            String input = reader.next();
            char a[] = input.toCharArray();
            int length = a.length;
            int total = 0;
            for (int i = 0; i < length; i++)
            {
                total += (a[i] - '0') * Math.pow(2, length - 1 - i);
            }
            System.out.println("转换为十进制为：" + total);
        }
        if (choice == 2)
        {
            System.out.println("请输入一个十进制数");
            int b = reader.nextInt();
            char c[] = new char[100];
            int i;
            for (i = 0; i < 100 && b > 0; i++)
            {
                c[i] = (char) (b % 2 + '0');
                b /= 2;
            }
            System.out.print("转换为二进制为：");
            for (int j = i - 1; j >= 0; j--)
            {
                System.out.print(c[j]);
            }
            System.out.println();
        }
        
    }

    public static void five()
    {
        System.out.println("请输入一个数，判断它是否是素数");
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        for (int i = 2; i < a; i++)
        {
            if (a % i == 0)
            {
                System.out.println("不是素数");
                return;
            }

        }
        System.out.println("是素数");
    }

    public static void main(String[] args)
    {
        System.out.println("请输入要执行的函数：1.求阶乘和；2.排序；3.二分查找；4.进制转换；5.判断素数; 0.退出");
        Scanner reader = new Scanner(System.in);

        while (true) // 只需要一层循环
        {
            int a = reader.nextInt();

            // 添加退出条件
            if (a == 0)
            {
                System.out.println("程序退出");
                break;
            }

            switch (a)
            {
            case 1:
                one();
                break;
            case 2:
                two();
                break;
            case 3:
                three();
                break;
            case 4:
                four();
                break;
            case 5:
                five();
                break;
            default:
                System.out.println("请输入有效数字 (0-5)");
                break;
            }

            System.out.println("\n请继续输入要执行的函数 (0退出):");
        }
        reader.close();
    }
}