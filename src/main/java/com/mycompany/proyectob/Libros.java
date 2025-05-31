
package com.mycompany.proyectob;


public class Libros {
    
    private String titulo;
    private String autor;
    private String genero;
    private Double precio;
    private int stock;

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the precio to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return this.titulo;
    }
    
}
