package com.streamliners.task3_1;
public class Main {
    public static void main(String[] args) {
        Product pro1 = new Product("Lenovo",80000);
        Product pro2 = new Product("Apple",180000);
        Product pro3 = new Product("Asus",50000);
        System.out.println(pro1.equals(pro2));
        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(pro1,20);
        System.out.println(specialProduct);

    }
}
