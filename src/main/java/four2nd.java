import java.util.Scanner;

public class four2nd
{
    static class Phonenumber
    {
        String number;

        void isPhoneNumber()
        {
            System.out.printf("请输入：");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextLine();
            boolean isAllNumber = number.matches("\\d+");
            if ((number.charAt(0) != '1') || ("3578".indexOf(number.charAt(1)) == -1) || (!isAllNumber))
            // ("3578".indexOf(number.charAt(1)) == -1)表示number字符串的第二个字符，不在3578中能找到
                {
                System.out.printf("这不是手机号码");

            } 
            else
                System.out.printf("这是手机号码");
        }

    }

    public static void main (String args[])
    {
        Phonenumber phonenumber = new Phonenumber();
        phonenumber.isPhoneNumber();
    }
}
