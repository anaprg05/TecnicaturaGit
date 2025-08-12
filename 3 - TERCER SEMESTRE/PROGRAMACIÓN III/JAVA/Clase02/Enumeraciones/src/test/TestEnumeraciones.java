package test;

import enumeraciones.Dias;
import enumeraciones.Continentes;

public class TestEnumeraciones {
    public static void main(String[] args) {
        // System.out.println("Día 1: " + Dias.LUNES);
        
        // Llamado al Método indicarDiaSemana 
        // indicarDiaSemana(Dias.LUNES);
        
        System.out.println("Continente No. 4: " + Continentes.AMERICA);
        System.out.println("No. de países en el 4to continente: " + Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to continente: " + Continentes.AMERICA.getHabitantes());
        
        // Llamado al Método indicarContinente
        indicarContinente(Continentes.AMERICA);
    }
    
    // Método indicarDiaSemana
    /*
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana.");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana.");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana.");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana.");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana.");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana.");
                break;
            case DOMINGO:
                System.out.println("Séptimo día de la semana.");
                break;
            default:
                System.out.println("Día ingresado inexistente.");
                break;
        }
    }
*/
    // Método indicarContinentes
    private static void indicarContinente(Continentes continentes){
        switch(continentes){
            case AFRICA:
                System.out.println("Primer continente.");
                System.out.println("Cantidad de países: " + Continentes.AFRICA.getPaises());
                System.out.println("Cantidad de habitantes: " + Continentes.AFRICA.getHabitantes());
                break;
            case EUROPA:
                System.out.println("Segundo continente.");
                System.out.println("Cantidad de países: " + Continentes.EUROPA.getPaises());
                System.out.println("Cantidad de habitantes: " + Continentes.EUROPA.getHabitantes());
                break;
            case ASIA:
                System.out.println("Tercer continente.");
                System.out.println("Cantidad de países: " + Continentes.ASIA.getPaises());
                System.out.println("Cantidad de habitantes: " + Continentes.ASIA.getHabitantes());
                break;
            case AMERICA:
                System.out.println("Cuarto continente.");
                System.out.println("Cantidad de países: " + Continentes.AMERICA.getPaises());
                System.out.println("Cantidad de habitantes: " + Continentes.AMERICA.getHabitantes());
                break;
            case OCEANIA:
                System.out.println("Quinto continente.");
                System.out.println("Cantidad de países: " + Continentes.OCEANIA.getPaises());
                System.out.println("Cantidad de habitantes: " + Continentes.OCEANIA.getHabitantes());
                break;
            default:
                System.out.println("El continente ingresado no existe.");
                break;
        }
    }
    
}
