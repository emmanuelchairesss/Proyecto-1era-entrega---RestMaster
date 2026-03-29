/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.restmaster;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Edith Ramirez
 */

public class GestorMesas {
    private Map<String, Mesa> mesas;

    public GestorMesas() {
        mesas = new HashMap<>();
    }

    public void agregarMesa(String idMesa, String estado) {
        mesas.put(idMesa, new Mesa(idMesa, estado));
    }

    public Mesa getMesaSeleccionada(String idMesa) {
        return mesas.get(idMesa);
    }

    public boolean esMesaReservada(String idMesa) {
        return mesas.containsKey(idMesa) && mesas.get(idMesa).getEstado().equals("reservada");
    }

    public void actualizarEstadoMesa(String idMesa, String nuevoEstado) {
        if (mesas.containsKey(idMesa)) {
            mesas.get(idMesa).setEstado(nuevoEstado);
        }
    }

}
