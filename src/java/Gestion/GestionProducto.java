/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Controller.ConnectionDB;
import Model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JORDAN
 */
public class GestionProducto {
    static ConnectionDB connMySQL = new ConnectionDB();	
	static Statement s = null;
	static PreparedStatement ps = null;  
    public DefaultTableModel getAllProducts() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {
            Connection conn = connMySQL.setConeccion();   
            ResultSet rs;
            DefaultTableModel mo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
            };
            String[] columns = {"ID","Nombre","Imagen","Cantidad","Precio"};
            mo.setColumnIdentifiers(columns);
            Object[] fila = new Object[5];
            ps = conn.prepareStatement("select id_producto,Nombre,Imagen,Cantidad,Precio from Producto order by id_producto desc");		
		rs = ps.executeQuery();
		while (rs.next()) {
			fila[0] = rs.getInt(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getInt(4);
                        fila[4] = rs.getInt(5);
                        mo.addRow(fila);
                }
                conn.close();
            return mo;
    }
    public DefaultTableModel getProductsName(String name) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {
            Connection conn = connMySQL.setConeccion();   
            ResultSet rs;
            DefaultTableModel mo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
            };
            String[] columns = {"ID","Nombre","Imagen","Cantidad","Precio"};
            mo.setColumnIdentifiers(columns);
            Object[] fila = new Object[5];
            ps = conn.prepareStatement("select id_producto,Nombre,Imagen,Cantidad,Precio from Producto where nombre like ?;");	
            ps.setString(1, name + "%");
		rs = ps.executeQuery();
		while (rs.next()) {
			fila[0] = rs.getInt(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getInt(4);
                        fila[4] = rs.getInt(5);
                        mo.addRow(fila);
                }
                conn.close();
            return mo;
    }
    public DefaultTableModel getProductsPrice(int price) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {
            Connection conn = connMySQL.setConeccion();   
            ResultSet rs;
            DefaultTableModel mo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
            };
            String[] columns = {"ID","Nombre","Imagen","Cantidad","Precio"};
            mo.setColumnIdentifiers(columns);
            Object[] fila = new Object[5];
            ps = conn.prepareStatement("select id_producto,Nombre,Imagen,Cantidad,Precio from Producto where precio between 0 and ?;");	
            ps.setInt(1,price);
		rs = ps.executeQuery();
		while (rs.next()) {
			fila[0] = rs.getInt(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getInt(4);
                        fila[4] = rs.getInt(5);
                        mo.addRow(fila);
                }
            conn.close();
            return mo;
    }
    public Producto getProductsID(int ID) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {
            Connection conn = connMySQL.setConeccion();   
            ResultSet rs;     
            Producto p = null;
            ps = conn.prepareStatement("select id_producto,Nombre,Precio from Producto where id_producto = ?;");	
            ps.setInt(1,ID);
		rs = ps.executeQuery();
		while (rs.next()) {
			p = new Producto(rs.getInt(1),rs.getString(2),rs.getInt(3));
                }
                conn.close();
            return p;
    }
    public DefaultTableModel getProductsType(int Type) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {
            Connection conn = connMySQL.setConeccion();   
            ResultSet rs;
            DefaultTableModel mo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
            };
            String[] columns = {"ID","Nombre","Imagen","Cantidad","Precio"};
            mo.setColumnIdentifiers(columns);
            Object[] fila = new Object[5];
            ps = conn.prepareStatement("select id_producto,Nombre,Imagen,Cantidad,Precio from Producto where id_tipoproducto = ?;");	
            ps.setInt(1,Type);
		rs = ps.executeQuery();
		while (rs.next()) {
			fila[0] = rs.getInt(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getInt(4);
                        fila[4] = rs.getInt(5);
                        mo.addRow(fila);
                }
                conn.close();
            return mo;
    }
    public int getMin() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {
            Connection conn = connMySQL.setConeccion();   
            ResultSet rs;        
            int Min = 0;
            ps = conn.prepareStatement("select min(precio) from Producto;");	            
		rs = ps.executeQuery();
		while (rs.next()) {
			Min = rs.getInt(1);                        
                }
                conn.close();
            return Min;
    }
    public int getMax() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {
            Connection conn = connMySQL.setConeccion();   
            ResultSet rs;        
            int Max = 1000000;
            ps = conn.prepareStatement("select max(precio) from Producto;");	            
		rs = ps.executeQuery();
		while (rs.next()) {
			Max = rs.getInt(1);                        
                }
                conn.close();
            return Max;
    }
}
