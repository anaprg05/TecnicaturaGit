package enumeraciones;

// Creación de enum
public enum Continentes {
    AFRICA(54, "1.4 billones"),
    EUROPA(49, "741.6 millones"),
    ASIA(48, "4.773 millones"),
    AMERICA(35, "340.1 millones"),
    OCEANIA(14, "46.1 millones");
    
    // Definición de Atributos Encapsulados
    private final int paises;
    private final String habitantes;
    
    // Creación de Constructor
    Continentes (int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    // Método Get para recuperar los atributos encapsulados
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
