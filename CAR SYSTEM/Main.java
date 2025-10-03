public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        agency.addCar(new Car(1, "Toyota", "Corolla", 2020));
        agency.addCar(new Car(2, "Mistubishi", "Pajero", 2021));

        agency.addCustomer(new Customer(101, "Alice", "alice@example.com"));
        agency.addCustomer(new Customer(102, "Bob", "bob@example.com"));

        agency.rentCarToCustomer(1, 101);

        agency.rentCarToCustomer(1, 102);

        agency.returnCarFromCustomer(1, 101);

        agency.rentCarToCustomer(1, 102);
    }
}