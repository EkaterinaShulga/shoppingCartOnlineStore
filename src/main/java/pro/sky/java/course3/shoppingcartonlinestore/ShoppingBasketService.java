package pro.sky.java.course3.shoppingcartonlinestore;

import java.util.List;

public interface ShoppingBasketService {
    List<Item> addProduct(List<Item> name);

    List<Item> getBasket();
}
