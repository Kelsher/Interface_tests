import javax.swing.*;

public class MainFrame extends JFrame{
    public static final int HEIGHT = 220;
    public static final int WIDTH = 300;
    public static final int BORDER_SIZE = 25;

    public MainFrame(String title){
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setTitle(title);
        this.setSize(this.WIDTH, this.HEIGHT);
        this.setLayout(null);

        JLabel usernamelabel = new JLabel("Username: ");
        usernamelabel.setBounds(this.BORDER_SIZE, this.BORDER_SIZE, 70, 30);
        this.add(usernamelabel);

        JTextField usernameField = new JTextField();
        usernameField.setName("username");
        usernameField.setBounds(this.BORDER_SIZE+usernamelabel.getWidth()+5, BORDER_SIZE, 145, 30);
        this.add(usernameField);

        
    }
}
