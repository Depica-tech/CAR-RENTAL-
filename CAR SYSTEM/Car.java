public class Car {
    private int carId;
    private String make;
    private String model;
    private int year;
    private boolean isAvailable;

    // Constructor
    public Car(int carId, String make, String model, int year) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.isAvailable = true;
    }

    public void rentCar() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String toString() {
        return "Car ID: " + carId + ", " + make + " " + model + " (" + year + ") - " +
               (isAvailable ? "Available" : "Rented");
    }

    public int getCarId() {
        return carId;
    }
}