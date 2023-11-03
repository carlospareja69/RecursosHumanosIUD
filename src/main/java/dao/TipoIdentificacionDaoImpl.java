/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import model.TipoIdentificacion;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.Mensajes;

/**
 *
 * @author Carlos A
 */
public class TipoIdentificacionDaoImpl implements TipoIdentificacionDao {

    private Conexion conexion;
    private Statement query;
    private ResultSet result;

    @Override
    public List<TipoIdentificacion> findAll() {
        List<TipoIdentificacion> tiposID = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tipos_identificaciones";
            conexion = new Conexion();
            query = conexion.getCon().createStatement();
            result = query.executeQuery(sql);

            while (result.next()) {
                TipoIdentificacion tipoIdentificacion = new TipoIdentificacion(
                        result.getInt("id"), result.getString("nombre"), result.getString("descripcion"));
                tiposID.add(tipoIdentificacion);
            }
            query.close();
            result.close();
            conexion.getCon().close();

        } catch (SQLException ex) {
            Mensajes.mensajeError(ex.getMessage(), "Error De Base De Datos");
        }
        return tiposID;
    }

}