package com.simplevsmultiple;

import java.util.ArrayList;
import java.util.List;

// Clase que representa a la consola NintendoSwitch.
// Esta clase implementa tanto la interfaz DispositivoTactilPortatil como la ConsolaDeJuegos,
// demostrando cómo Java soluciona el problema de la herencia múltiple usando interfaces.
public class NintendoSwitch implements ConsolaDeJuegos, DispositivoTactilPortatil {
	
    private int brillo = 50;
    private String juegoActual = null;
    private boolean encendida = false;
    private int bateria = 100;
    private String portapapeles = "";
    private List<String> juegosDisponibles = new ArrayList<>();
    
    public NintendoSwitch() {
        juegosDisponibles.add("Super Mario");
        juegosDisponibles.add("Zelda: Tears of the Kingdom");
        juegosDisponibles.add("Mario Kart 8");
        juegosDisponibles.add("Animal Crossing: New Horizons");
    }

    // encender() y apagar() son métodos compartidos entre ambas interfaces.
    // En una situación de herencia múltiple directa, decidir qué versión del método
    // usar (si hubiera diferentes implementaciones en las "clases padre")sería un problema. 
    // Java soluciona esto obligando a la clase que implementa las interfaces a proporcionar una única implementación.
    
    @Override
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("NintendoSwitch encendido.");
        } else {
            System.out.println("NintendoSwitch ya está encendido.");
        }
    }

    @Override
    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("NintendoSwitch apagado.");
        } else {
            System.out.println("NintendoSwitch ya está apagado.");
        }
    }
    
    @Override
    public void abrirJuego(int indiceJuego) {
        if (juegoActual == null) {
            if (indiceJuego >= 0 && indiceJuego < juegosDisponibles.size()) {
                juegoActual = juegosDisponibles.get(indiceJuego);
                System.out.println("Juego " + juegoActual + " abierto en NintendoSwitch.");
            } else {
                System.out.println("Índice de juego inválido.");
            }
        } else {
            System.out.println("Ya hay un juego en ejecución: " + juegoActual);
        }
    }

    @Override
    public void cerrarJuego() {
        if (juegoActual != null) {
            System.out.println("Juego " + juegoActual + " cerrado.");
            juegoActual = null;
        } else {
            System.out.println("No hay ningún juego en ejecución para cerrar.");
        }
    }
    
    @Override
    public void copiar(String texto) {
        portapapeles = texto;
        System.out.println("Texto copiado al portapapeles de NintendoSwitch.");
    }

    @Override
    public void pegar() {
        if (!portapapeles.isEmpty()) {
            System.out.println("Texto pegado desde el portapapeles: " + portapapeles);
        } else {
            System.out.println("El portapapeles está vacío.");
        }
    }

    @Override
    public void subirBrillo(int cantidad) {
        if (brillo + cantidad <= 100) {
            brillo += cantidad;
            System.out.println("Brillo aumentado a " + brillo + "% en NintendoSwitch.");
        } else {
            brillo = 100;
            System.out.println("El brillo ha sido ajustado al máximo (100%).");
        }
    }
    
    @Override
    public void disminuirBrillo(int cantidad) {
        if (brillo - cantidad >= 0) {
            brillo -= cantidad;
            System.out.println("Brillo disminuido a " + brillo + "% en NintendoSwitch.");
        } else {
            brillo = 0;
            System.out.println("El brillo ha sido ajustado al mínimo (0%).");
        }
    }
        
    @Override
    public void mostrarBateria() {
        System.out.println("Batería actual: " + bateria + "%");
    }
    
    @Override
    public void jugar() {
        if (juegoActual != null) {
            System.out.println("Jugando " + juegoActual + "...");
            bateria -= 5;
            if (bateria < 0) bateria = 0;
        } else {
            System.out.println("No hay ningún juego abierto para jugar.");
        }
    }
    
    @Override
    public void listarJuegos() {
        System.out.println("Juegos disponibles en NintendoSwitch:");
        for (int i = 0; i < juegosDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + juegosDisponibles.get(i));
        }
    }
}
