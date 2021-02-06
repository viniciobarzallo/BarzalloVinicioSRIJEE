/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.app.modelo;

/**
 *
 * @author vinny
 */
public class ParametrosFactura {

    private ClienteFactura cliente;
    private RecargaFactura recarga;

    public ClienteFactura getCliente() {
        return cliente;
    }

    public void setCliente(ClienteFactura cliente) {
        this.cliente = cliente;
    }

    public RecargaFactura getRecarga() {
        return recarga;
    }

    public void setRecarga(RecargaFactura recarga) {
        this.recarga = recarga;
    }
}
