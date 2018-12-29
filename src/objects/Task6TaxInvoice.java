package objects;

public class Task6TaxInvoice {
    public static void main(String[] args) {
        Address address = new Address("00-010", "Warsaw");
        Client client = new Client("Jack", "Stone", address);
        Invoice invoice = new Invoice(client, 1, "29-12-2018",9348);

        System.out.println(invoice.calculateTax());
    }

}
