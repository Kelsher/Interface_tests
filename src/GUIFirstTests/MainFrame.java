package GUIFirstTests;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    public static final int HEIGHT = 220;
    public static final int WIDTH = 300;
    public static final int BORDER_SIZE = 25;
    public static final int ITEM_SIZE = 30;

    public MainFrame(String title){
        super();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        this.setTitle(title);
        this.setSize(this.WIDTH, this.HEIGHT);
        this.setLayout(null);

        JLabel usernamelabel = new JLabel("Username: ");
        usernamelabel.setBounds(this.BORDER_SIZE, this.BORDER_SIZE, 70, ITEM_SIZE);
        this.add(usernamelabel);

        JTextField usernameField = new JTextField();
        usernameField.setName("username");
        usernameField.setBounds(this.BORDER_SIZE+usernamelabel.getWidth()+5, BORDER_SIZE, 145, ITEM_SIZE);
        this.add(usernameField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(this.BORDER_SIZE, this.BORDER_SIZE+usernamelabel.getHeight()+5, 70, ITEM_SIZE);
        this.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setName("password");
        passwordField.setBounds(this.BORDER_SIZE+passwordLabel.getWidth()+5, this.BORDER_SIZE+usernameField.getHeight()+5, 145, ITEM_SIZE);
        this.add(passwordField);

        JButton loginButton = new JButton();
        loginButton.setText("login");
        loginButton.setBounds(100, 115, 100, ITEM_SIZE);
        this.add(loginButton);

        this.centreFrame();
        this.setVisible(true);
    }

    public void centreFrame(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int xPos = (dim.width/2) - (this.getSize().width/2);
        int yPos = (dim.height/2) - (this.getSize().width/2);

        this.setLocation(xPos, yPos);
    }
}
