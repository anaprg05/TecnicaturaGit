// Hosting antes de crear la clase
// No se puede crear una variable, ya que no se puede 
// acceder a una clase sin haberla inicializado o definido 
// con anterioridad
// let persona3 = new Persona('Nelson', 'Ríos');

// Clase padre
// Definición de clase -> utilizar palabra reservada 'class'
class Persona{
    // Definicón de constructor
    // Si no se define un constructor, JavaScript agrega 
    // uno vacío de forma automática
    constructor(nombre, apellido){
        // Inicialización de atributos
        this._nombre = nombre;
        this._apellido = apellido;
    }

    // MÉTODOS SET Y GET
    // Las propiedades no pueden tener el mismo nombre que 
    // los atributos

    // Método Get
    // Leer la información del atributo
    get nombre(){
        return this._nombre;
    }

    // Método Set
    // Modificar valor del atributo
    set nombre(nombre){
        this._nombre = nombre;
    }

    // TAREA
    // Crear el método get y set para el atributo de apellido,
    // luego modificar el apellido a través del  set y mostrar
    // con un console.log lo que es el get donde muestra el 
    // resultado obtenido.
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

    // Definición de método
    nombreCompleto(){
        return this._nombre + ' ' + this._apellido;
    }

    // Método To String
    // Regresa un String
    // Sobreescribiendo el método de la clase padre (Object)
    toString(){
        // Se aplica el polimorfismo
        // Polimorfismo -> Múltiples formas en tiempo de ejecución
        // Puede llamar un método tanto de la clase padre
        //  como de la clase hija (depende de la referencia)
        return this.nombreCompleto();
    }
}

// Clase hija -> extiende de la clase padre
class Empleado extends Persona{
    // Definición de constructor
    constructor(nombre, apellido, departamento){
        // La primer línea de la clase hija se utiliza para 
        // llamar al constructor de la clase padre
        // super se accede a través del this y se utiliza 
        // para llamar al constructor de la clase padre
        super(nombre, apellido);
        // Inicialización de atributos
        this._departamento = departamento;
    }

    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }

    // Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto() + ', ' + this._departamento;
    }
}

// Creación de objetos
let persona1 = new Persona('Ana', 'Garín');
console.log(persona1.nombre);
console.log(persona1.apellido);

persona1.nombre = 'Paula';
persona1.apellido = 'Ríos';
console.log(persona1.nombre);
console.log(persona1.apellido);
// console.log(persona1)

let persona2 = new Persona('Lautaro', 'Ríos');
console.log(persona2.nombre);
console.log(persona2.apellido);

persona2.nombre = 'Lucas';
persona2.apellido = 'Cerbino';
console.log(persona2.nombre);
console.log(persona2.apellido);
// console.log(persona2)

let empleado1 = new Empleado('Nelson', 'Ríos', 'Matricería');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

// Métodos de la clase 'Object'
// Object.prototype
// Método toString
// Manera de acceder a atributos y métodos de manera dinámica
// Object.prototype.toString

// Método clase hija
console.log(empleado1.toString());
// Método clase padre
console.log(persona1.toString());
