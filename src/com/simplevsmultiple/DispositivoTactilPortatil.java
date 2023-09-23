package com.simplevsmultiple;

// Interfaz representativa de un dispositivo táctil portátil.
// Describe las acciones básicas que cualquier dispositivo táctil portátil debe tener.
public interface DispositivoTactilPortatil {
    void encender();
    void apagar();
    void copiar(String texto );
    void pegar();
    void subirBrillo(int cantidad);
    public void disminuirBrillo(int cantidad);
    public void mostrarBateria();
    
    // A partir de Java 8 las interfaces pueden tomar metodos por defecto, ejemplo:
    default void mostrarInfo() {
        System.out.println("Este es un dispositivo táctil portátil.");
    }
}
