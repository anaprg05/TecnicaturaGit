// TIPOS DE DATOS EN JAVASCRIPT
/*
    La sintáxis en lo que es comentarios, es muy similar a la de Java
    realmente diríamos que es idéntica.
*/
// Tipo String
var nombre = 'Ana Paula'; 
console.log(nombre);

// Tipo Numérico
var numero = 3000;
console.log(numero);

// Tipo Objeto
var objeto = {
    nombre : "Ana Paula",
    apellido : "Ríos Garín",
    telefono : "2321124564"
}
console.log(objeto);

// Tipo Booleano
var bandera = true;
console.log(bandera);

// Tipo Función (Permite reutilizar líneas de código)
function miFuncion(){}
console.log(miFuncion);

// Tipo Symbol
var simbolo = Symbol("Mi símbolo");
console.log(simbolo);

// Tipo Clase
class Persona{
	constructor(nombre, apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
}
console.log(Persona);

// Tipo Undefined
var x;
console.log(x);

x = undefined;
console.log(typeof x);

// null -> Ausencia de valor
var y = null; // null no es un tipo de dato, pero su origen es object.
console.log(typeof y);

// Tipo Array y Empty String
var autos = ['Citroen', 'Audi', 'BWM', 'Ford'];
console.log(autos);
console.log(typeof autos);

//Valores Vacíos
var z = '';
console.log(z);
console.log(typeof z);
