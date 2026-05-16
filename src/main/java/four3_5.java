import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;

public class four3_5
{
    static class WeatherData1
    {
        String OrginData = "北京:23.5上海:25.2广州:28.1深圳:27.3成都:22.9";

        void count()
        {
            Pattern pattern = Pattern.compile("\\d+\\.\\d");
            Matcher matcher = pattern.matcher(OrginData);
            double total = 0.0;
            while (matcher.find())
            {
                double FindDouble = Double.parseDouble(matcher.group());
                total += FindDouble;
            }
            total = total / 5;
            System.out.println("使用Pattern和Matcher类计算平均温度的结果为："+total);
        }
    }

    static class WeatherData2
    {
        String OrginData = "北京:23.5上海:25.2广州:28.1深圳:27.3成都:22.9";

        void count()
        {
            String str = OrginData.replaceAll("[\\u4e00-\\u9fa5]+", "#");
            //先使用正则把中文字符换成#
            StringTokenizer FindDouble = new StringTokenizer(str, ":#");
            double total = 0.0;
            while (FindDouble.hasMoreTokens())
            {
                double temp = Double.parseDouble(FindDouble.nextToken());
                total += temp;
            }
            total = total / 5;
            System.out.println("使用StringTokenizer类计算平均温度的结果为："+ total);

        }

    }

    static class WeatherData3
    {
        String OrginData = "北京:23.5上海:25.2广州:28.1深圳:27.3成都:22.9";

        void count()
        {
            Scanner scanner = new Scanner(OrginData);
            scanner.useDelimiter("[：:\\u4e00-\\u9fa5]+");
            double total = 0.0;
            while (scanner.hasNextDouble())
            {
                double temp = scanner.nextDouble();
                total += temp;
            }
            total = total / 5;
            System.out.println("使用Scanner类计算平均温度的结果为："+total);
        }


    }

    public static void main(String[] args)
    {
        WeatherData1 one = new WeatherData1();
        WeatherData2 two = new WeatherData2();
        WeatherData3 three = new WeatherData3();
        one.count();
        two.count();
        three.count();

    }
}
