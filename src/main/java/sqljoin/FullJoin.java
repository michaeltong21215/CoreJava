package sqljoin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FullJoin {
    public static void main(String[] args) {
        Map<Integer, String> firstBasket = new HashMap();
        Map<Integer, String> secondBasket = new HashMap();
        List<InnerJoinResultSet> basketResultSet = new ArrayList();
        firstBasket.put(1, "Apple");
        firstBasket.put(2, "Orange");
        firstBasket.put(3, "Banana");
        firstBasket.put(4, "Cucumber");

        secondBasket.put(1, "Orange");
        secondBasket.put(2, "Apple");
        secondBasket.put(3, "Watermelon");
        secondBasket.put(4, "Pear");

        firstBasket.forEach((aBasketKey, aFruit) -> {
            secondBasket.forEach((bBasketKey, bFruit) -> {
                if (aFruit.equals(bFruit)) {
                    InnerJoinResultSet resultSet = new InnerJoinResultSet(aBasketKey, bBasketKey, aFruit, bFruit);
                    basketResultSet.add(resultSet);
                }
            });
        });

        secondBasket.forEach((bBasketKey, bFruit) -> {
            if (!firstBasket.containsValue(bFruit)) {
                InnerJoinResultSet resultSet = new InnerJoinResultSet(0, bBasketKey, null, bFruit);
                basketResultSet.add(resultSet);
            }
        });

        firstBasket.forEach((aBasketKey, aFruit) -> {
            if (!secondBasket.containsValue(aFruit)) {
                InnerJoinResultSet resultSet = new InnerJoinResultSet(aBasketKey, 0, aFruit, null);
                basketResultSet.add(resultSet);
            }
        });

        //firstBasket.putAll(secondBasket);
        //firstBasket.forEach((integer, s) -> System.out.println("key: " + integer + ", value: " + s));
        System.out.println("Full Join ResultSet: ");
        basketResultSet.forEach(innerJoinResultSet -> System.out.println(innerJoinResultSet.toString()));
    }
}
