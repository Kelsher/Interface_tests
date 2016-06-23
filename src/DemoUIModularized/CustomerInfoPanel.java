package DemoUIModularized;

import javax.swing.*;

public class CustomerInfoPanel extends JPanel{

    public static final int HEIGHT = 450;
    public static final int WIDTH = 400;

    public CustomerInfoPanel(Customer customer){
        super();

        this.setLayout(null);
        this.setSize(this.WIDTH, this.HEIGHT);

        JLabel title = new JLabel("Customer details: ");
        title.setBounds(30, 30, this.WIDTH, 45);

        JLabel nameLabel = new JLabel();
        nameLabel.setText("Name: " + customer.getFirstname() + " " + customer.getSurname());
        nameLabel.setBounds(75, 75, 150, 30);

        this.add(title);
        this.add(nameLabel);

        this.setVisible(true);
    }
}
