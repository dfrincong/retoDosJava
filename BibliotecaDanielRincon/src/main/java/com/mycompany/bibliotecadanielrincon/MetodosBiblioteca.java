package com.mycompany.bibliotecadanielrincon;

public interface MetodosBiblioteca {
    void agregarRecurso(Recurso recurso);
    void prestarRecurso(int id);
    void buscarRecursoPorTitulo(String titulo);
}
