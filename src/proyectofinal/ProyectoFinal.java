package proyectofinal;

import java.sql.Connection;
import proyectofinal.AccesoADatos.Conexion;
import proyectofinal.AccesoADatos.huespedData;
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
    }
    
}
