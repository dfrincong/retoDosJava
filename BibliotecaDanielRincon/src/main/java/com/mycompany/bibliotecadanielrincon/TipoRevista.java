package com.mycompany.bibliotecadanielrincon;

import java.util.HashMap;
import java.util.Map;

public class TipoRevista {
    private Map<Integer,String> tipoRevista;

    public TipoRevista() {
        this.tipoRevista = new HashMap<>();
    }
    
    public void agregarTipoRevista(int id, String tipoRevista) {
        if (this.tipoRevista.containsKey(id)) {
            System.out.println("NO se puede agregar una tipoRevista con este id porque ya existe.");
            return;
        }
        this.tipoRevista.put(id, tipoRevista);
        System.out.println("tipoRevista con " + id + " agregada exitosamente");
    }
}
