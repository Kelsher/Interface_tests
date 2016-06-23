package DemoUIModularized;

import javax.swing.*;
import java.awt.*;

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

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
