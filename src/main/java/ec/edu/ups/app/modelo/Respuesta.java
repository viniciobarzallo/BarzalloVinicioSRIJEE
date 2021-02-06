/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.app.modelo;

import java.io.Serializable;

/**
 *
 * @author vinny
 */
public class Respuesta implements Serializable {

    private static final long serialVersionUID = 1L;

    private int codigo;
    private String mensaje;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Respuesta [codigo=" + codigo + ", mensaje=" + mensaje + "]";
    }
}
