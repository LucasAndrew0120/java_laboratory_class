import java.io.*;

public class six3nd
{
    public static void main(String args[])
    {
        // 搜索多个可能包含源文件的目录
        String[] searchPaths =
        { ".", // 当前工作目录
                System.getProperty("user.dir"), // 用户目录
                six3nd.class.getResource("").getPath(), // class文件目录
                "./src", // Maven/Gradle项目源码目录
                "./src/main/java", // Maven标准目录
                "./src/com/company" // 常见包目录
        };

        boolean found = false;

        for (String path : searchPaths)
        {
            File dir = new File(path);
            if (dir.exists() && dir.isDirectory())
            {
                FileAccept fileAccept = new FileAccept();
                fileAccept.setExtendName("java");
                String[] javaFiles = dir.list(fileAccept);

                if (javaFiles != null && javaFiles.length > 0)
                {
                    System.out.println("在目录找到Java文件: " + dir.getAbsolutePath());
                    for (String name : javaFiles)
                    {
                        System.out.println("  " + name);
                    }
                    found = true;
                    break;
                }
            }
        }

        if (!found)
        {
            System.out.println("在所有搜索路径中都没有找到Java文件");
            System.out.println("提示：请确保编译时保留了源文件，或使用 javac -d . six3nd.java 编译到同一目录");
        }
    }
}

class FileAccept implements FilenameFilter
{
    private String extendName;

    public void setExtendName(String s)
    {
        extendName = s.startsWith(".") ? s : "." + s;
    }

    public boolean accept(File dir, String name)
    {
        return name.toLowerCase().endsWith(extendName.toLowerCase());
    }
}