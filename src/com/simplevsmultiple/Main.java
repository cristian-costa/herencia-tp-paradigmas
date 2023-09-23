package com.simplevsmultiple;

public class Main {
	public static void main(String[] args) {
        NintendoSwitch miConsola = new NintendoSwitch();
		 
		// Enciendo
        miConsola.encender();
        System.out.println();
        
        // Veo que juegos tengo
        miConsola.listarJuegos();  // Mostramos los juegos disponibles
        System.out.println();

        // Abro juego
        miConsola.abrirJuego(0); // Abrimos juego con indice 1
        System.out.println();

        // Juego -> Disminuye bateria !
        miConsola.jugar();
        System.out.println();

        // Muestro bateria
        miConsola.mostrarBateria();
        System.out.println();

        // Subo brillo
        miConsola.subirBrillo(15);
        System.out.println();

        // Disminuyo brillo
        miConsola.disminuirBrillo(10);
        System.out.println();

        // Cierro el juego
        miConsola.cerrarJuego();
        System.out.println();
        
        // Copio un texto
        miConsola.copiar("Estudiar programacion un sabado me encanta (...)");
        System.out.println();

        // Pego un texto
        miConsola.pegar();
        System.out.println();
        
        // Info del dispositivo
        miConsola.mostrarInfo();
        System.out.println();

        // Apago consola.
        miConsola.apagar();
        System.out.println();
    }
}
