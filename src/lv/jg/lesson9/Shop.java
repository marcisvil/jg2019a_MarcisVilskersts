package lv.jg.lesson9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> products = new ArrayList<>();

    public void showAllProductList(List<Product> products) {
        products.stream().forEach(product -> System.out.println(product.getName() + " " + product.getPrice()));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addAllProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void findProduct(String productName) {
        for (Product product : products) {

            if ((product.getName()).equals(productName)) {
                System.out.println(product.getName() + " " + product.getPrice());
            }
        }
    }

    public void findProductInPriceRange(BigDecimal min, BigDecimal max){
        for (Product product : products) {

            if (product.getPrice().compareTo(max)==-1&&product.getPrice().compareTo(min)==1){
                System.out.println(product.getName() + " " + product.getPrice());
            }
        }
    }

    public static void main(String[] args) {

        Shop shop = new Shop();

        BigDecimal price = new BigDecimal("45.14");
        BigDecimal price2 = new BigDecimal("25.14");

        Product beer = new Product("beer", price);
        Product bread = new Product("bread", price2);

        List<Product> hiddenSupply = new ArrayList<>();
        hiddenSupply.add(bread);

        BigDecimal minPrice = new BigDecimal("20");
        BigDecimal maxPrice = new BigDecimal("30");

        shop.addProduct(beer);
        shop.showAllProductList(shop.products);
        System.out.println();
        shop.findProduct("beer");
        shop.addAllProducts(hiddenSupply);
        shop.showAllProductList(shop.products);
        System.out.println();
        shop.findProductInPriceRange(minPrice,maxPrice);


    }
}
