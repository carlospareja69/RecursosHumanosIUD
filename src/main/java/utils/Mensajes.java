/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utils;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos A
 */
public interface Mensajes {
    
    public static void mostrarMensaje(String msg, String titulo, int tipo){
        JOptionPane.showMessageDialog(null, msg, titulo, tipo);
    }
    
    public static void mensajeError(String msg, String titulo){
        mostrarMensaje(msg, titulo, JOptionPane.ERROR_MESSAGE);
        
    }

    public static boolean mensajeConfirm(String msg, String titulo) {
        JOptionPane jp = new JOptionPane();
        return jp.showConfirmDialog(null, titulo, msg, jp.YES_NO_OPTION) == jp.YES_OPTION;
    }

}