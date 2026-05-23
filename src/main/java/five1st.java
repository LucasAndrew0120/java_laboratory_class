import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.security.DrbgParameters.NextBytes;
import java.awt.event.*;
import java.math.BigInteger;
public class five1st
{
    public static void main(String[] args)
    {
        UIManager.put("Button.focusPainted", false);  //关闭按钮焦点环
        System.setProperty("awt.useSystemAAFontSettings", "on"); //文字抗锯齿
        System.setProperty("swing.aatext", "true");  //文字抗锯齿
        int n;
        JFrame jf = new JFrame("阶乘");
        Container con = jf.getContentPane();
        jf.setSize(500, 300); // 先设置大小
        jf.setLocationRelativeTo(null);  //使程序位于屏幕中央
        JTextField into = new JTextField(10);
        JTextField out = new JTextField(10);
        out.setEditable(false);
        JButton button1 = new JButton(" 1!+2!+...+n! ");
        into.setMaximumSize(new Dimension(200, 30));
        out.setMaximumSize(new Dimension(200,30));
        button1.setMaximumSize(new Dimension(150, 30));
        into.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        into.setVisible(true);
        button1.setVisible(true);
        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));  //盒式布局的垂直对齐
        ActionListener Listener = new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //使用BigInteger，防止超出存储范围
                int n = Integer.parseInt(into.getText());

                BigInteger total = BigInteger.ZERO; // 总和从 0 开始
                BigInteger factorial = BigInteger.ONE; // 阶乘从 1 开始

                for (int i = 1; i <= n; i++)
                {
                    factorial = factorial.multiply(BigInteger.valueOf(i)); // 乘
                                                                           // i
                    total = total.add(factorial); // 累加
                }

                out.setText(total.toString());
            }
        };
        button1.addActionListener(Listener);
        button1.setFocusPainted(false);
        jp.add(Box.createVerticalGlue()); 
        jp.add(into);
        jp.add(Box.createVerticalStrut(10));
        jp.add(out);
        jp.add(Box.createVerticalStrut(10));
        jp.add(button1);
        jp.add(Box.createGlue());
        jf.add(jp);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); //关闭窗口并释放资源

        
    }
}
