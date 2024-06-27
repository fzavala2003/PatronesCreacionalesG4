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

public interface Entidad {
    void configurarCaracteristicasBase();
    void agregarAccion(String accion, Sprite sprite);
    void dibujar();
    void actualizar();
}