/* 
Sobreescritura
    Tiene que ver con la herencia de clases padre a clases hija, pero esta última agrega su propio comportamiento.
*/

// Clase Padre
class Empleado{
    // Constructor
    constructor(nombre, sueldo){
        this._nombre = nombre;
        this._sueldo = sueldo;
    }

    // Creación de Método
    obtenerDetalles(){
        return 'Empleado: nombre: ${this._nombre}, Sueldo: ${this.sueldo}';
    }
}

// Clase Hija
class Gerente extends Empleado{
    // Contructor
    constructor(nombre, sueldo, departamento){
        // Llamado a la Clase Padre
        super(nombre, sueldo);
        this._departamento = departamento;
    }

    // Sobreescritura del Método de la Clase Padre
    obtenerDetalles(){
        return 'Gerente: ${super.obtenerDetalles()}, depto: ${this._departamento}';
    }
}

// Creación de Instancias
// Clase Hija
let gerente1 = new Gerente('Lucas', 5000, 'Electrónica');
console.log(gerente1);

// Clase Padre
let empleado1 = new Empleado('Ana', 2000, 'Sistemas');
console.log(empleado1);
