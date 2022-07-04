package pro.sky.java.course3.shoppingcartonlinestore;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingBasketServiceImpl implements ShoppingBasketService {

    private final Basket basket;

    public ShoppingBasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Item> addProduct(List<Item> name) {
        return basket.addProduct(name);

    }

    @Override
    public List<Item> getBasket() {
        return basket.getProduct();

    }
}

