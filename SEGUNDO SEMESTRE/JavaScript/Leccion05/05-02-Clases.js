// Definición de clase -> utilizar palabra reservada 'class'
class Persona{
    // Definicón de constructor
    // Si no se define un constructor, JavaScript agrega 
    // uno vacío de forma automática
    constructor(nombre, apellido){
        // Inicialización de atributos
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

// Creación de objetos
let persona1 = new Persona('Ana', 'Ríos');
console.log(persona1);
let persona2 = new Persona('Lucas', 'Cerbino');
console.log(persona2);
