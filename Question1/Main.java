package Question1;

public class Main {

    public static void main(String[] args) {


        Customer customer1 = new Customer("John", "Doe", "123-45-6789");
        Address billing1 = new Address("123 Billing St", "Chicago", "IL", "12345");
        Address shipping1 = new Address("456 Shipping Ln", "New York", "NY", "67890");
        customer1.setBillingAddress(billing1);
        customer1.setShippingAddress(shipping1);

        Customer customer2 = new Customer("Alice", "Smith", "234-56-7890");
        Address billing2 = new Address("789 Billing Rd", "Los Angeles", "CA", "12367");
        Address shipping2 = new Address("012 Shipping Rd", "Chicago", "IL", "78901");
        customer2.setBillingAddress(billing2);
        customer2.setShippingAddress(shipping2);

        Customer customer3 = new Customer("Bob", "Johnson", "345-67-8901");
        Address billing3 = new Address("345 Billing Ln", "Chicago", "IL", "78934");
        Address shipping3 = new Address("678 Shipping St", "Dallas", "TX", "89012");
        customer3.setBillingAddress(billing3);
        customer3.setShippingAddress(shipping3);


        Customer[] customers = {customer1, customer2, customer3};


        for (Customer customer : customers) {
            if (customer.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(customer);
            }
        }
    }
}
