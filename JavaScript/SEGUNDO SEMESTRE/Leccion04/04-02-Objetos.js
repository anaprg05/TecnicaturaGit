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
    // Agregar métodos a los objetos
    nombreCompleto: function(){
        // this apunta a una variable/objeto que se está trabajando dentro del mismo bloque
        return this.nombre + ' ' + this.apellido;
    },
    datosExtra: function(){
        return this.email + ' - ' + this.edad;
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
