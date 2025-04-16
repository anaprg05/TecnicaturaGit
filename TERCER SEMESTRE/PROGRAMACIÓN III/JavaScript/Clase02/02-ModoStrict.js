/* 
Modo Strict o Concepto Estricto
    Permite declarar variables, así se evita la mala práctica.
    Para poder dar un uso correcto al modo estricto, quokka debe reiniciarse. Porque si no hay una variable declarada, puede ser pasado por alto.
*/

// Modo Estricto Global
'use strict';

// Declaración de variable.
// Puede utilizarse var, let, const, etc.
const x = 10;
console.log(x);

// Definición de una función.
function miFuncion(){
    // Se puede utilizar el 'use strict' dentro de una función. Pero solo afectará al bloque de la función.
    // 'use strict';
    let y = 20;
    console.log(y);
}
miFuncion();
