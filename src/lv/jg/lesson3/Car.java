package lv.jg.lesson3;

//Ok
public class Car {

    //klases laukiem jābūt "private"
    String color;
    String manufacturer;
    int year;

     public void setColor(String color){
         this.color=color;
     }

     public String getColor(){
         return this.color;
     }


     public void setManufacturer(String manufacturer){
         this.manufacturer=manufacturer;
     }

     public String getManufacturer(){
         return this.manufacturer;
     }


     public void setYear(int year){
         this.year=year;
     }

     public int getYear(){
         return this.year;
     }


}
