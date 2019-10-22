package lv.jg.lesson3;

//Ok
//lietojam "ctrl + alt + l"
public class Product {

    String name;
    double regularPrice;
    double discount;

    public void setName(String name){
        this.name=name;
    }

    public void setRegularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount){
        this.discount= discount;
    }

    public String getName(){
        return this.name;
    }

    public double getRegularPrice(){
        return this.regularPrice;
    }

    public double getDiscount(){
        return this.discount;
    }

    public double calculateActualPrice(){
        return regularPrice*((100-discount)/100);
    }

    //aizkomentēts kods ir jādzēš, tādu glabāt nevajag
   // public static void printInformation(Product product){

  //    System.out.println(product.getName());
 //       System.out.println(product.getRegularPrice());
  //      System.out.println(product.getDiscount());
  //  }
}
