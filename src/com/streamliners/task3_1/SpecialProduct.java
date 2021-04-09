package com.streamliners.task3_1;

public class SpecialProduct extends Product {
    int regularPrice;
    int percentageOff;
    public SpecialProduct(String name,int price){
        super(name,price);
    }
    @Override
    public String toString() {
        return  String.format("Name:%s , Rs.:%d , regularPrice:%d and percentageOff:%d",this.name,this.price,this.regularPrice,this.percentageOff);
    }

    public static SpecialProduct applyOffOnProduct(Product product, int percentageOff){
        int discountedPrice = ((product.price) - (product.price * percentageOff/100));
        SpecialProduct specialProduct = new SpecialProduct(product.name,discountedPrice);
        specialProduct.regularPrice = product.price;
        specialProduct.percentageOff = percentageOff;
        return specialProduct;

    }

}
