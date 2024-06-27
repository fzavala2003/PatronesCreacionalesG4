/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory.singletone;

/**
 *
 * @author zaval
 */
public class ConfiguracionJuego {
    private static ConfiguracionJuego instancia;
    private int anchoPantalla;
    private int altoPantalla;
    private int memoriaRAMMinima;
    private int espacioDiscoMinimo;

    private ConfiguracionJuego() {
        // Valores por defecto
        this.anchoPantalla = 800;
        this.altoPantalla = 600;
        this.memoriaRAMMinima = 1024; // 1GB
        this.espacioDiscoMinimo = 512; // 512MB
    }

    public static synchronized ConfiguracionJuego getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionJuego();
        }
        return instancia;
    }

    public int getAnchoPantalla() {
        return anchoPantalla;
    }

    public void setAnchoPantalla(int anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
    }

    public int getAltoPantalla() {
        return altoPantalla;
    }

    public void setAltoPantalla(int altoPantalla) {
        this.altoPantalla = altoPantalla;
    }

    public int getMemoriaRAMMinima() {
        return memoriaRAMMinima;
    }

    public void setMemoriaRAMMinima(int memoriaRAMMinima) {
        this.memoriaRAMMinima = memoriaRAMMinima;
    }

    public int getEspacioDiscoMinimo() {
        return espacioDiscoMinimo;
    }

    public void setEspacioDiscoMinimo(int espacioDiscoMinimo) {
        this.espacioDiscoMinimo = espacioDiscoMinimo;
    }
}
