package proyectofinal.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Reserva;
import proyectofinal.Entidades.habitaciones;
import proyectofinal.Entidades.huesped;

public class ReservaData {

    private Connection con = null;

    public ReservaData() {
        con = Conexion.getConexion();
    }

    public void agregarReserva(Reserva reserva) {

        String sql = "INSERT INTO reserva ( idHuesped, idHabitacion, cantidadPersonas, fechaEntrada, fechaSalida, importeTotal) VALUES (?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getCliente().getIdHuesped());
            ps.setInt(2, reserva.getCuarto().getIdHabitacion());
            ps.setInt(3, reserva.getCantP());
            //--------FECHA ENTRADA-SALIDA-----------------
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Period duracion = Period.between(reserva.getFechaEntrada(), reserva.getFechaSalida());
            ps.setDate(4, java.sql.Date.valueOf(reserva.getFechaEntrada()));
            ps.setDate(5, java.sql.Date.valueOf(reserva.getFechaSalida()));
            System.out.println(duracion.getDays());
            Double cant=(double) duracion.getDays();
            System.out.println(reserva.getCuarto().getPrecio()*cant);
            ps.setDouble(6, reserva.getCuarto().getPrecio() * cant);
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                String ej= "UPDATE habitaciones SET Disponibilidad WHERE idHabitacion=?";
                ps.setBoolean(1, false);
                JOptionPane.showMessageDialog(null, "Reserva completada");
            }else{
                JOptionPane.showMessageDialog(null, "La habitacion no está disponible.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de reservas "+ex.getMessage());
        }
    }
}
