package com.mycompany.bibliotecadanielrincon;

import java.util.ArrayList;

public class Biblioteca implements MetodosBiblioteca {
    private ArrayList<Recurso> recursoDisponible;

    public Biblioteca() {
        this.recursoDisponible = new ArrayList<>();
    }

    @Override
    public void agregarRecurso(Recurso recurso) {
        for (Recurso recursoExistente : recursoDisponible) {
            if (recursoExistente.getId() == (recurso.getId())) {
                System.out.println("No se pudo agregar el recurso porque ya existe uno con igual d.");
                return;
            } else {
            }
        }
        recursoDisponible.add(recurso);
        System.out.println("recurso agregado exitosamente");
    }

    @Override
    public void prestarRecurso(int id) {
        for (Recurso recursoExistente : recursoDisponible) {
            if (recursoExistente.getId() == id && recursoExistente.isDisponible() == true) {
                System.out.println("Prestando el recurso");
                recursoExistente.setDisponible(false);
            } else {
                System.out.println("El recurso no esta disponible");
            }
        }
    }

    @Override
    public void buscarRecursoPorTitulo(String titulo) {
        if (recursoDisponible.contains(titulo)) {
            for (Recurso recursoExistente : recursoDisponible) {
                if (recursoExistente.getTitulo().equals(titulo)) {
                    System.out.println(
                            "Recurso{" + 
                                "id=" + recursoExistente.getId() + 
                                ", titulo=" + recursoExistente.getTitulo() + 
                                ", disponible=" + recursoExistente.isDisponible() + '}');
                    }
            }
        } else {
            System.out.println("nombre de titulo invalido");
        }
    }
}
