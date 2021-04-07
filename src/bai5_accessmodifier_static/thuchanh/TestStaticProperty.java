package bai5_accessmodifier_static.thuchanh;

public class TestStaticProperty {
    public TestStaticProperty() {
    }

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numOfCars);
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.numOfCars);
    }
}
