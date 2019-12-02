package lv.jg.lesson9;

import java.math.BigDecimal;
import java.util.List;

public class Product {

    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
