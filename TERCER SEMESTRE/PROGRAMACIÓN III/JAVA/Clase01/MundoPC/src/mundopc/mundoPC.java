// Clase de Pruebas
package mundopc;

// Importación de clases
import ar.com.system2024.mundopc.Monitor;
import ar.com.system2024.mundopc.Teclado;
import ar.com.system2024.mundopc.Raton;
import ar.com.system2024.mundopc.Computadora;
import ar.com.system2024.mundopc.Orden;

public class mundoPC {
    public static void main(String[] args) {
        // Definición de variables
        // Marca: HP
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        // Marca: Gamer
        Monitor monitorGamer = new Monitor("HP", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
    
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas: ", monitorHP, tecladoGamer, ratonHP);
        
        // Inicialización del arreglo vacío
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadorasVarias);
        orden2.mostrarOrden();
    }
}
