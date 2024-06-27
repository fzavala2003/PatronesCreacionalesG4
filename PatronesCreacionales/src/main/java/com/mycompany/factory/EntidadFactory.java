/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author zaval
 */
public class EntidadFactory {
    public static Entidad crearEntidad(String tipo, String nombre, int... atributos) {
        switch (tipo.toLowerCase()) {
            case "jugador":
                return new Jugador(nombre, atributos[0], atributos[1]);
            case "enemigo":
                return new Enemigo(nombre, "tipo", atributos[0]);
            case "objeto":
                return new Objeto(nombre, atributos[0], "tipo");
            default:
                throw new IllegalArgumentException("Tipo de entidad desconocido: " + tipo);
        }
    }
}