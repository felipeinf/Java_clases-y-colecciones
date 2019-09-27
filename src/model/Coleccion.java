package model;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

/**
 *
 * @author Felipe Concha Almeida
 */
public class Coleccion {
    private ArrayList<Object> coleccion;
    
    public Coleccion(){
        this.coleccion = new ArrayList<Object>();
    }
    
    public int totalElementos(){
        return coleccion.size();
    }
    
    public boolean agregar(Object objeto){
        return coleccion.add(objeto);
    }
    
    public Object obtenerElemento(int posicion){
        return coleccion.get(posicion);
    }
    
    public ArrayList<Object> obtenerElementos(){
        return coleccion;
    }
    
    public Object eliminar(int posicion){ 
        return coleccion.remove(posicion);
    }
}
