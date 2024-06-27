/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author zaval
 */
import java.util.*;
public class Enemigo implements Entidad {
    private String nombre;
    private List<String> acciones;
    private Map<String, Sprite> sprites;
    private String tipo;
    private int poder;

    public Enemigo(String nombre, String tipo, int poder) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
        this.acciones = new ArrayList<>();
        this.sprites = new HashMap<>();
        configurarCaracteristicasBase();
    }

    @Override
    public void configurarCaracteristicasBase() {
        // Configurar características base para Enemigo
    }

    @Override
    public void agregarAccion(String accion, Sprite sprite) {
        acciones.add(accion);
        sprites.put(accion, sprite);
    }

    @Override
    public void dibujar() {
        // Implementación para dibujar Enemigo
    }

    @Override
    public void actualizar() {
        // Implementación para actualizar Enemigo
    }
}
