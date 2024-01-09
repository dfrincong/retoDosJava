package com.mycompany.bibliotecadanielrincon;

public class Main {

    public static void main(String[] args) {
        TipoRevista tipoRevista1 = new TipoRevista();
        
        tipoRevista1.agregarTipoRevista(1, "Informativa");
        tipoRevista1.agregarTipoRevista(2, "Entretenimiento");
        tipoRevista1.agregarTipoRevista(3, "Deportes");
        tipoRevista1.agregarTipoRevista(4, "Salud");
        tipoRevista1.agregarTipoRevista(5, "Arte");
        
        Recurso recurso1 = new Libro("Gabriel Garcia Marquez", 1, "Cien años de soledad", true);
        Recurso recurso2 = new Libro("Rafael Pombo", 2, "El renacuajo paseador", true);
        Recurso recurso3 = new Libro("Agustin Laje", 3, "Batalla Cultural", false);
        
        Recurso recurso4 = new Revista(15, tipoRevista1, 0001, "Semana", true);
        
        Biblioteca biblioteca1 = new Biblioteca();
        biblioteca1.agregarRecurso(recurso1);
        biblioteca1.agregarRecurso(recurso2);
        biblioteca1.agregarRecurso(recurso3);
        biblioteca1.agregarRecurso(recurso4);
    }
    
}
