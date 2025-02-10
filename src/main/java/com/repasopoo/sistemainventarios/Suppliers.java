package com.repasopoo.sistemainventarios;

public class Suppliers {
    private int proveedorid;
    private String nombreProveedor;
    private String productsName;
    private String contact;

    public Suppliers() {
    }

    public Suppliers(int proveedorid, String nombreProveedor, String productsName, String contact) {
        this.proveedorid = proveedorid;
        this.nombreProveedor = nombreProveedor;
        this.productsName = productsName;
        this.contact = contact;
    }

    public int getProveedorid() {
        return proveedorid;
    }

    public void setProveedorid(int proveedorid) {
        this.proveedorid = proveedorid;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
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
        return "Suppliers{" + "proveedorid=" + proveedorid + ", nombreProveedor=" + nombreProveedor + ", productsName=" + productsName + ", contact=" + contact + '}';
    }

    
    
    
}
