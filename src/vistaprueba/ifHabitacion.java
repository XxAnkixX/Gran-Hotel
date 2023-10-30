package vistaprueba;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import vistaprueba.AccesoADatos.Conexion;
import vistaprueba.AccesoADatos.huespedData;
import vistaprueba.Entidades.huesped;


public class ifHabitacion extends javax.swing.JInternalFrame {

    public ifHabitacion() {
        initComponents();
    }

//    private huespedData hData;
//    private ArrayList<huesped> listaH;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion conn = new Conexion();
    Connection con = conn.getConexion();
//    hData  = new huespedData();
//    DefaultTableModel model = (DefaultTableModel) jTableHabitaciones.getModel();

//         ------------------------agregar huespedes a la tabla-----------------------------------
    
        try {
            String sql = "SELECT * FROM habitaciones";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTableHabitaciones.getModel();

        while (rs.next()) {

            int idHabitacion = rs.getInt("idHabitacion");
            String categoria = rs.getString("Tipo");
            boolean disponibilidad = rs.getBoolean("Disponibilidad");
            double precio = rs.getDouble("Precio");
            model.addRow(new Object[]{rs.getInt("idHabitacion"), rs.getInt("tipo"),
                rs.getBoolean("Disponibilidad"), rs.getDouble("precio")});
        }
    } catch (SQLException ex) {
            System.out.println("errror en carga");
    }
}

//------------------------agregar categorias a comboBox-----------------------------------
try {
            String sql = "SELECT * FROM categoria";
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

//            jcbTablaHabitacion.addItem("Seleccione categoría");
        while (rs.next()) {
            jcbCategoria.addItem(rs.getString("idCategoria"));
        }
        rs.close();
    } catch (SQLException ex ){
            System.out.println(ex.toString());
    }
    //------------------------buscar x categoria en comboBox-----------------------------------
//usamos un RowFilter para filtrar los datos de la tabla según la categoría que pickeemos en el jcbox

    jcbCategoria.addActionListener ( new ActionListener() {
    
    public void actionPerformed(ActionEvent event) {

        String selectedCategory = jcbCategoria.getSelectedItem().toString();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTableHabitaciones.setRowSorter(sorter);
        if (selectedCategory.equals("Seleccione Categoría")) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter(selectedCategory));
        }
    }
}
);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHabitaciones = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jcbCategoria = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jTableHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "N° habitacion", "Tipo", "Disponibilidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableHabitaciones.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTableHabitacionesComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTableHabitaciones);

        jbModificar.setText("Modificar");

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoría" }));
        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jbModificar)
                .addGap(0, 119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
    }//GEN-LAST:event_jcbCategoriaActionPerformed

    private void jTableHabitacionesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTableHabitacionesComponentAdded

    }//GEN-LAST:event_jTableHabitacionesComponentAdded

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed

    
    }//GEN-LAST:event_jbAgregarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHabitaciones;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcbCategoria;
    // End of variables declaration//GEN-END:variables
}
