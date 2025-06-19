public class Persona {
    // Atributos
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    // Constructor Vacio
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    // Constructor con Parámetros
    public Persona(String nombre, String tel, String email){
        // Llamado al constructor vacio
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString


    @Override
    public String toString() {
        return "Persona{" +
                "id = " + id +
                ", nombre = '" + nombre + '\'' +
                ", tel = '" + tel + '\'' +
                ", email = '" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana Ríos", "6458853997", "arios@gmail.com");
        System.out.println(persona1);
    }
}
