/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author saita
 */
public class ColeccionVentas {

    private ArrayList<Venta> base;

    public ColeccionVentas() {
        this.base = new ArrayList<>();
    }

    public ArrayList<Venta> Listar() {
        return this.base;
    }

    public boolean Agregar(Venta venta) {
        return this.base.add(venta);
    }

    public boolean Modificar(Venta venta) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(venta.getCodigo())) {
                this.base.get(i).setCodigo(venta.getCodigo());
                this.base.get(i).setPrecio(venta.getPrecio());
                this.base.get(i).setCantidad(venta.getCantidad());
                return true;
            }
        }
        return false;
    }

    public boolean Eliminar(String codigo) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(codigo)) {
                this.base.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public int SubTotal(String codigo) {
        for (int i = 0; i < base.size(); i++) {
            if (base.get(i).getCodigo().equals(codigo)) {
                return base.get(i).getPrecio()*base.get(i).getCantidad();
            }
        }
        return 0;
    }
}
