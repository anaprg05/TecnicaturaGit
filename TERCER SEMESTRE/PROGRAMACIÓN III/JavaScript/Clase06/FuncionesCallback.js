// Función Callback
// Es una función que se pasa como parámetro de otra función, dentro de una función se podrá llamar a otra funnción.
// El objetivo de estas funciones es ser utilizadas para procesos que se ejecutan de manera asíncrona.

// Funciones básica
// Se puede aplicar el 'Hosting' (Cuando se pueded llamar las funciones antes de ser definidas).
miFuncion1();
miFuncion2();

// Creación de funciones
function miFuncion1(){
    console.log('Función 1');
}

function miFuncion2(){
    console.log('Función 2');
}

// Llamado a las funciones
// De acuerdo a cómo se llamen las funciones, será el orden (de forma descendente).
miFuncion1();
miFuncion2();

// Funciones Callback
// Creación de función básica
// Se puede asignar una función a una variable (let)
let imp = function imprimir(mensaje){
    console.log(mensaje);
}

// Creación de función callback (De argumento)
// 'funcionCallback' apunta a la función 'imprimir'
function sumar(op1, op2, funcionCallback){
    // Variable temporal
    let res = op1 + op2;
    funcionCallback(`Resultado: ${res}`);
}

// Llamado a la función
sumar(5, 3, imp);

// Llamadas Asíncronas con uso de la función setTimeout
// Procesos Síncronos -> Se ejecuta una línea a la vez, es decir, secuencialmente.
// Procesos Asíncronos -> Varios procesos que se ejecutan en paralelo.

// Función setTimeout -> 
// Permite iniciar una nueva tarea. Es decir que, al pasar una función Callback, cuando se cumpla cierto tiempo (establecido por el programador), se dispare dicha función Callback.
function miFuncionCallback(){
    console.log('Saludo asíncrono después de 3 segundos');
}

// setTimeout(variableReferencia, tiempo en milisegundos);
setTimeout(miFuncionCallback, 5000);
// setTimeout(funcionReferencia, tiempo en milisegundos);
setTimeout(function(){console.log('Saludo asíncrono 2')}, 3000);
// setTimeout(funcionFlecha, tiempo en milisegundos);
setTimeout(() => console.log('Saludo asíncrono 3'), 4000);
