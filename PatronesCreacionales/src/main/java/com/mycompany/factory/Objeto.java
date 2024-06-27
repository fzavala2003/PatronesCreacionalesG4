/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

import java.util.*;

/**
 *
 * @author zaval
 */
public class Objeto implements Entidad {
    private String nombre;
    private List<String> acciones;
    private Map<String, Sprite> sprites;
    private int peso;
    private String tipo;

    public Objeto(String nombre, int peso, String tipo) {
        this.nombre = nombre;
        this.peso = peso;
        this.tipo = tipo;
        this.acciones = new ArrayList<>();
        this.sprites = new HashMap<>();
        configurarCaracteristicasBase();
    }

    @Override
    public void configurarCaracteristicasBase() {
        // Configurar características base para Objeto
    }

    @Override
    public void agregarAccion(String accion, Sprite sprite) {
        acciones.add(accion);
        sprites.put(accion, sprite);
    }

    @Override
    public void dibujar() {
        // Implementación para dibujar Objeto
    }

    @Override
    public void actualizar() {
        // Implementación para actualizar Objeto
    }
}
