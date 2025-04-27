
package Registros;

import java.util.ArrayList;

public class MantenimientoPerro {
    
    //USO DE COLECCIONES
    private ArrayList<Perro> listaPerros;

    // Constructor
    public MantenimientoPerro() {
        
        //Inicializa la coleccion
        listaPerros = new ArrayList<>();
    }
    
    //USO DE METODO SOBRECARGADO

    // Método sobrecargado para agregar un solo perro
    public void agregarPerro(Perro perro) {
        listaPerros.add(perro);  // Agregar un perro a la lista
    }

    // Método sobrecargado para agregar varios perros
    public void agregarPerro(Perro[] perros) {
        for(Perro perro : perros) {
            listaPerros.add(perro); // Agregar cada perro a la lista
        }
    }

    // Método para obtener todos los perros
    public ArrayList<Perro> obtenerPerros() {
        return listaPerros;
    }
}
