package homework;

import primitives.Int;

import java.util.*;

public class Homework23 {

    // TASK 01
    public static LinkedList<String> parseData (Map<Integer, String> parseMap) {

        LinkedList<String> list = new LinkedList<>();

        for (Map.Entry<Integer, String> parse : parseMap.entrySet()) {
            String s = parse.getKey() + " = " + parse.getValue();
            list.add(parse.getKey() + " = " + parse.getValue());
        }
        return list;
    }

    // TASK 02
    public static double calculateTotalPrice1 (double appleAmnt, double orangeAmnt, double mangoAmnt, double pineappleAmnt) {

        Map<String, Double> priceMap = new TreeMap<>();
        priceMap.put("Apple", 2.00);
        priceMap.put("Orange", 3.29);
        priceMap.put("Mango", 4.99);
        priceMap.put("Pineapple", 5.25);

        return (priceMap.get("Apple") * appleAmnt) + (priceMap.get("Orange") * orangeAmnt)
                + (priceMap.get("Mango") * mangoAmnt) + (priceMap.get("Pineapple") * pineappleAmnt);
    }

    // TASK 03
    public static double calculateTotalPrice2 (double appleAmnt, double orangeAmnt, double mangoAmnt) {

        Map<String, Double> priceMap = new TreeMap<>();
        priceMap.put("Apple", 2.00);
        priceMap.put("Orange", 3.29);
        priceMap.put("Mango", 4.99);

        double appleDiscount = 1;
        if (appleAmnt % 2 == 0) appleDiscount = 0.75;
        else if (appleAmnt % 3 == 0) appleDiscount = 5.0 / 6.0;

        double freeMangoAmnt = 0;
        if (mangoAmnt % 4 == 0) freeMangoAmnt = mangoAmnt / 4;


        double applePrice = (priceMap.get("Apple") * appleAmnt) * appleDiscount;
        double orangePrice = (priceMap.get("Orange") * orangeAmnt);
        double mangoPrice = (priceMap.get("Mango") * mangoAmnt) - (priceMap.get("Mango") * freeMangoAmnt);
        return applePrice + orangePrice + mangoPrice;
    }


    public static void main(String[] args) {

        // TASK 01
        Map<Integer, String> parseMap = new TreeMap<>();
        parseMap.put(104, "LA");
        parseMap.put(103, "Paris");
        parseMap.put(102, "Berlin");
        parseMap.put(101, "Chicago");
        parseMap.put(100, "London");

        System.out.println(parseData(parseMap));

        // TASK 02
        System.out.println(calculateTotalPrice1(3,0,1,0));

        // TASK 03
        System.out.println(calculateTotalPrice2(3,0,5));
    }
}
