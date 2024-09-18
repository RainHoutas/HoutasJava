import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

class BackgroundPanel extends JPanel {
    private Image backgroundImage;

    public BackgroundPanel(String filePath) {
        backgroundImage = new ImageIcon(filePath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}

public class SymbolLogin {
    public static void main(String[] args) {
        // 创建窗体
        JFrame frame = new JFrame("登录页面");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // 设置窗体居中
        frame.setLocationRelativeTo(null);

        // 设置窗体图标
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("image/houtas.jpg"));

        // 创建面板
        BackgroundPanel panel = new BackgroundPanel("image/loginbg.jpg");
        panel.setLayout(null); // 使用绝对布局
        frame.add(panel);
        placeComponents(panel);

        // 显示窗体
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // 用户名标签
        JLabel userLabel = new JLabel("用户名:");
        userLabel.setBounds(50, 50, 80, 25);
        userLabel.setFont(new Font("Serif", Font.PLAIN, 18)); // 改变字体
        userLabel.setForeground(Color.BLUE); // 改变字体颜色
        userLabel.setBorder(new EmptyBorder(0, 10, 0, 0)); // 改变字体间距
        panel.add(userLabel);

        // 用户名文本域
        JTextField userText = new JTextField(20);
        userText.setBounds(150, 50, 165, 25);
        userText.setFont(new Font("Serif", Font.PLAIN, 18)); // 改变字体
        userText.setForeground(Color.BLUE); // 改变字体颜色
        userText.setBorder(new EmptyBorder(0, 10, 0, 0)); // 改变字体间距
        panel.add(userText);

        // 密码标签
        JLabel passwordLabel = new JLabel("密码:");
        passwordLabel.setBounds(50, 100, 80, 25);
        passwordLabel.setFont(new Font("Serif", Font.PLAIN, 18)); // 改变字体
        passwordLabel.setForeground(Color.BLUE); // 改变字体颜色
        passwordLabel.setBorder(new EmptyBorder(0, 10, 0, 0)); // 改变字体间距
        panel.add(passwordLabel);

        // 密码文本域
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(150, 100, 165, 25);
        passwordText.setFont(new Font("Serif", Font.PLAIN, 18)); // 改变字体
        passwordText.setForeground(Color.BLUE); // 改变字体颜色
        passwordText.setBorder(new EmptyBorder(0, 10, 0, 0)); // 改变字体间距
        panel.add(passwordText);

        // 登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setBounds(150, 150, 80, 25);
        loginButton.setFont(new Font("Serif", Font.PLAIN, 18)); // 改变字体
        loginButton.setForeground(Color.RED); // 改变字体颜色
        loginButton.setBorder(new EmptyBorder(0, 10, 0, 0)); // 改变字体间距
        panel.add(loginButton);
    }
}