package web.model;

public class Car {
    private String model;
    private int yearOfAssembly;
    private int mileage;

    public Car() {
    }

    public Car(String model, int yearOfAssembly, int mileage) {
        this.model = model;
        this.yearOfAssembly = yearOfAssembly;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfAssembly() {
        return yearOfAssembly;
    }

    public void setYearOfAssembly(int yearOfAssembly) {
        this.yearOfAssembly = yearOfAssembly;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfAssembly=" + yearOfAssembly +
                ", mileage=" + mileage +
                '}';
    }
}
