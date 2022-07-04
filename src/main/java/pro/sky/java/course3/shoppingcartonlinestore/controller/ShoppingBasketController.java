package pro.sky.java.course3.shoppingcartonlinestore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course3.shoppingcartonlinestore.Item;
import pro.sky.java.course3.shoppingcartonlinestore.ShoppingBasketService;


import java.util.List;

@RestController
@RequestMapping(path = "store/order")
public class ShoppingBasketController {

    private final ShoppingBasketService shoppingBasketService;

    public ShoppingBasketController(ShoppingBasketService shoppingBasketService) {
        this.shoppingBasketService = shoppingBasketService;
    }

    @GetMapping(path = "add")
    public String addShoppingCart(@RequestParam List<Item> name) {
        return "В корзину добавлен товар: " + shoppingBasketService.addProduct(name);
    }

    @GetMapping(path = "get")
    public String getBasket() {
        return "Содержание корзины: " + shoppingBasketService.getBasket();
    }


}


