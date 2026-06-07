import java.io.*;
import java.util.Scanner;
public class six2nd
{
    int TurnintAndJudeNarcissistic(int number)   //将输入数字转变为字符数组并判断水仙花
    {
        String str = String.valueOf(number);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
        {
            arr[i] = str.charAt(i) - '0';
        }
        int total = 0;
        int temp = 0;
        for (int i = 0; i < str.length(); i++)
        {
            temp = (int) Math.pow(arr[i], str.length());
            total += temp;
        }
        if (total==number)
            return number;
        else
            return 0;
    }

    public void FindNumberAndOutData(int a,int b)
    {
        
            
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/java/six2nd.bin")))
        {
            
            for (int i = a; i <= b; i++) {
                int temp = TurnintAndJudeNarcissistic(i);
                if (temp != 0) {
                    dos.writeInt(i);
                    System.out.println(temp);
                }
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("文件未找到: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO异常: " + e.getMessage());
        }


    }

    public static void main(String[] args)
    {
        System.out.println("请输入寻找水仙花数的范围");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        six2nd test = new six2nd();
        test.FindNumberAndOutData(a, b);
    }

    
}
