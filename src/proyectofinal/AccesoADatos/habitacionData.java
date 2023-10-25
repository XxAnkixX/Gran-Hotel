package proyectofinal.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Categoria;
import proyectofinal.Entidades.habitaciones;

public class habitacionData {

    private Connection con = null;

    public habitacionData() {
        con = Conexion.getConexion();
    }

    public void agregarHabitacion(habitaciones habitaciones) {
        String sql = "INSERT INTO habitaciones (Tipo, Disponibilidad) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitaciones.getTipo());
            ps.setBoolean(2, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                habitaciones.setIdHabitacion(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "Habitación Guardada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de habitaciones.");
        }
    }
    

    public void cambiarPrecio(Categoria categoria) {
        String sql = "UPDATE categoria SET precio WHERE codigo= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, categoria.getPrecio());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Precio Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }
    
    public habitaciones buscarHabitacionxID(int ID){
        String sql= "SELECT idHabitacion, tipo, Disponibilidad, precio FROM habitaciones WHERE idHabitacion= ?";
        habitaciones habitacion= null;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, ID);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                habitacion= new habitaciones();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setTipo(rs.getInt("tipo"));
                habitacion.setDisponible(rs.getBoolean("Disponibilidad"));
                habitacion.setPrecio(rs.getDouble("precio"));
            }else{
                JOptionPane.showMessageDialog(null, "No existe dicha habitacion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en acceder a la tabla");
        }
        return habitacion;
    }
    
    public List<habitaciones> listarHabitacionesDisponibles(){
        String sql= "SELECT idHabitacion, tipo, Disponibilidad, precio FROM habitaciones WHERE Disponibilidad= 1";
        ArrayList<habitaciones> listaHabitacion= new ArrayList<>();
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                habitaciones Habitacion= new habitaciones();
                Habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                Habitacion.setTipo(rs.getInt("tipo"));
                Habitacion.setDisponible(rs.getBoolean("Disponibilidad"));
                Habitacion.setPrecio(rs.getDouble("precio"));
                listaHabitacion.add(Habitacion);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return listaHabitacion;
    }

//  
    
}
