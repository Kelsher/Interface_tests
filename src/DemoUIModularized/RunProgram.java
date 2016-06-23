package DemoUIModularized;

public class RunProgram {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(666);
        customer.setFirstname("Lewis");
        customer.setSurname("Pettifer");
        customer.setAddress("Hell");
        customer.setPhonenumber("0800-666-666");
        customer.setNotes("Satan");

        Order order = new Order();
        order.setId(383532);
        order.setCustomer(customer);

        OrderDetailFrame odf = new OrderDetailFrame(order);
    }
}
