package DemoUIModularized;

import javax.swing.*;

public class OrderDetailFrame extends JFrame{


    private static final int WIDTH = 300;
    private static final int HEIGHT = 400;

    public OrderDetailFrame(Order order){
        super();

        this.setLayout(null);
        this.setSize(this.WIDTH, this.HEIGHT);

        CustomerInfoPanel ciPanel = new CustomerInfoPanel(order.getCustomer());
        ciPanel.setBounds(30, 30, ciPanel.WIDTH, ciPanel.HEIGHT);
        this.add(ciPanel);

        this.setVisible(true);
    }
}
