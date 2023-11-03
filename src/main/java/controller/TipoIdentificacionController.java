
package controller;

import dao.TipoIdentificacionDao;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import model.TipoIdentificacion;



/**
 *
 * @author Carlos A
 */
public class TipoIdentificacionController {
    
    private TipoIdentificacionDao tipoIdentificacionDao;

    public TipoIdentificacionController(TipoIdentificacionDao tipoIdentificacionDao) {
        this.tipoIdentificacionDao = tipoIdentificacionDao;
    }
    
    public DefaultComboBoxModel llenarSelector(){
        DefaultComboBoxModel selectorTipoID = new DefaultComboBoxModel();
        List<TipoIdentificacion> tiposID = tipoIdentificacionDao.findAll();
        for(TipoIdentificacion elem: tiposID){
            selectorTipoID.addElement(elem.getNombre());
        }
        return selectorTipoID;
    }
}