
console.log('Hola a toda la cohorte 2024');

// Iterador
var i = 0;

// Ejecución continua - que no termina nunca
setInterval(function(){
    // Dos argumentos: una función y cada cuánto tiempo (milisegundos) se ejecuta
    console.log(i);
    i++;

    // Generar error que se va a detectar en tiempo de ejecución
    /*
    if(i == 5){
        console.log('Forzamos un error.');
        var a = 3 + z;
    }
    */
}, 1000);
console.log('Segunda instrucción.');
