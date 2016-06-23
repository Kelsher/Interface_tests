package DemoUIModularized;

import javax.swing.*;

public class CustomerInfoPanel extends JPanel{

    public static final int HEIGHT = 400;
    public static final int WIDTH = 400;
    public static final int BORDER = 30;
    public static final int ITEM_HEIGHT = 30;

    public CustomerInfoPanel(Customer customer){
        super();

        this.setLayout(null);
        this.setBounds(0, 0,this.WIDTH, this.HEIGHT);

        JLabel title = new JLabel("Customer details: ");
        title.setBounds(0, 0, this.WIDTH, this.ITEM_HEIGHT);

        JLabel nameLabel = new JLabel("Name: " + customer.getFullName());
        nameLabel.setBounds(this.BORDER, this.ITEM_HEIGHT+5, 150, this.ITEM_HEIGHT);

        JLabel addressLabel = new JLabel("Address: " + customer.getAddress());
        addressLabel.setBounds(this.BORDER, 5+this.ITEM_HEIGHT*2, 150, this.ITEM_HEIGHT);

        this.add(title);
        this.add(nameLabel);
        this.add(addressLabel);

        this.setVisible(true);
    }
}
