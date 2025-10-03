import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;

    public RentalAgency() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean rentCarToCustomer(int carId, int customerId) {
        Car car = findCarById(carId);
        Customer customer = findCustomerById(customerId);

        if (car != null && customer != null && car.isAvailable()) {
            customer.rentCar(car);
            System.out.println("Car rented successfully.");
            return true;
        } else {
            System.out.println("Car not available or customer not found.");
            return false;
        }
    }

    public boolean returnCarFromCustomer(int carId, int customerId) {
        Car car = findCarById(carId);
        Customer customer = findCustomerById(customerId);

        if (car != null && customer != null) {
            customer.returnCar(car);
            System.out.println("Car returned successfully.");
            return true;
        } else {
            System.out.println("Car or customer not found.");
            return false;
        }
    }

    private Car findCarById(int carId) {
        for (Car car : cars) {
            if (car.getCarId() == carId) return car;
        }
        return null;
    }

    private Customer findCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) return customer;
        }
        return null;
    }
}