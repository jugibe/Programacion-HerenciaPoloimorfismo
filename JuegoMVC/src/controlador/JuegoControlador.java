package controlador;

import modelo.JuegoModelo;
import vista.JuegoVista;
import vista.JuegoVistaVentana;

public class JuegoControlador {

    private JuegoModelo modelo;
    private JuegoVista vista; //  interface

    public JuegoControlador(JuegoModelo modelo, JuegoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarJuego() {
        vista.mostrarMensaje("🎮 Bienvenido al juego");

        boolean acertado = false;

        while (!acertado) {
            int intento = vista.pedirNumero();
            acertado = modelo.comprobarNumero(intento);

            if (acertado) {
                vista.mostrarMensaje("✅ ¡Correcto! Has ganado.");
            } else {
                vista.mostrarMensaje("❌ Incorrecto, intenta de nuevo.");
            }
        }
    }
}
