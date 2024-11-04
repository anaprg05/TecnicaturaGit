// Creación clase hija
class Cliente extends Persona{
    // Definición método estático
    static contadorClientes = 0;

    // Definición constructor
    constructor(nombre, apellido, edad, fechaRegistro){
        // Llamado al constructor clase padre
        super(nombre, apellido, edad);
        
        this._idCliente = ++ Persona.contadorClientes;
        this._fechaRegistro = fechaRegistro;
    }

    // Método Get -> SOLO PARA EL ID
    get idCliente(){
        return this._idCliente;
    }

     // Método Get
     get fechaRegistro(){
        return this._fechaRegistro;
    }

    // Método Set
    set fechaRegistro(fechaRegistro){
        this._fechaRegistro = fechaRegistro;
    }

    toString(){
        // Concatenación de toString clase padre con toString clase hija
        // Método largo
        // return super.toString()+ ' ' + this._idCliente + ' ' + this._fechaRegistro;
        // Template String
        return `
        ${super.toString()}
        ${this._idCliente}
        ${this._fechaRegistro}`;
    }
}
