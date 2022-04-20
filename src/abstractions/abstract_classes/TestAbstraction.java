package abstractions.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        iPhone i1 = new iPhone("Apple", "Silver", 128, 1000);

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(s1);
        phoneList.add(n1);
        phoneList.add(i1);

        /*
        Print all objects
        Find and print the most expensive phone -> "The most expensive phone is = IPhone"
        Find and print how many phones are convertible -> 2
        */

        int max = Integer.MIN_VALUE;
        Phone mostExpensive = null;

        int convertibleCount = 0;

        for (Phone phone : phoneList) {
            System.out.println(phone);

            if (phone.price > max) mostExpensive = phone;

            if (phone.isConvertible()) convertibleCount++;
        }

        System.out.println("The most expensive phone is: " + mostExpensive.getClass().getSimpleName());
        System.out.println(convertibleCount);

        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);
        System.out.println(iPhone.OS);
    }
}
