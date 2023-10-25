package proyectofinal;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import proyectofinal.AccesoADatos.CategoriaData;
import proyectofinal.AccesoADatos.Conexion;
import proyectofinal.AccesoADatos.ReservaData;
import proyectofinal.AccesoADatos.habitacionData;
import proyectofinal.AccesoADatos.huespedData;
import proyectofinal.Entidades.Categoria;
import proyectofinal.Entidades.Reserva;
import proyectofinal.Entidades.habitaciones;
import proyectofinal.Entidades.huesped;

public class ProyectoFinal {

    public static void main(String[] args) {
        Conexion.getConexion();
          huespedData x = new huespedData();
//        huesped ej = new huesped(123, "Rodriguez", "Santiago", "Calle 2", "ej@hotmail.com", 1234567, true);
//        huesped santiago = new huesped(321, "Gonzalez", "Horacio", "Calle 3", "horaciog@gmail.com", 7654321, true);
//        huesped prueba = new huesped(101, "Ejemplo", "Damian", "Calle 4", "p@hotmail.com", 2345678, true);
//        //x.agregarHuesped(ej);
//        x.agregarHuesped(santiago);
//        //x.agregarHuesped(prueba);
//          huesped ejemplo = new huesped(1234567, "Gonzalez", "Uriel", "Calle 7", "ejemplo@gmail.com", 1176588932, true);
//        //x.agregarHuesped(ejemplo);
//
//        CategoriaData y = new CategoriaData();
//
//        Categoria A = new Categoria(211, 2, 1, 1, 0);
//        Categoria B = new Categoria(221, 2, 2, 1, 0);
//        Categoria C = new Categoria(212, 2, 1, 2, 0);
//        //---------------Habitaciones Dobles--------------------------
//        Categoria D = new Categoria(421, 4, 2, 1, 0);
//        Categoria E = new Categoria(422, 4, 2, 2, 0);
//        Categoria F = new Categoria(441, 4, 4, 1, 0);
//        //---------------Habitaciones Triples--------------------------
//        Categoria G = new Categoria(631, 6, 3, 1, 0);
//        Categoria H = new Categoria(632, 6, 3, 2, 0);
//        Categoria I = new Categoria(661, 6, 6, 1, 0);
//        //---------------Suite Lujo--------------------------
//        Categoria J = new Categoria(213, 2, 1, 3, 0);
//        Categoria K = new Categoria(223, 2, 2, 3, 0);
//
//        y.agregarCategoria(A);
//        y.agregarCategoria(B);
//        y.agregarCategoria(C);
//        y.agregarCategoria(D);
//        y.agregarCategoria(E);
//        y.agregarCategoria(F);
//        y.agregarCategoria(G);
//        y.agregarCategoria(H);
//        y.agregarCategoria(I);
//        y.agregarCategoria(J);
//        y.agregarCategoria(K);
//        CategoriaData modPrecio = new CategoriaData();
        habitacionData data = new habitacionData();
//        habitaciones habitacionSimple1 = new habitaciones(211, true, 50);
//        habitaciones habitacionSimple2 = new habitaciones(221, true, 0);
//        habitaciones habitacionSimple3 = new habitaciones(212, true, 0);
//        int i;
//        for (i = 1; i <= 35; i++) {
//            data.agregarHabitacion(habitacionSimple1);
//        }
//
//        
//        for (i = 36; i <= 70; i++) {
//            data.agregarHabitacion(habitacionSimple2);
//        }
//
//        for (i = 71; i <= 100; i++) {
//            data.agregarHabitacion(habitacionSimple3);
//        }
//
//        habitaciones habitacionDoble1 = new habitaciones(421, true, 0);
//        habitaciones habitacionDoble2 = new habitaciones(422, true, 0);
//        habitaciones habitacionDoble3 = new habitaciones(441, true, 0);
//        for (i = 101; i <= 120; i++) {
//            
//            data.agregarHabitacion(habitacionDoble1);
//        }
//        for (i = 121; i <= 140; i++) {
//            
//            data.agregarHabitacion(habitacionDoble2);
//        }
//        for (i = 141; i <= 150; i++) {
//            
//            data.agregarHabitacion(habitacionDoble3);
//        }
//
//       habitaciones habitacionTriple1 = new habitaciones(631, true, 0);
//        habitaciones habitacionTriple2 = new habitaciones(632, true, 0);
//        habitaciones habitacionTriple3 = new habitaciones(661, true, 0);
//        for (i = 151; i <= 165; i++) {
//            
//            data.agregarHabitacion(habitacionTriple1);
//        }
//        for (i = 166; i <= 180; i++) {
//            
//            data.agregarHabitacion(habitacionTriple2);
//        }
//        for (i = 181; i <= 190; i++) {
//            
//            data.agregarHabitacion(habitacionTriple3);
//        }
//        
//         habitaciones habitacionSuite = new habitaciones(213, true, 0);
//        habitaciones habitacionSuite2 = new habitaciones(223, true, 0);
//
//        for (i = 191; i <= 195; i++) {
//            
//            data.agregarHabitacion(habitacionSuite);
//        }
//        for (i = 196; i <= 200; i++) {
//            
//            data.agregarHabitacion(habitacionSuite2);
//        }
List<habitaciones> listita= new ArrayList<>();
listita= data.listarHabitacionesDisponibles();
for (habitaciones habitacion : listita){
    System.out.println(habitacion);
    System.out.println(habitacion.getPrecio());
}

//    huesped P= x.buscarHuespedxDNI(1234567);
//    habitaciones B= data.buscarHabitacionxID(1);
//    
//    ReservaData reservacion= new ReservaData();
//    Reserva vacaciones= new Reserva(P, B, 2, LocalDate.of(2023, 10, 24), LocalDate.of(2023, 10, 31));
//    reservacion.agregarReserva(vacaciones);
    }

}
