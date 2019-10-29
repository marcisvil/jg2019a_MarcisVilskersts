package lv.jg.lesson3;

//Ok
public class TestProduct {
    public static void main(String[] args) {
        Product product = new Product();


        product.setName("BRICK");
        product.setRegularPrice(23.20);
        product.setDiscount(50);

        //šai metodei ir jābūt pašā objektā
        printInformation(product);


    }

    public static void printInformation(Product product) {

        System.out.println("Product name - " + product.getName());
        System.out.println("Product's regular price is " + product.getRegularPrice());
        System.out.println("Its discount is " + product.getDiscount() + "%");
        System.out.println("So the final price is " + product.calculateActualPrice());
    }
}
