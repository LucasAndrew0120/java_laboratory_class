import java.io.InputStream;
import java.util.*;
public class four1st
{
    static class QQnumber
    {
        String number;

        

        void getnumber()
        {
            System.out.printf("请输入你的QQ号：");
            Scanner scanner = new Scanner(System.in);
            number=scanner.nextLine();
            boolean isAllNumber=number.matches("\\D+");  //布尔值检测字符串的任意非数字
            if ((number.length()<5||number.length()>12)||(isAllNumber==true)||(number.charAt(0)=='0')) //否定类型判断
            {
                System.out.printf("这不是一串QQ号");
            }
            else
                System.out.printf("这是一串QQ号");

        }

    }

    public static void main (String args[]) 
    {
        QQnumber qqnumber = new QQnumber();
        qqnumber.getnumber();


    }
}
