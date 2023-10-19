package proyectofinal.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.huesped;

public class huespedData {
    private Connection con= null;

    public huespedData() {
         con= Conexion.getConexion();
    }
    
    public void agregarHuesped(huesped huesped){
        String sql= "INSERT INTO huesped(dni, apellido, nombre, domicilio, correo, celular, estado) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, huesped.getDNI());
            ps.setString(2, huesped.getApellido());
            ps.setString(3, huesped.getNombre());
            ps.setString(4, huesped.getDomicilio());
            ps.setString(5, huesped.getMail());
            ps.setInt(6, huesped.getCelular());
            ps.setBoolean(7, huesped.getEstado());
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            
            if (rs.next()){
                huesped.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Huesped guardado");
            }
            ps.close();
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }
    
    public void modificarHuesped(huesped huesped){
        String sql= "UPDATE huesped SET domicilio, correo, celular WHERE dni= ?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1, huesped.getDomicilio());
            ps.setString(2, huesped.getMail());
            ps.setInt(3, huesped.getCelular());
            int exito= ps.executeUpdate();
            if(exito== 1){
                JOptionPane.showMessageDialog(null, "Huesped modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }
    
    public void eliminarHuesped(int dni){
        String sql= "UPDATE huesped SET estado= 0 WHERE dni= ?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1,dni);
            int exito= ps.executeUpdate();
            if(exito== 1){
                JOptionPane.showMessageDialog(null, "Huesped eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
    }
    
    public huesped buscarHuespedxDNI(int dni){
        String sql= "SELECT idHuesped, dni, apellido, nombre, domicilio, correo, celular FROM huesped WHERE dni= ? AND estado= 1";
        huesped Huesped= null;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs= ps.executeQuery();
            if (rs.next()){
                Huesped= new huesped();
                Huesped.setIdHuesped(rs.getInt("idAlumno"));
                Huesped.setDNI(dni);
                Huesped.setApellido(rs.getString("apellido"));
                Huesped.setNombre(rs.getString("nombre"));
                Huesped.setDomicilio(rs.getString("domicilio"));
                Huesped.setMail(rs.getString("correo"));
                Huesped.setCelular(rs.getInt("celular"));
                Huesped.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe el huesped con dicho DNI");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return Huesped;
    }
    
    public List<huesped> listarHuesped(){
        String sql= "SELECT idHuesped, dni, apellido, nombre, domicilio, correo, celular FROM huesped WHERE estado= 1";
        ArrayList<huesped> huespedes= new ArrayList<>();
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                huesped Huesped= new huesped();
                Huesped.setIdHuesped(rs.getInt("idHuesped"));
                Huesped.setDNI(rs.getInt("dni"));
                Huesped.setApellido(rs.getString("apellido"));
                Huesped.setNombre(rs.getString("nombre"));
                Huesped.setDomicilio(rs.getString("domicilio"));
                Huesped.setMail(rs.getString("correo"));
                Huesped.setCelular(rs.getInt("celular"));
                Huesped.setEstado(true);
                huespedes.add(Huesped);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return huespedes;
    }
}
