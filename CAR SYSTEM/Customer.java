import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private List<Car> rentedCars;

    public Customer(int customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.rentedCars = new ArrayList<>();
    }

    public void rentCar(Car car) {
        rentedCars.add(car);
        car.rentCar();
    }

    public void returnCar(Car car) {
        rentedCars.remove(car);
        car.returnCar();
    }

    public int getCustomerId() {
        return customerId;
    }

    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Email: " + email;
    }
}