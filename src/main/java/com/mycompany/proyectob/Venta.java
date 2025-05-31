
package com.mycompany.proyectob;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venta {
    private String Vendedor;
    private Libros libro;
    private int cantidad;
    private double total;
    private String nitCliente;
    private String nombreCliente;
    private String direccionCliente;
    private LocalDateTime fechaVenta;
    private double totalSinIva;
    
    

    public Venta(String Vendedor, Libros libro, int cantidad, String nitCliente, String nombreCliente, String direccionCliente) {
        this.Vendedor = Vendedor;
        this.libro = libro;
        this.cantidad = cantidad;
        this.nitCliente = nitCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.fechaVenta = LocalDateTime.now();
        this.totalSinIva = totalSinIva;
        
       
 

        double subtotal = libro.getPrecio() * cantidad;
            this.total = subtotal;
            
            double totalSinIva = getTotal() / 1.12;
            this.totalSinIva = totalSinIva;
        

    }
    
    public String getFechaFormateada(){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            return this.getFechaVenta().format(formatter);

    }
    
    public double getTotal() {
        return total;
    }

    public Libros getLibro() {
        return libro;
    }

    public int getCantidad() {
        return cantidad;
    }

    Object getVendedor() {
    return Vendedor;    }

    /**
     * @param Vendedor the Vendedor to set
     */
    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(Libros libro) {
        this.libro = libro;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the nitCliente
     */
    public String getNitCliente() {
        return nitCliente;
    }

    /**
     * @param nitCliente the nitCliente to set
     */
    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the direccionCliente
     */
    public String getDireccionCliente() {
        return direccionCliente;
    }

    /**
     * @param direccionCliente the direccionCliente to set
     */
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    /**
     * @return the fechaVenta
     */
    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }

    /**
     * @param fechaVenta the fechaVenta to set
     */
    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    /**
     * @return the totalSinIva
     */
    public double getTotalSinIva() {
        return totalSinIva;
    }

    /**
     * @param totalSinIva the totalSinIva to set
     */
    public void setTotalSinIva(double totalSinIva) {
        this.totalSinIva = totalSinIva;
    }
  

  
}