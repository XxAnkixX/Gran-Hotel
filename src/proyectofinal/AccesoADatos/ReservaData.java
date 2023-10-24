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

    public void chequearReserva(Reserva reserva, huesped huesped, habitaciones habitacion) {
        String sql = "SELECT FROM `habitaciones` WHERE idHabitacion = ? AND 'Disponibilidad' = true";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.getIdHabitacion());
            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "La habitacion no está disponible.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }

    public void agregarReserva(Reserva reserva, huesped huesped, habitaciones habitacion) {

        String sql = "INSERT INTO reservas (idReserva, idHuesped, cantidadPersonas, fechaEntrada, fechaSalida, importeTotal) VALUES (?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, huesped.getDNI());
            ps.setInt(2, habitacion.getIdHabitacion());
            ps.setInt(3, reserva.getCantP());
            //--------FECHA ENTRADA-SALIDA-----------------
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fechaEntrada = dateFormat.format(reserva.getFechaEntrada());
            String fechaSalida = dateFormat.format(reserva.getFechaSalida());
            
            Duration duracion = Duration.between(reserva.getFechaEntrada.atStartOfDay(), reserva.getFechaSalida.atStartOfDay());
            ps.setDate(4, java.sql.Date.valueOf(fechaEntrada));
            ps.setDate(5, java.sql.Date.valueOf(fechaSalida));
            ps.setDouble(6, habitacion.getPrecio() * duracion);
            
            
            

            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(null, "La habitacion no está disponible.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }
}
