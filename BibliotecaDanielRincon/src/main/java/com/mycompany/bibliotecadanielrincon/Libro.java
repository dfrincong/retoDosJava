package com.mycompany.bibliotecadanielrincon;

public class Libro extends Recurso {
    private String autor;

    public Libro(String autor, int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    

    @Override
    public String toString() {
        return "Libro{" + 
                "id=" + super.getId() + 
                ", titulo=" + super.getTitulo() + 
                ", disponible=" + super.isDisponible() + 
                ", autor=" + autor + '}';
    }
}
