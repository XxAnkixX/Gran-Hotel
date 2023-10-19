package proyectofinal;

import java.sql.Connection;
import proyectofinal.AccesoADatos.CategoriaData;
import proyectofinal.AccesoADatos.Conexion;
import proyectofinal.AccesoADatos.habitacionData;
import proyectofinal.AccesoADatos.huespedData;
import proyectofinal.Entidades.Categoria;
import proyectofinal.Entidades.habitaciones;
import proyectofinal.Entidades.huesped;

public class ProyectoFinal {

    public static void main(String[] args) {
        Conexion.getConexion();
        huespedData x= new huespedData();
        CategoriaData y= new CategoriaData();
        habitacionData z= new habitacionData();
        
        habitaciones test= new habitaciones(221, false);
        z.agregarHabitacion(test);
        
    Categoria A = new Categoria(211, 2, 1, 1, 0);
    Categoria B = new Categoria(221, 2, 2, 1, 0);
    Categoria C = new Categoria(212, 2, 1, 2, 0);
    //---------------Habitaciones Dobles--------------------------
    Categoria D = new Categoria(421, 4, 2, 1, 0);
    Categoria E = new Categoria(422, 4, 2, 2, 0);
    Categoria F = new Categoria(441, 4, 4, 1, 0);
    //---------------Habitaciones Triples--------------------------
    Categoria G = new Categoria(631, 6, 3, 1, 0);
    Categoria H = new Categoria(632, 6, 3, 2, 0);
    Categoria I = new Categoria(661, 6, 6, 1, 0);
    //---------------Suite Lujo--------------------------
    Categoria J = new Categoria(213, 2, 1, 3, 0);
    Categoria K = new Categoria(223, 2, 2, 3, 0);
    
    /*y.agregarCategoria(A);
    y.agregarCategoria(B);
    y.agregarCategoria(C);
    y.agregarCategoria(D);
    y.agregarCategoria(E);
    y.agregarCategoria(F);
    y.agregarCategoria(G);
    y.agregarCategoria(H);
    y.agregarCategoria(I);
    y.agregarCategoria(J);
    y.agregarCategoria(K);*/
    
        
        
    }
    
}
