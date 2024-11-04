// Creación clase padre
class Persona{
    // Definición método estático
    static contadorPersonas = 0;

    // Definición constructor
    constructor(nombre, apellido, edad){
        this._idPersona = ++ Persona.contadorPersonas;
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }

    // Método Get -> SOLO PARA EL ID
    get idPersona(){
        return this._idPersona;
    }

    // Método Get
    get nombre(){
        return this._nombre;
    }

    // Método Set
    set nombre(nombre){
        this._nombre = nombre;
    }

    // Método Get
    get apellido(){
        return this._apellido;
    }

    // Método Set
    set apellido(apellido){
        this._apellido = apellido;
    }
    
    // Método Get
    get edad(){
        return this._edad;
    }

    // Método Set
    set edad(edad){
        this._edad = edad;
    }

    toString(){
        // Método largo
        // return this._idPersona + ' ' + this._nombre + ' ' + this._apellido + ' ' + this._edad;
        // Template String -> Concatena cadenas
        // Esta forma se imprimirá de forma vertical u horizontal, dependiendo de cómo esté escrito
        return `
        ${this._idPersona}
        ${this._nombre}
        ${this._apellido}
        ${this._edad}`;
    }
}
