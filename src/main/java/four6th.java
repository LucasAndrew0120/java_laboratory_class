import java.util.Scanner;
public class four6th
{
    static class GetChar
    {
        void FindChar()
        {
            System.out.printf("请输入字符串：");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            int length = str.length();
            char First = str.charAt(0);
            char Final = str.charAt(length-1);
            System.out.printf("输入的字符串第一个字符是：%c,最后一个字符是：%c", First, Final);
        }
    }

    public static void main(String[] args)
    {
        GetChar getChar = new GetChar();
        getChar.FindChar();
    }
}
