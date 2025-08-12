// Hosting antes de crear la clase
// No se puede crear una variable, ya que no se puede 
// acceder a una clase sin haberla inicializado o definido 
// con anterioridad
// let persona3 = new Persona('Nelson', 'Ríos');

// Clase padre
// Definición de clase -> utilizar palabra reservada 'class'
class Persona{
    // Atributos estáticos
    // Definición de atributo perteneciente a la clase y no
    // a un objeto
    static contadorPersonas = 0;
    
    // Constantes estáticas
    // Método que simula una constante
    static get MAX_OBJ(){
        // Límite de creación de objetos 
        return 5;
    }

    // Atributo No Estático
    // Se asocia a los objetos
    // email = 'Valor default email';

    // Definicón de constructor
    // Si no se define un constructor, JavaScript agrega 
    // uno vacío de forma automática
    constructor(nombre, apellido){
        // Inicialización de atributos
        this._nombre = nombre;
        this._apellido = apellido;

        if (Persona.contadorPersonas < Persona.MAX_OBJ){
            // Cada vez que se instancie una nueva persona, el contador
            // incrementará y recibirá un ID único
            this.idPersona = ++ Persona.contadorPersonas;
            // console.log('Se incrementa el contador: ' + Persona.contadorObjetosPersona);
        }
        else{
            console.log('Se ha superado el máximo de objetos permitidos.')
        }
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
        return this.idPersona + '. ' +this._nombre + ' ' + this._apellido;
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

    // Método Static
    // La salida solo se verá en la consola
    static saludar(){
        console.log('Saludos desde este método static.');
    }

    // El método estático puede pasar como argumentos un objeto
    static saludar2(persona){
        console.log(persona.nombre + ' ' + persona.apellido);
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

// Un método estático se asocia a una clase pero no con los objetos
// Es decir, no se utiliza desde el objeto
// persona1.saludar();

// Los métodos estáticos se utilizan desde la clase
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

// Al ser un método estático, se tiene que llamar a través de
// la clase, no del objeto
// console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

// Los elementos estáticos no pueden acceder desde la clase, 
// pueden acceder desde los objetos de clase y los objetos 
// heredados
// console.log(persona1.email);
// console.log(empleado1.email);
// console.log(Persona.email);

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());

let persona3 = new Persona('Lautaro', 'Ríos');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
// Una constante estática no se puede modificar o
// alterar
// Persona.MAX_OBJ = 10;
console.log(Persona.MAX_OBJ);

let persona4 = new Persona('Ana', 'Garín');
console.log(persona4.toString());

let persona5 = new Persona('Milo', 'Ríos');
console.log(persona5.toString());
