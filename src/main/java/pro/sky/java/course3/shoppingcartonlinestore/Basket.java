package pro.sky.java.course3.shoppingcartonlinestore;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
@SessionScope
public class Basket {

    private final List<Item> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public List<Item> addProduct(List<Item> name) {
        basket.addAll(name);
        return name;
    }

    public List<Item> getProduct() {
        return Collections.unmodifiableList(basket);

    }

}



