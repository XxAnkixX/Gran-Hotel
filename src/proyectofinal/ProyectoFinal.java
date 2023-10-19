package proyectofinal;

import java.sql.Connection;
import proyectofinal.AccesoADatos.CategoriaData;
import proyectofinal.AccesoADatos.Conexion;
import proyectofinal.AccesoADatos.huespedData;
import proyectofinal.Entidades.Categoria;
import proyectofinal.Entidades.huesped;

public class ProyectoFinal {

    public static void main(String[] args) {
        Conexion.getConexion();
        huespedData x= new huespedData();
        huesped ej= new huesped(123, "Rodriguez", "Santiago", "Calle 2", "ej@hotmail.com", 1234567, true);
        huesped santiago= new huesped(321, "Gonzalez", "Horacio", "Calle 3", "horaciog@gmail.com", 7654321, true);
        huesped prueba= new huesped(101, "Ejemplo", "Damian", "Calle 4", "p@hotmail.com", 2345678, true);
        //x.agregarHuesped(ej);
        //x.agregarHuesped(santiago);
        //x.agregarHuesped(prueba);
        huesped ejemplo= new huesped(1234567, "Gonzalez", "Uriel", "Calle 7", "ejemplo@gmail.com", 1176588932, true);
        //x.agregarHuesped(ejemplo);
        
        CategoriaData y= new CategoriaData();
        
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
