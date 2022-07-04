package pro.sky.java.course3.shoppingcartonlinestore;


public class Item {
    private final String nameItem;

    public Item(String nameItem) {
        this.nameItem = nameItem;
    }

    @Override
    public String toString() {
        return "товар " + nameItem;
    }
}
