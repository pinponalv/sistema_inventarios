package com.repasopoo.sistemainventarios;

import java.util.LinkedList;

public class Gestor {
    //Uso linkedList porque es mejor para realizar operaciones frecuentes
    private LinkedList<Products> inventario = new LinkedList<>();
    private LinkedList<Suppliers> proveedores = new LinkedList<>();
    
    
    
    
    //Agregar un producto a mi lista
    public void agregarProductos(Products producto){
        inventario.add(producto);
    }
    
    
    //Eliminar producto de la lista
    public void eliminarProducto(int id){
        Products products = null;
        
        //Busca si existe en mi lista y lo guardo en mi variable auxiliar products 
        for(Products producto : inventario){
            if(producto.getId() == id){
                products = producto;
            }
        }
        
        //si es diferente de null entonces borrara ese registro
        if(products != null){
            inventario.remove(products);
            System.out.println("Producto con ID#" + id + " eliminado.");
        }else{
            System.out.println("Producto con ID#" + id + " no encontrado.");
        }
    }
    
    //Editar producto de la lista
    public void editarProducto(int id, String nameProducts, int stock, double price ){
        for(Products producto : inventario){
            if(producto.getId() == id){
                producto.setNameProducts(nameProducts);
                producto.setStock(stock);
                producto.setPrice(price);
                System.out.println("----Producto Actualizado----");
            }
        }
        System.out.println("----Producto con Id#" + id + " no existe.");
    }
    
    
    //Mostrar mis productos
    public void listarProductos(){
        System.out.println("---Lista Inventario---");
        for(Products pro : inventario){
            System.out.println("Productos: " + pro);
        }
    }
    
    
    //Proveedoresaaaaaaaaaaa
    //agregando proveedores
    public void agregarProveedor(Suppliers suppliers){
        proveedores.add(suppliers);
    }
    
    //eliminando proveedores
    public void eliminarProveedor(int proveedorid){
        
        
        Suppliers suppli = null;
        
        //si algun objeto de suppliers existen en mi lista proveedores la recorre
        for(Suppliers su : proveedores){
            //si el id es igual a mi id que le paso lo asigna a suppli
            if(su.getProveedorid() == proveedorid){
                suppli = su;
            }
        }
        
        //si es diferente de null remueve el registro
        if(suppli != null){
            //borra de la lista el registro con ese id
            proveedores.remove(suppli);
            System.out.println("Proveedor con id#" + proveedorid + " elimindo.");
        }else{
            System.out.println("Proveedor con id#" + proveedorid + " no se encontro.");
        }
        
    }
    
    //listando proveedores
    public void listarProveedores(){
        System.out.println("---Lista Proveedores---");
        for(Suppliers su: proveedores){
            System.out.println("Proveedores: " + su);
        }
    }
    
    //Realizar pedidos
    public boolean realizarPedido(Customers cliente, String nombreProducto, int cantidad){
        for(Products producto : inventario){
            if(producto.getNameProducts().equalsIgnoreCase(nombreProducto)){
                if(producto.reducirStock(cantidad)){
                    System.out.println(cliente.getName() + " ha comprado: " + cantidad + " " + nombreProducto + "(s)");
                    System.out.println("Stock restante de: " + nombreProducto + ": " + producto.getStock());
                    return true;
                }else{
                    System.out.println("No hay suficiente stock.");
                    return false;
                }
            }
        }
        System.out.println("El producto no existe.");
        return false;
    }
    
}
