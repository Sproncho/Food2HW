package telran.product.controller;

import telran.product.model.Food;
import telran.product.model.MeatFood;
import telran.product.model.MilkFood;
import telran.product.model.Product;

public class ProductAppl {
    public static void main(String[] args) {
        Product bycicleStels = new Product("12321","bycicle Stels",123);
        Product bycicleStels1 = new Product("12321","bycicle Stels",244);
        System.out.println(bycicleStels.equals(bycicleStels1));//right: true
        System.out.println();
        Food pizza = new Food("12312","pizza",234,false,"22.02.2003");
        Food pizza1 = new Food("1222","pizza",234,true,"22.02.2003");
        Food pizza2 = new Food("123","pizza",212,true,"22.02.2003");
        System.out.println(pizza.equals(pizza1));//right:false
        System.out.println(pizza1.equals(pizza2));//right:true
        System.out.println();
        MeatFood meat = new MeatFood("123","Meat",21,true,"22/03/1211","Cow");
        MeatFood meat1 = new MeatFood("123","Meat",21,true,"22/03/1211","Chicken");
        System.out.println(meat.equals(meat1));//false
        System.out.println();
        MilkFood milk = new MilkFood("243","Milk",23,true,"22/03/1211","Goose",1);
        MilkFood milk1 = new MilkFood("214","Milk",240,true,"22/03/2122","Goose",1);
        MilkFood milk2 = new MilkFood("243","Milk",23,true,"22/03/1211","Goose",2);
        System.out.println(milk.equals(milk1));//right:true
        System.out.println(milk.equals(milk2));//right:false
    }
    private static double calcSumKosherPrice(Product[] products){
        double res = 0;
        for (int i = 0; i < products.length; i++) {
            if(products[i] instanceof Food && ((Food) products[i]).isKosher() ){
                res += products[i].getPrice();
            }
        }
        return res;
    }
}
