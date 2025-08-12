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

/*
POLIMORFISMO
    Capacidad de un objeto para tomar múltiples formas o comportarse de diferentes maneras según el contexto
    en el que se encuentra. 
*/
// Función que, según el 'tipo' que se le pase, es el tipo de información o escritura que se va a recibir.
function imprimir(tipo){
    console.log(tipo.obtenerDetalles());
    // Para saber con qué tipo de objeto se está trabajando, se utiliza 'instanceof'
    // Siempre es recomendable utilizar las jerarquías. Es decir, empezar con las clases Padre y seguir con las clases Hijas.
    if(tipo instanceof Gerente){
        console.log('Es un objeto tipo Gerente.');
        console.log(tipo._departamento);
    }
    else if(tipo instanceof Empleado){
        console.log('Es un objeto tipo Empleado.');
        console.log(tipo.departamento); // No existe en la clase padre.
    }
    // Clase Padre de todas las clases (Incluyendo la clase Padre.).
    else if (tipo instanceof Object){
        console.log('Es un objeto tipo Object.');
    }
}

// Creación de Instancias
// Clase Hija
let gerente1 = new Gerente('Lucas', 5000, 'Electrónica');
console.log(gerente1);

// Clase Padre
let empleado1 = new Empleado('Ana', 2000, 'Sistemas');
console.log(empleado1);

imprimir(gerente1);
imprimir(empleado1);
