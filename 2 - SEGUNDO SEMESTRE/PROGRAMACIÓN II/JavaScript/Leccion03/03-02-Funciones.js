// Las funciones son códigos reutilizables y se pueden llamar tantas veces como sean necesarias para poder utilizarlas.
// Para definir una función se utiliza una sintáxis especial, utilizando la palabra reservada 'function'
// Una función puede o no tener parámetros dentro de los aprentesis. Al momento de ser llamada, dichos parámetros van a ser argumentos.
// HOISTING -> Se puede definir a una función en cualquier parte del programa y se puede llamar antes o después de definirla
// El primer llamado siempre será el primero en imprimirse
miFuncion(8, 2);

function miFuncion(a, b){
    //console.log("Sumamos: " + (a + b));
    // Palabra reservada Return
    // No es necesaria agregar la palabra porque js lo hace de manera automática en la última línea de la función
    // Puede retornar cualquier tipo de valor
    return a + b;
}

// Llamar a la función
miFuncion(5, 4);

// Si quitamos el return, el resultado de esta operación sería 'undefined'
let resultado = miFuncion(6, 7);
console.log(resultado);

// Funciones de tipo expresión o funciones anónimas
// Necesita cierre con punto y coma. Además, al llamarla se utiliza la variable y paréntesis.
let x = function(a, b){return a + b};
resultado = x(5, 6);
console.log(resultado);

// Funciones de tipo self e invoking (Anónima)
// Esta función no es reutilizable, al no tener una palabra asignada a la hora de llamarla, no se puede volver a llamar.
(function(a, b){
    console.log('Ejecutando la función: ' + (a + b))
})(9, 6);

// Tipos de datos en una función
// La función se puede manejar como tipo 'object'
// Propiedad arguments -> Permite saber cuántos argumentos fueron definidos en la función
// Esta propiedad no se puede utilizar fuera del bloque de código de la función
console.log(typeof miFuncion);

function miFuncion2(a, b){
    console.log(arguments);
    console.log(arguments.length);
}
miFuncion2(5, 7, 3, 6);

// toString
var miFuncionTexto = miFuncion2.toString();
console.log(miFuncionTexto);

// Funciones flecha (=>)
// Es similar a la funcion tipo expresión
// Como definir estas funciones
// Las funciones de tipo flecha no necesitan de la palabra function para ser definidas. Tampoco se utilizan llaves o la palabra return
const sumarFuncionFlecha = (a, b) => a + b;
resultado = sumarFuncionFlecha(3, 7);

console.log(resultado);

// Argumentos y parámetros
// A la hora de utilizarlos, se manejan de manera equivalente.
// Parámetros -> Las variables que van a recibir las funciones definidas. Es decir, la lista de variables que se definen en una función
// Argumentos -> Valores que se asignan a los parámetros. Es decir, los valores que el usuario pasa al llamar una función.
let sumar = function(a = 4, b = 8){
    // Muestra el parámetro de 'a'
    console.log(arguments[0]);
    // Muestra el parámetro de 'b'
    console.log(arguments[1])
    return a + b + arguments[2];
}

// Sobreescribe los valores puestos por default
resultado = sumar(3, 2, 9);
console.log(resultado)

// Concepto hoisting
// Sumar todos los argumentos
let respuesta = sumarTodo(5, 4, 13, 18, 9);
console.log(respuesta);

function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i];
    }
    return suma;
}

// PASO POR
//  Paso por valor -> Tipos que no son objetos (booleano, numérico), es decir, valores primitivos
// Las variables no sufre ningún cambio, solo pasó una copia, un valor.
// Tipos primitivos
let k = 10;
function cambiarValor(a){
    //Esta variable solo está declarada dentro del bloque de la función
    a = 20;
}
cambiarValor(k);

console.log(k);

//  Paso por referencia -> Al método o función se le pasan la referencia hexadecimal del espacio de memoria del objeto.
// Es necesario crear un objeto
const persona = {
    nombre: 'Juan',
    apellido: 'Lepez'
}
console.log(persona);

function cambiarValorObjeto(p1){
    // La variable p1 se destruirá al finalizar la función pero afectará permanentemente al objeto persona.
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}

cambiarValorObjeto(persona);
console.log(persona);
