/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import utils.Mensajes;

/**
 *
 * @author Carlos A
 */
public class Conexion {

    private final String URL = "jdbc:mysql://localhost:3306/recursoshumanos?serverTimezone=UTC";
    private final String USUARIO = "root";
    private final String PASSWORD = "Mvpemq100v";

    private Connection con;

    public Conexion() {
        try {
            this.con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            con.createStatement();
        } catch (SQLException ex) {
            Mensajes.mensajeError(ex.getMessage(), "Error De Conexión");
        }
    }
    
    

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    
}