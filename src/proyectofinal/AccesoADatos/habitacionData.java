package proyectofinal.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Categoria;
import proyectofinal.Entidades.habitaciones;

public class habitacionData {
    private Connection con= null;

    public habitacionData() {
        con= Conexion.getConexion();
    }
    
    public void agregarHabitacion(habitaciones habitaciones){
        String sql= "INSERT INTO habitaciones (Tipo, Disponibilidad) VALUES (?, ?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, habitaciones.getTipo());
            ps.setBoolean(2, habitaciones.isDisponible());
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            if(rs.next()){
                habitaciones.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitación Guardada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de habitaciones");
        }
    }
    
    public void cambiarPrecio(Categoria categoria){
        String sql= "UPDATE categoria SET precio WHERE codigo= ?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setDouble(1, categoria.getPrecio());
            int exito= ps.executeUpdate();
            if(exito== 1){
                JOptionPane.showMessageDialog(null, "Precio Modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        
    }
}
