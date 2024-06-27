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

public class Jugador implements Entidad {
    private String nombre;
    private List<String> acciones;
    private Map<String, Sprite> sprites;
    private int vida;
    private int fuerza;

    public Jugador(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
        this.acciones = new ArrayList<>();
        this.sprites = new HashMap<>();
        configurarCaracteristicasBase();
    }

    @Override
    public void configurarCaracteristicasBase() {
        // Configurar características base para Jugador
    }

    @Override
    public void agregarAccion(String accion, Sprite sprite) {
        acciones.add(accion);
        sprites.put(accion, sprite);
    }

    @Override
    public void dibujar() {
        // Implementación para dibujar Jugador
    }

    @Override
    public void actualizar() {
        // Implementación para actualizar Jugador
    }
}
