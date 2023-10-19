package proyectofinal.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Reserva;
import proyectofinal.Entidades.habitaciones;
import proyectofinal.Entidades.huesped;

public class ReservaData {
    private Connection con= null;

    public ReservaData() {
        con= Conexion.getConexion();
    }
    
    public void agregarReserva(Reserva reserva, huesped huesped, habitaciones habitacion){
        String sql= "INSERT INTO reserva(idHuesped, idHabitacion, cantidadPersonas, fechaEntrada, fechaSalida) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, huesped.getDNI());
            int cant= reserva.getCantP();
            switch(cant){
                case 1:
                  int i= 1;
                  boolean ok= false;
                  while(i<=75 && ok== false){
                      if(habitacion.isDisponible()== true){
                          ps.setInt(2, i);
                          ok= true;
                      }else{
                          i= i+1;
                      }
                  }
                  if(ok== false){
                      JOptionPane.showMessageDialog(null, "No hay habitaciones disponibles para una unica persona");
                  }
        }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }
}
