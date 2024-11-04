// Creación clase hija
class Empleado extends Persona{
    // Definición método estático
    static contadorEmpleados = 0;

    // Definición constructor
    constructor(nombre, apellido, edad, sueldo){
        // Llamado al constructor clase padre
        super(nombre, apellido, edad);
        this._idEmpleado = ++ Persona.contadorEmpleados;
        this._sueldo = sueldo;
    }

    // Método Get -> SOLO PARA EL ID
    get idEmpleado(){
        return this._idEmpleado;
    }

    // Método Get
    get sueldo(){
        return this._sueldo;
    }

    // Método Set
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }

    toString(){
        // Concatenación de toString clase padre con toString clase hija
        // Método largo
        // return super.toString()+ ' ' + this._idEmpleado + ' ' + this._sueldo;
        // Template String
        return `
        ${super.toString()}
        ${this._idEmpleado}
        ${this._sueldo}`;
    }
}
