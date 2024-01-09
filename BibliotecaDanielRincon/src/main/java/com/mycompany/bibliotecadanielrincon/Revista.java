package com.mycompany.bibliotecadanielrincon;

public class Revista extends Recurso {
    private int numero;
    private TipoRevista tipo;

    public Revista(int numero, TipoRevista tipo, int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoRevista getTipo() {
        return tipo;
    }

    public void setTipo(TipoRevista tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Revista{" + 
                "id=" + super.getId() + 
                ", titulo=" + super.getTitulo() + 
                ", disponible=" + super.isDisponible() + 
                "número=" +numero + 
                "tipo=" +tipo + '}';
    }
}
