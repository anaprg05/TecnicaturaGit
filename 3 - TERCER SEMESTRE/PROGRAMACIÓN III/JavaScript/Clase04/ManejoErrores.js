// Activación del modo estricto
'use strict';

/*
EJEMPLO DEL ERROR
    Variable no definida
x = 10;
    El console.log no se llegará a ver debido a que se encuentra bloqueada gracias a la variable sin definir.
console.log('Continuamos...');
*/

// Bloque try catch
try {
    let x = 10;
    // miFuncion();
    // Cláusula throw - Maneja tipo String
    throw 'Mi error';
}
// Catcheo del error
catch(error){
    console.log(typeof(error));
}
// Bloque finally (opcional)
finally{
    console.log('Termina la revisión de errores.');
}

// Gracias al try catch, la ejecución continúa sin problemas.
console.log('Continuamos...');

// Variable definida
let resultado = -5;
// Bloque try catch
try{
    // Variable no definida
    // y = 5;
    // If y Cláusula throw
    if(isNaN(resultado)) throw 'No es un número.';
    else if(resultado === '' ) throw 'Es una cadena vacía.';
    else if(resultado >= 0) throw 'Valor positivo.';
    else if(resultado <= 0) throw 'Valor negativo.';
}
catch(error){
    console.log(error);
    console.log(error.name);
    console.log(error.message);
}
// Bloque finally
finally{
    console.log('Termina la revisión de errores 2.');
}
