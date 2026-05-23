import javax.management.ObjectName;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.awt.event.ActionEvent;

public class five2nd
{
    public static void main(String args[])
    {

        JFrame jf = new JFrame("简单计算器");
        JPanel jp = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JTextField jt1 = new JTextField(8);
        JTextField jt2 = new JTextField(8);
        jt1.setSize(new Dimension(300, 10));
        jt2.setSize(new Dimension(100, 10));
        Container con = jf.getContentPane();
        jf.setSize(500, 300);
        jf.setLocationRelativeTo(null);
        String[] items =
        { "➕", "➖", "✖️", "➗" };
        JComboBox<String> comboBox = new JComboBox<>(items);
        String selected = (String) comboBox.getSelectedItem();
        int index = comboBox.getSelectedIndex();
        comboBox.setSelectedIndex(0);
        comboBox.setPrototypeDisplayValue("000000000000");
        JButton jb = new JButton("计算");
        jb.setVisible(true);
        JTextArea jArea = new JTextArea(13, 50);
        jArea.setVisible(true);
        jArea.setEditable(false); // 只读
        JScrollPane scrollPane = new JScrollPane(jArea);
        ActionListener listener =new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double a = Integer.parseInt(jt1.getText());
                double b = Integer.parseInt(jt2.getText());
                String selected = (String) comboBox.getSelectedItem();
                switch (selected) {
                    case "➕":
                        jArea.append(a + " + " + b + " = " + (a+b) + "\n");
                        break;
                    case "➖":
                        jArea.append(a + " - " + b + " = " + (a-b) + "\n");
                        break;
                    case "✖️":
                        jArea.append(a + " * " + b + " = " + (a*b) + "\n");
                        break;
                    case "➗":
                        jArea.append(a + " / " + b + " = " + (a/b) + "\n");
                        break;
                }
            }

        };
        jp.add(jt1);
        jp.add(comboBox);
        jp.add(jt2);
        jp.add(jb);
        jp.add(scrollPane);
        jb.addActionListener(listener);
        jf.add(jp);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}