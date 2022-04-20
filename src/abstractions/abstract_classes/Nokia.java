package abstractions.abstract_classes;

public class Nokia extends Phone {

    public Nokia (String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Nokia calls");
    }

    @Override
    public void ring() {
        System.out.println("Nokia rings");
    }

    @Override
    public void text() {
        System.out.println("Nokia texts");
    }

    public static final String OS = "Android";

    @Override
    public boolean isConvertible() {
        return false;
    }
}
