import java.io.FileInputStream;
import java.io.FileOutputStream;

public class six1st
{

    public static void main(String args[])
    {
        String filePath = "src\\main\\java\\six1st.txt";
        try (FileOutputStream out = new FileOutputStream(filePath))
        {
            out.write("2 3 5 7 ".getBytes());
            for (int i = 2; i <= 100; i++)
            {
                
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
                {
                    String intostring = i + " ";
                    out.write(intostring.getBytes());
                }

            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
