import java.io.*;

import javax.swing.text.html.StyleSheet;

public class six4th
{
    public static class Person implements Serializable
    {
        String name;
        int age;
        String email;

        public Person(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }
    }

    public static void main(String[] args)
    {
        Person person = new Person("张三", 19, "lucasandrew0120@outlook.com");
        File file = new File("src\\main\\java\\person_data.txt");
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.close();

        } catch (IOException event)
        {
            System.out.println(event);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\\\main\\\\java\\\\person_data.txt")))
        {
            Person p = (Person) ois.readObject();
            System.out.println(p.name + ", " + p.age + ", " + p.email);
        } catch (IOException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }

}
