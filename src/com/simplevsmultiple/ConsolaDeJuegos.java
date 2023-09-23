package com.simplevsmultiple;

// Interfaz representativa de una consola de videojuegos.
// Describe las acciones básicas que cualquier consola de videojuegos debe tener.
public interface ConsolaDeJuegos {
    void encender();
    void apagar();
    void abrirJuego(int juego);
    void cerrarJuego();
    public void jugar();
    public void listarJuegos();
}
