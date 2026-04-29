import java.util.Scanner;

public class three5th
{
    
    public interface Person
    {
        
        void setData(String name, String sex, String birthday);

        
        String getData();
    }

    
    public static class Student implements Person
    {

        private String name;
        private String sex;
        private String birthday;

       
        private String sID; 
        private String speciality; 


        @Override
        public void setData(String name, String sex, String birthday)
        {
            this.name = name;
            this.sex = sex;
            this.birthday = birthday;
        }


        @Override
        public String getData()
        {
            return "姓名：" + name + "，性别：" + sex + "，生日：" + birthday;
        }


        public void setStudentInfo(String sID, String speciality)
        {
            this.sID = sID;
            this.speciality = speciality;
        }


        public String getStudentInfo()
        {
            return "学号：" + sID + "，专业：" + speciality;
        }


        public String getAllInfo()
        {
            return getData() + "，" + getStudentInfo();
        }
    }


    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        Student stu = new Student();


        System.out.print("请输入姓名：");
        String name = scanner.nextLine();

        System.out.print("请输入性别：");
        String sex = scanner.nextLine();

        System.out.print("请输入生日：");
        String birthday = scanner.nextLine();


        stu.setData(name, sex, birthday);


        System.out.print("请输入学号：");
        String sID = scanner.nextLine();

        System.out.print("请输入专业：");
        String speciality = scanner.nextLine();

        stu.setStudentInfo(sID, speciality);

        System.out.println("\n=== 学生信息 ===");
        System.out.println(stu.getData());
        System.out.println(stu.getStudentInfo());
        System.out.println("完整信息：" + stu.getAllInfo());

        scanner.close();
    }
}