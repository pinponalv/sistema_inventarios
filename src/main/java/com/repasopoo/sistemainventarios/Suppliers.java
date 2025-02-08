package com.repasopoo.sistemainventarios;

public class Suppliers {
    private String productsName;
    private String contact;

    public Suppliers() {
    }

    public Suppliers(String productsName, String contact) {
        this.productsName = productsName;
        this.contact = contact;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Suppliers{" + "productsName=" + productsName + ", contact=" + contact + '}';
    }
    
    
}
