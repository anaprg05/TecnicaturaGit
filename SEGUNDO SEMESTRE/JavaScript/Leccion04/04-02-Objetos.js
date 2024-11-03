// Variable tipo primitiva
let x = 10;
console.log(x.lenght);

// Diferentes formas de crear un Objeto
// Forma más utilizada
let persona = {
    // Llaves (objeto en memoria): Referencia
    nombre: 'Carlos',
    apellido: 'Gil',
    email: 'cgil@gmail.com',
    edad: 30,
    idioma: 'es',
    get lang(){
        // toUpperCase() -> Convierte todos los caracteres alfabéticos en un 
        //              String para convertirlos a mayúscula
        return this.idioma.toUpperCase();
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    // Agregar métodos a los objetos
    nombreCompleto: function(){
        // this apunta a una variable/objeto que se está trabajando dentro del mismo bloque
        return this.nombre + ' ' + this.apellido;
    },
    datosExtra: function(){
        return this.email + ' - ' + this.edad;
    },
    get nombreEdad(){
        return 'El nombre es: '+this.nombre+', la edad es: '+this.edad;
    }
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);

console.log(persona.nombreCompleto());
console.log(persona.datosExtra());

// Segunda forma - palabra reservada new
// Debe crear un nuevo objeto en memoria
let persona2 = new Object();

persona2.nombre = 'Juan';
persona2.direccion = 'Salada 14';
persona2.telefono = '12455438993';

console.log(persona2.telefono);

// Cómo acceder a las propiedades de los Objetos
// Acceder como si fuera un arreglo. Se puede utilizar un for especial llamado 'for in'
console.log(persona['apellido']);

// for in
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('Cambiamos y eliminamos un error.')

// Agregar y eliminar propiedades de los Objetos
// Cambiar dinámicamente el valor de un objeto - Puede generar errores ya que si se escribe mal la propiedad, se generará un nuevo objeto
// Para eliminar el objeto que no es necesario se utiliza la palabra delete
delete persona.apeliidos; // Genera un nuevo objeto
persona.apeliido = 'Ríos';
console.log(persona);

// Ejecutamos desde el navegador
// Crear archivo html, vincularlo al archivo js y utilizar la consola para ver lo escrito en js

// Distintas formas de imprimir un Objeto con: Object.values()  y JSON.stringify()
// Primera: La más sencilla - Concatenar cada valor de la propiedad
console.log('Distintas formas de imprimir un objeto - Forma 1');
console.log(persona.nombre + ' ' + persona.apellido);

// Segunda: A través de un ciclo 'for in'
console.log('Distintas formas de imprimir un objeto - Forma 2');
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

// Tercera: La función Object.values()
console.log('Distintas formas de imprimir un objeto - Forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

// Cuarta: Método JSON.stringify
console.log('Distintas formas de imprimir un objeto - Forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);

// Métodos get y set
// Formas de llamar a una función

// Método Get
// Get -> Obtener
// Permite acceder a los valores de las propiedades
console.log('Comienza el uso del método get');
console.log(persona.nombreEdad);

console.log('Comienza el uso del método get para idiomas');
console.log(persona.lang);

// Método Set
// Set -> Establecer o Modificar
// Permite modificar a los valores de los atributos de los objetos

console.log('Comienza el uso del método get y set para idiomas');
persona.lang = 'en';
console.log(persona.lang);

// Constructores de objetos
// Es un método para la creación de objetos
// Es una función especial que se llama a través de la palabra reservada 'new' para reservar
// espacio en la memoria del objeto que se va a crear

// Definición de una función
// Es recomendable que las funciones se creen con mayúscula
// Dentro de lo que es el constructor, se puede hacer una pre-asignación
function Persona3(nombre, apellido, email){ // Constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    // Agregar métodos al constructor del objeto
    this.nombreCompleto = function(){
        return this.nombre+' '+this.apellido;
    }
}

let padre = new Persona3('Mercedes', 'Atim', 'atimmer@gmail.com');
// padre.nombre = 'Francisco'; <- se puede modificar sin problemas
padre.telefono = '54 11 1325-5643'; // Propiedad exclusiva del objeto padre
console.log(padre);
console.log(padre.nombreCompleto());

let madre = new Persona3('Francisca', 'Ríos', 'panchita@gmai.com');
console.log(madre);
console.log(madre.telefono); // La propiedad no está definida
console.log(madre.nombreCompleto());

// Distintas formas de crear objetos
// 1. Caso Objeto - Sintaxis formal
let miObjeto1 = new Object();
// 2. Caso Objeto - Sintaxis simplificada y recomendada
let miObjeto2 = {};

// 1. Caso String - Sintaxis formal
// let miCadena1 = new('Hola');
// 2. Caso String - Sintaxis simplificada y recomendada
let miCadena2 = 'Hola';

// 1. Caso con Números - Sintaxis formal (No recomendable)
let miNumero = new Number(1);
// 2. Caso con Números - Sintaxis recomendada
let miNumero2 = 1;

// 1. Caso Booleano - Sintaxis formal
let miBoolean = new Boolean(false);
// 2. Caso Booleano - Sintaxis recomendada
let miBoolean2 = false;

// 1. Caso Arreglos - Sintaxis formal
let miArreglo1 = new Array();
// 2. Caso Arreglos - Sintaxis recomendada
let miArreglo2 = [];

// 1. Caso Funciones - Todo después de new es considerado objeto
let miFuncion1 = new function(){};
// 2. Caso Funciones - Sintaxis simplificada y recomendada
let miFuncion2 = function(){};

// El uso de prototype
Persona3.prototype.telefono = '54 11 4321-0098';
console.log(padre);
console.log(madre.telefono);
madre.telefono = '54 11 3243-7653';
console.log(madre.telefono);

// El uso de call
// Permite llamar a un método desde un objeto que se encuentra dentro de otro objeto
let persona2 = {
    nombre: 'Lucas',
    apellido: 'Cerbino',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': '+this.nombre+' '+this.apellido+', '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona3 = {
    nombre: 'Ana',
    apellido: 'Ríos'
}
console.log(persona2.nombreCompleto2('Técnico', '54 11 2344-3870'));
console.log(persona2.nombreCompleto2.call(persona3, 'Técnica', '54 11 5642-6754'));

// El uso de apply
// Permite llamar a un método desde un objeto que no tiene definido cierto método
let arreglo = ['Técnica', '54 11 5642-6754'];
console.log(persona2.nombreCompleto2.apply(persona3, arreglo));

