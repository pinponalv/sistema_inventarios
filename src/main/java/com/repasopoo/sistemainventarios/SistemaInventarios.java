package com.repasopoo.sistemainventarios;

public class SistemaInventarios {

    public static void main(String[] args) {
        Customers cliente = new Customers(1, "Juancho");
        Customers cliente2 = new Customers(2, "Oscar");
        Gestor gstr = new Gestor();
        Products prdct1 = new Products(1, "RTX 4090", 10, 500);
        Products prdct2 = new Products(2, "Intel Core i9-13900K", 15, 600);
        Products prdct3 = new Products(3, "AMD Ryzen 9 7950X", 12, 550);
        Products prdct4 = new Products(4, "ASUS ROG Strix Z790-E", 8, 400);
        Products prdct5 = new Products(5, "Corsair Vengeance 32GB DDR5", 20, 150);
        Products prdct6 = new Products(6, "Samsung 990 Pro 1TB NVMe", 25, 200);
        Products prdct7 = new Products(7, "NZXT Kraken Z73 RGB", 10, 250);
        Products prdct8 = new Products(8, "Corsair RM1000x 1000W PSU", 18, 180);
        Products prdct9 = new Products(9, "Lian Li PC-O11 Dynamic", 10, 160);
        Products prdct10 = new Products(10, "Noctua NH-D15", 14, 100);

        //proveedores
        Suppliers suppli1 = new Suppliers(1, "Intel-Jose Alfredo", "Procesadores intel", "66665482");
        Suppliers suppli2 = new Suppliers(2, "Nvidia-Juan Gomez", "Graficas", "8656486");

        gstr.agregarProductos(prdct1);
        gstr.agregarProductos(prdct2);
        gstr.agregarProductos(prdct3);
        gstr.agregarProductos(prdct4);
        gstr.agregarProductos(prdct5);
        gstr.agregarProductos(prdct6);
        gstr.agregarProductos(prdct7);
        gstr.agregarProductos(prdct8);
        gstr.agregarProductos(prdct9);
        gstr.agregarProductos(prdct10);
        
        
        gstr.agregarProveedor(suppli1);
        gstr.agregarProveedor(suppli2);
        
        
        gstr.listarProductos();
        gstr.listarProveedores();
        
        gstr.eliminarProveedor(2);
        gstr.listarProveedores();
        
        
        gstr.realizarPedido(cliente, "rtx 4090", 10);
        gstr.realizarPedido(cliente2, "rtx 4090", 1);
        
    }
}
