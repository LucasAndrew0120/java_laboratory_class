import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class seven
{
    public static void main(String[] args)
    {

        // 1. 加载配置文件
        Properties props = new Properties();
        try (InputStream input = new FileInputStream("D:\\code\\Java-Project\\laboratory_class\\src\\main\\resources\\db.properties"))
        {
            props.load(input);
        } catch (IOException e)
        {
            System.err.println("无法加载配置文件: " + e.getMessage());
            return;
        }

        // 2. 从配置文件读取数据库连接信息
        String url = props.getProperty("db.url");
        String username = props.getProperty("db.username");
        String password = props.getProperty("db.password");

        // 验证是否读取成功（调试用，确认后可以删除）
        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        // 不要打印密码！

        // 3. SQL 语句
        String sql = "SELECT * FROM grade WHERE C_source >= 90 OR java_source >= 90";

        // 4. 执行查询
        try (Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql))
        {

            while (rs.next())
            {
                // 根据你实际的列名修改这里的字段名
                int id = rs.getInt("学号"); // 或者 "id"
                String name = rs.getString("姓名"); // 或者 "name"
                int c = rs.getInt("C_source");
                int java = rs.getInt("java_source");

                System.out.println("ID: " + id + ", Name: " + name + ", C_source: " + c + ", java_source: " + java);
            }

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}