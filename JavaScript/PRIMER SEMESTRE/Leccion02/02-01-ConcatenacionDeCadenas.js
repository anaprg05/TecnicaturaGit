var nombre = 'Sebastián';
var apellido = 'Rodriguez';
var nombreCompleto = nombre + ' ' + apellido; // Primera concatenación.
console.log(nombreCompleto);

var nombreCompleto2 = 'Ana' + ' ' + 'Garín'; // Segunda concatenación.
console.log(nombreCompleto2);

var juntos = nombre + 219; // Lee de izq. a der. siguiendo la cadena, lee el núm como string.
console.log(juntos);

juntos = nombre + 78 + 17;
console.log(juntos);

juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; // Tercera concatenación usando el operador simplificado.
console.log(nombre);

// Let y Const
let nombre2 = "Lucas";
console.log(nombre2);

const apellido2 = "Cerbino"; //Constante que no puede ser modificada.
console.log(apellido2);

let x, y; //Se pueden crear varias variables dentro de una misma línea.
x = 17, y = 21; //Se pueden asignar varias variables dentro de una misma línea.
let z = x + y; //Se asigna el valor de la operación.

console.log(z);

//Los símbolos permiten la creación de variables con un número al inicio o palabras reservadas, ya que no se puede.
let $1num = 31; 
let _break = "rompimiento";

console.log($1num);
console.log(_break);


