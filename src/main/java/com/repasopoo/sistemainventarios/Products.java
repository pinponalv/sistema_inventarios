package com.repasopoo.sistemainventarios;

public class Products {
    
    private int id;
    private String nameProducts;
    private int stock;
    private double price;

    public Products() {
    }

    public Products(int id, String nameProducts, int stock, double price) {
        this.id = id;
        this.nameProducts = nameProducts;
        this.stock = stock;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getNameProducts() {
        return nameProducts;
    }

    public void setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean reducirStock(int cantidad) {
        if(cantidad > stock){
            System.out.println("Stock insuficiente" + nameProducts);
            return false;
        }else{
            stock -= cantidad;
            System.out.println("Stock restante: " + stock);
            return true;
        }
        
        
    }

    @Override
    public String toString() {
        return "Products{" + "id=" + id + ", nameProducts=" + nameProducts + ", stock=" + stock + ", price=" + price + '}';
    }
}
