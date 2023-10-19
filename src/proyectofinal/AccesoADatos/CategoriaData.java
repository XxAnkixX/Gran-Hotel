package proyectofinal.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectofinal.Entidades.Categoria;

public class CategoriaData {
     //ArrayList<Double> precios = new ArrayList<>();
     private Connection con= null;

    public CategoriaData() {
        con= Conexion.getConexion();
    }
     
     

    
    /*public void cambiarPrecio (int i, double precio){
       precios.set(i, precio);
    }*/
    
    public void agregarCategoria(Categoria categoria){
        String sql= "INSERT INTO categoria(codigo, cantidadPersonas, cantidadCamas, tipoCama, precio) VALUES (?, ?, ?, ?, ?)";
         try {
             PreparedStatement ps= con.prepareStatement(sql);
             ps.setInt(1, categoria.getCodigo());
             ps.setInt(2, categoria.getMaxtP());
             ps.setInt(3, categoria.getCantC());
             ps.setInt(4, categoria.getTipoC());
             ps.setDouble(5, categoria.getPrecio());
             ps.executeUpdate();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
         }
    }
    
    

    //TIPO DE CAMA: 1=ESTANDAR
    //TIPO DE CAMA: 2=QUEEN
    //TIPO DE CAMA: 3=KING
    //idCategoria= X(cantidad de personas) Y(cantidad de camas) Z(tipo de cama)
    //---------------Habitaciones Simples--------------------------
    /*Categoria A = new Categoria(211, 2, 1, 1, precios.get(0));
    Categoria B = new Categoria(221, 2, 2, 1, precios.get(1));
    Categoria C = new Categoria(212, 2, 1, 2, precios.get(2));
    //---------------Habitaciones Dobles--------------------------
    Categoria D = new Categoria(421, 4, 2, 1, precios.get(3));
    Categoria E = new Categoria(422, 4, 2, 2, precios.get(4));
    Categoria F = new Categoria(441, 4, 4, 1, precios.get(5));
    //---------------Habitaciones Triples--------------------------
    Categoria G = new Categoria(631, 6, 3, 1, precios.get(6));
    Categoria H = new Categoria(632, 6, 3, 2, precios.get(7));
    Categoria I = new Categoria(661, 6, 6, 1, precios.get(8));
    //---------------Suite Lujo--------------------------
    Categoria J = new Categoria(213, 2, 1, 3, precios.get(9));
    Categoria K = new Categoria(223, 2, 2, 3, precios.get(10));*/

//categorias: estandar simple, doble, triple y Suite Lujo
    // public void cambiarPrecio();
}
